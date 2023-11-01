package com.team.jdbc;

import com.team.entity.TaiKhoan;

/**
 *
 * @author null
 * @copyright null
 *
 */
public interface TaiKhoanService extends JDBCService<TaiKhoan> {

    TaiKhoan getTaiKhoan(String tk, String mk);
}
