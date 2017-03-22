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
public class SprTypeUch implements Serializable{

    private Long id;
    private String typeName;
    private List<SprStudent> listSprStud;

    public SprTypeUch() {
    }

    public SprTypeUch(Long id, String typeName, List<SprStudent> listSprStud) {
        this.id = id;
        this.typeName = typeName;
        this.listSprStud = listSprStud;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<SprStudent> getListSprStud() {
        return listSprStud;
    }

    public void setListSprStud(List<SprStudent> listSprStud) {
        this.listSprStud = listSprStud;
    }

    @Override
    public String toString() {
        return "SprTypeUch{" + "id=" + id + ", typeName=" + typeName + ", listSprStud=" + listSprStud + '}';
    }
}
