package com.team.entity;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class TaiKhoan {
    
    private String tk;
    private String mk;

    public TaiKhoan() {
    }

    public TaiKhoan(String tk, String mk) {
        this.tk = tk;
        this.mk = mk;
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }
}
