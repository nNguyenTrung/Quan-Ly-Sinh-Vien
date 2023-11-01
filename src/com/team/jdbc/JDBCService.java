package com.team.jdbc;

import java.util.List;

/**
 *
 * @author null
 * @copyright null
 *
 */
public interface JDBCService<O> {

    void insert(O o);

    void update(O o);

    void delete(O o);

    List<O> getAll();

    O getID(int id);
}
