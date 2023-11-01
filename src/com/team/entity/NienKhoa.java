package com.team.entity;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class NienKhoa {

    private int id;
    private String tenNienKhoa;
    private int namBatDau;
    private int namKetThuc;

    public NienKhoa() {
    }

    public NienKhoa(String tenNienKhoa, int namBatDau, int namKetThuc) {
        this.tenNienKhoa = tenNienKhoa;
        this.namBatDau = namBatDau;
        this.namKetThuc = namKetThuc;
    }

    public NienKhoa(int id, String tenNienKhoa, int namBatDau, int namKetThuc) {
        this.id = id;
        this.tenNienKhoa = tenNienKhoa;
        this.namBatDau = namBatDau;
        this.namKetThuc = namKetThuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNienKhoa() {
        return tenNienKhoa;
    }

    public void setTenNienKhoa(String tenNienKhoa) {
        this.tenNienKhoa = tenNienKhoa;
    }

    public int getNamBatDau() {
        return namBatDau;
    }

    public void setNamBatDau(int namBatDau) {
        this.namBatDau = namBatDau;
    }

    public int getNamKetThuc() {
        return namKetThuc;
    }

    public void setNamKetThuc(int namKetThuc) {
        this.namKetThuc = namKetThuc;
    }
}
