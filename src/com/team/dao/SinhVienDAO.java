package com.team.dao;

import com.team.entity.SinhVien;
import com.team.jdbc.JDBCHelper;
import com.team.jdbc.SinhVienService;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class SinhVienDAO implements SinhVienService {

    @Override
    public void insert(SinhVien o) {
        JDBCHelper.executeUpdate("insert into sinhvien values (?,?,?,?,?,?)",
                o.getHoTen(), o.isGioiTinh() ? 0 : 1, o.getNgaySinh(), o.getNienKhoa(), o.getLop(), o.getEmail());
    }

    @Override
    public void update(SinhVien o) {
        JDBCHelper.executeUpdate("update sinhvien set hoten = ?, gioitinh = ?,"
                + "ngaysinh = ?, nienkhoa = ?, lop = ?, email = ? where id = ?",
                o.getHoTen(), o.isGioiTinh() ? 0 : 1, o.getNgaySinh(), o.getNienKhoa(), o.getLop(), o.getEmail(), o.getId());
    }

    @Override
    public void delete(SinhVien o) {
        JDBCHelper.executeUpdate("delete sinhvien where id = ?", o.getId());
    }

    @Override
    public List<SinhVien> getAll() {
        List<SinhVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from sinhvien");
            while (rs.next()) {
                list.add(new SinhVien(rs.getInt(1), rs.getString(2), rs.getInt(3) == 0, rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7)));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public SinhVien getID(int id) {
        SinhVien sinhVien = null;
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from sinhvien where id = ?", id);
            if (rs.next()) {
                sinhVien = new SinhVien(rs.getInt(1), rs.getString(2), rs.getInt(3) == 0, rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sinhVien;
    }

}
