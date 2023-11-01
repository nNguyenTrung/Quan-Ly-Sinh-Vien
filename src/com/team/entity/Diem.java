package com.team.entity;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class Diem {
    private int sinhVien;
    private int monHoc;
    private double diem;

    public Diem() {
    }

    public Diem(int sinhVien, int monHoc, double diem) {
        this.sinhVien = sinhVien;
        this.monHoc = monHoc;
        this.diem = diem;
    }

    public int getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(int sinhVien) {
        this.sinhVien = sinhVien;
    }

    public int getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(int monHoc) {
        this.monHoc = monHoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

}
