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
public class SprStudent implements Serializable {

    private Long id;
    private String fio;
    private SprGroup sprGroup;
    private SprTypeUch sprTypeUch;
    private List<Posesh> poseshList;

    public SprStudent() {
    }

    public SprStudent(Long id, String fio, SprGroup sprGroup, SprTypeUch sprTypeUch, List<Posesh> poseshList) {
        this.id = id;
        this.fio = fio;
        this.sprGroup = sprGroup;
        this.sprTypeUch = sprTypeUch;
        this.poseshList = poseshList;
    }

    public SprStudent(long id, String fio, SprGroup sprGroup, SprTypeUch sprTypeUch) {
        this.id = id;
        this.fio = fio;
        this.sprGroup = sprGroup;
        this.sprTypeUch = sprTypeUch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public SprGroup getSprGroup() {
        return sprGroup;
    }

    public void setSprGroup(SprGroup sprGroup) {
        this.sprGroup = sprGroup;
    }

    public SprTypeUch getSprTypeUch() {
        return sprTypeUch;
    }

    public void setSprTypeUch(SprTypeUch sprTypeUch) {
        this.sprTypeUch = sprTypeUch;
    }

    public List<Posesh> getPoseshList() {
        return poseshList;
    }

    public void setPoseshList(List<Posesh> poseshList) {
        this.poseshList = poseshList;
    }

    @Override
    public String toString() {
        return "SprStudent{" + "id=" + id + ", fio=" + fio + ", sprGroup=" + sprGroup + ", sprTypeUch=" + sprTypeUch + ", poseshList=" + poseshList + '}';
    }
}
