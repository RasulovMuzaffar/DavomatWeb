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
public class SprFaculty implements Serializable{

    private Long id;
    private String name;
    private List<SprGroup> listSprGroup;

    public SprFaculty() {
    }

    public SprFaculty(Long id, String name, List<SprGroup> listSprGroup) {
        this.id = id;
        this.name = name;
        this.listSprGroup = listSprGroup;
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

    public List<SprGroup> getListSprGroup() {
        return listSprGroup;
    }

    public void setListSprGroup(List<SprGroup> listSprGroup) {
        this.listSprGroup = listSprGroup;
    }

    @Override
    public String toString() {
        return "SprFaculty{" + "id=" + id + ", name=" + name + ", listSprGroup=" + listSprGroup + '}';
    }
}
