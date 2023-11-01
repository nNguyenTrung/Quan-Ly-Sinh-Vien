package com.team.entity;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class LopHoc {

    private int id;
    private String tenLop;
    private int gvcn;

    public LopHoc() {
    }

    public LopHoc(String tenLop, int gvcn) {
        this.tenLop = tenLop;
        this.gvcn = gvcn;
    }

    public LopHoc(int id, String tenLop, int gvcn) {
        this.id = id;
        this.tenLop = tenLop;
        this.gvcn = gvcn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getGvcn() {
        return gvcn;
    }

    public void setGvcn(int gvcn) {
        this.gvcn = gvcn;
    }
}
