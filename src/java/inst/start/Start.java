/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inst.start;

import inst.dao.SprStudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Muzaffar
 */
public class Start extends HttpServlet {
private static final String CONTENT_TYPE = "text/html; charset=utf-8";

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        SprStudentDAO ssd = new SprStudentDAO();
        List<SprStudentDAO> st =  ssd.getStudents();
        System.out.println(""+ssd.getStudents().getClass());
    
//        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
