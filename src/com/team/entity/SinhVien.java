package com.team.entity;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class SinhVien {

    private int id;
    private String hoTen;
    private boolean gioiTinh;
    private String ngaySinh;
    private int nienKhoa;
    private int lop;
    private String email;

    public SinhVien() {
    }

    public SinhVien(String hoTen, boolean gioiTinh, String ngaySinh, int nienKhoa, int lop, String email) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.nienKhoa = nienKhoa;
        this.lop = lop;
        this.email = email;
    }

    public SinhVien(int id, String hoTen, boolean gioiTinh, String ngaySinh, int nienKhoa, int lop, String email) {
        this.id = id;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.nienKhoa = nienKhoa;
        this.lop = lop;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getNienKhoa() {
        return nienKhoa;
    }

    public void setNienKhoa(int nienKhoa) {
        this.nienKhoa = nienKhoa;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
