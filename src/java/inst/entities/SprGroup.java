/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inst.entities;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Muzaffar
 */
public class SprGroup implements Serializable{
    private Long id;
    private String name;
    private SprFaculty sprFaculty;
    private List<SprStudent> listSprStud;
    private List<Grafik> listGrafik;

    public SprGroup() {
    }

    public SprGroup(Long id, String name, SprFaculty sprFaculty, List<SprStudent> listSprStud, List<Grafik> listGrafik) {
        this.id = id;
        this.name = name;
        this.sprFaculty = sprFaculty;
        this.listSprStud = listSprStud;
        this.listGrafik = listGrafik;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SprFaculty getSprFaculty() {
        return sprFaculty;
    }

    public void setSprFaculty(SprFaculty sprFaculty) {
        this.sprFaculty = sprFaculty;
    }

    public List<SprStudent> getListSprStud() {
        return listSprStud;
    }

    public void setListSprStud(List<SprStudent> listSprStud) {
        this.listSprStud = listSprStud;
    }

    public List<Grafik> getListGrafik() {
        return listGrafik;
    }

    public void setListGrafik(List<Grafik> listGrafik) {
        this.listGrafik = listGrafik;
    }

    @Override
    public String toString() {
        return "SprGroup{" + "id=" + id + ", name=" + name + ", sprFaculty=" + sprFaculty + ", listSprStud=" + listSprStud + ", listGrafik=" + listGrafik + '}';
    }
}
