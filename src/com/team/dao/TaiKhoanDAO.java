package com.team.dao;

import com.team.entity.TaiKhoan;
import com.team.jdbc.JDBCHelper;
import com.team.jdbc.TaiKhoanService;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class TaiKhoanDAO implements TaiKhoanService {

    @Override
    public TaiKhoan getTaiKhoan(String tk, String mk) {
        TaiKhoan taiKhoan = null;
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from taikhoan where tk = ? and mk = ?", tk, mk);
            if (rs.next()) {
                taiKhoan = new TaiKhoan(rs.getString(1), rs.getString(2));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return taiKhoan;
    }

    @Override
    public void insert(TaiKhoan o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(TaiKhoan o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(TaiKhoan o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<TaiKhoan> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TaiKhoan getID(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
