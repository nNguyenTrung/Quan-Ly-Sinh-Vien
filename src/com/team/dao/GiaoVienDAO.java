package com.team.dao;

import com.team.entity.GiaoVien;
import com.team.jdbc.GiaoVienService;
import com.team.jdbc.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class GiaoVienDAO implements GiaoVienService {

    @Override
    public void insert(GiaoVien o) {
        JDBCHelper.executeUpdate("insert into giaovien values (?,?,?,?,?,?)", o.getHoTen(), o.isGioiTinh() ? 0 : 1, o.getNgaySinh(), o.getDiaChi(), o.getSdt(), o.getEmail());
    }

    @Override
    public void update(GiaoVien o) {
        JDBCHelper.executeUpdate("update giaovien set hoten = ?, gioitinh = ?, ngaysinh = ?,"
                + "diachi = ?, sdt = ?, email = ? where id = ?", o.getHoTen(), o.isGioiTinh() ? 0 : 1, o.getNgaySinh(), o.getDiaChi(), o.getSdt(), o.getEmail(), o.getId());
    }

    @Override
    public void delete(GiaoVien o) {
        JDBCHelper.executeUpdate("delete giaovien where id = ?", o.getId());
    }

    @Override
    public List<GiaoVien> getAll() {
        List<GiaoVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from giaovien");
            while (rs.next()) {
                list.add(new GiaoVien(rs.getInt(1), rs.getString(2), rs.getInt(3) == 0, rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public GiaoVien getID(int id) {
        GiaoVien giaoVien = null;
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from giaovien where id = ?", id);
            if (rs.next()) {
                giaoVien = new GiaoVien(rs.getInt(1), rs.getString(2), rs.getInt(3) == 0, rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return giaoVien;
    }
}
