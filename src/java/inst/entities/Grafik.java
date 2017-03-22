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
public class Grafik implements Serializable{
    private Long id;
    private int semester;
    private int kurs;
    private Date pervayaNedel;
    private int weeks;
    private SprGroup sprGroup;

    public Grafik() {
    }

    public Grafik(Long id, int semester, int kurs, Date pervayaNedel, int weeks, SprGroup sprGroup) {
        this.id = id;
        this.semester = semester;
        this.kurs = kurs;
        this.pervayaNedel = pervayaNedel;
        this.weeks = weeks;
        this.sprGroup = sprGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public Date getPervayaNedel() {
        return pervayaNedel;
    }

    public void setPervayaNedel(Date pervayaNedel) {
        this.pervayaNedel = pervayaNedel;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public SprGroup getSprGroup() {
        return sprGroup;
    }

    public void setSprGroup(SprGroup sprGroup) {
        this.sprGroup = sprGroup;
    }

    @Override
    public String toString() {
        return "Grafik{" + "id=" + id + ", semester=" + semester + ", kurs=" + kurs + ", pervayaNedel=" + pervayaNedel + ", weeks=" + weeks + ", sprGroup=" + sprGroup + '}';
    }
}
