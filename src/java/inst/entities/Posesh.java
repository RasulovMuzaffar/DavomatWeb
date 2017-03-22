/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inst.entities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Muzaffar
 */
public class Posesh implements Serializable{

    private Long id;
    private Date nedelya;
    private int propusk;
    private int uvProp;
    private SprStudent sprStudent;

    public Posesh() {
    }

    public Posesh(Long id, Date nedelya, int propusk, int uvProp, SprStudent sprStudent) {
        this.id = id;
        this.nedelya = nedelya;
        this.propusk = propusk;
        this.uvProp = uvProp;
        this.sprStudent = sprStudent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getNedelya() {
        return nedelya;
    }

    public void setNedelya(Date nedelya) {
        this.nedelya = nedelya;
    }

    public int getPropusk() {
        return propusk;
    }

    public void setPropusk(int propusk) {
        this.propusk = propusk;
    }

    public int getUvProp() {
        return uvProp;
    }

    public void setUvProp(int uvProp) {
        this.uvProp = uvProp;
    }

    public SprStudent getSprStudent() {
        return sprStudent;
    }

    public void setSprStudent(SprStudent sprStudent) {
        this.sprStudent = sprStudent;
    }

    @Override
    public String toString() {
        return "Posesh{" + "id=" + id + ", nedelya=" + nedelya + ", propusk=" + propusk + ", uvProp=" + uvProp + ", sprStudent=" + sprStudent + '}';
    }
}
