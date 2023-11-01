package com.team.dao;

import com.team.entity.LopHoc;
import com.team.jdbc.JDBCHelper;
import com.team.jdbc.LopHocService;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class LopHocDAO implements LopHocService {

    @Override
    public void insert(LopHoc o) {
        JDBCHelper.executeUpdate("insert into lophoc values (?,?)", o.getTenLop(), o.getGvcn());
    }

    @Override
    public void update(LopHoc o) {
        JDBCHelper.executeUpdate("update lophoc set tenlop = ?, gvcn = ? where id = ?", o.getTenLop(), o.getGvcn(), o.getId());
    }

    @Override
    public void delete(LopHoc o) {
        JDBCHelper.executeUpdate("delete lophoc where id = ?", o.getId());
    }

    @Override
    public List<LopHoc> getAll() {
        List<LopHoc> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from lophoc");
            while (rs.next()) {
                list.add(new LopHoc(rs.getInt(1), rs.getString(2), rs.getInt(3)));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public LopHoc getID(int id) {
        LopHoc lopHoc = null;
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from lophoc where id = ?", id);
            if (rs.next()) {
                lopHoc = new LopHoc(rs.getInt(1), rs.getString(2), rs.getInt(3));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lopHoc;
    }

}
