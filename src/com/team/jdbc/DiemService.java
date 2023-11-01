package com.team.jdbc;

import com.team.entity.Diem;

/**
 *
 * @author null
 * @copyright null
 *
 */
public interface DiemService extends JDBCService<Diem>{
    Diem getID(int sv, int mh);
}
