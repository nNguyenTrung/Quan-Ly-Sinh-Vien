package com.team.dao;

import com.team.entity.Diem;
import com.team.jdbc.DiemService;
import com.team.jdbc.JDBCHelper;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class DiemDAO implements DiemService {

    @Override
    public void insert(Diem o) {
        JDBCHelper.executeUpdate("insert into diem values (?,?,?)", o.getSinhVien(), o.getMonHoc(), o.getDiem());
    }

    @Override
    public void update(Diem o) {
        JDBCHelper.executeUpdate("update diem set diem = ? where sinhvien = ? and monhoc = ?", o.getDiem(), o.getSinhVien(), o.getMonHoc());
    }

    @Override
    public void delete(Diem o) {
        JDBCHelper.executeUpdate("delete diem where sinhvien = ? and monhoc = ?", o.getSinhVien(), o.getMonHoc());
    }

    @Override
    public List<Diem> getAll() {
        List<Diem> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from diem");
            while (rs.next()) {
                list.add(new Diem(rs.getInt(1), rs.getInt(2), rs.getDouble(3)));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    @Override
    public Diem getID(int id) {
        return null;
    }

    @Override
    public Diem getID(int sv, int mh) {
        Diem diem = null;
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from diem where sinhvien = ? and monhoc = ?", sv, mh);
            if(rs.next()){
                diem = new Diem(rs.getInt(1), rs.getInt(2), rs.getDouble(3));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return diem;
    }

}
