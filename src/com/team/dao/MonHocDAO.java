package com.team.dao;

import com.team.entity.MonHoc;
import com.team.jdbc.JDBCHelper;
import com.team.jdbc.MonHocService;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author null
 * @copyright null
 *
 */
public class MonHocDAO implements MonHocService {

    @Override
    public void insert(MonHoc o) {
        JDBCHelper.executeUpdate("insert into monhoc values (?)", o.getTenMon());
    }

    @Override
    public void update(MonHoc o) {
        JDBCHelper.executeUpdate("update monhoc set tenmon = ? where id = ?", o.getTenMon(), o.getId());
    }

    @Override
    public void delete(MonHoc o) {
        JDBCHelper.executeUpdate("delete monhoc where id = ?", o.getId());
    }

    @Override
    public List<MonHoc> getAll() {
        List<MonHoc> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from monhoc");
            while (rs.next()) {
                list.add(new MonHoc(rs.getInt(1), rs.getString(2)));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public MonHoc getID(int id) {
        MonHoc monHoc = null;
        try {
            ResultSet rs = JDBCHelper.executeQuerry("select * from monhoc where id = ?", id);
            if (rs.next()) {
                monHoc = new MonHoc(rs.getInt(1), rs.getString(2));
            }
            rs.getStatement().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return monHoc;
    }

}
