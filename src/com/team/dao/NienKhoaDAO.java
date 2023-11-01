package com.team.dao;

import com.team.entity.NienKhoa;
import com.team.jdbc.JDBCHelper;
import com.team.jdbc.NienKhoaService;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class NienKhoaDAO implements NienKhoaService {

    @Override
    public void insert(NienKhoa o) {
        JDBCHelper.executeUpdate("insert into nienkhoa values (?,?,?)", o.getTenNienKhoa(), o.getNamBatDau(), o.getNamKetThuc());
    }

    @Override
    public void update(NienKhoa o) {
        JDBCHelper.executeUpdate("update nienkhoa set tennienkhoa = ?, nambatdau = ?, namketthuc = ? where id = ?", o.getTenNienKhoa(), o.getNamBatDau(), o.getNamKetThuc(), o.getId());
    }

    @Override
    public void delete(NienKhoa o) {
        JDBCHelper.executeUpdate("delete nienkhoa where id = ?", o.getId());
    }

    @Override
    public List<NienKhoa> getAll() {
        List<NienKhoa> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from nienkhoa");
            while (rs.next()) {
                list.add(new NienKhoa(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public NienKhoa getID(int id) {
        NienKhoa nienKhoa = null;
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from nienkhoa where id = ?", id);
            if (rs.next()) {
                nienKhoa = new NienKhoa(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nienKhoa;
    }

}
