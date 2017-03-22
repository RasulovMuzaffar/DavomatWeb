/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inst.dao;

import inst.db.ConnDB;
import inst.entities.SprGroup;
import inst.entities.SprStudent;
import inst.entities.SprTypeUch;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muzaffar
 */
public class SprStudentDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    Statement st = null;

    public List getStudents() {
        ResultSet rs = null;
        SprStudent std = null;
        List listStd = new ArrayList();
//        Connection conn = null;

        String sql = "select id, fio, id_group, id_type from spr_student";
        ConnDB connDB = new ConnDB();
        try {
            conn = connDB.getConn();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                std = new SprStudent(rs.getLong("id"), rs.getString("fio"),
                        rs.getObject("id_group", SprGroup.class), rs.getObject("id_type", SprTypeUch.class));
                listStd.add(std);
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException SprStDAO " + ex);
        } catch (SQLException ex) {
            System.out.println("SQLException SprStDAO " + ex);
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                System.out.println("проблема с закрытием ps");
            }
            ps = null;
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println("проблема с закрытием rs");
            }
            rs = null;
            connDB.closeConn(conn);
        }
        return listStd;
    }
}
