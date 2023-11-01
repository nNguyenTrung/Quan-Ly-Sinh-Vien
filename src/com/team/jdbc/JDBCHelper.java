package com.team.jdbc;

import java.sql.*;

public class JDBCHelper {

    private static String username = "sa";
    private static String password = "123456";

    private static Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=qlsv;", username, password);
    }
    
    public static void connectDatabase(){
        try {
            getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static PreparedStatement getPreparedStatement(String query, Object... o) throws Exception {
        PreparedStatement ps = getConnection().prepareStatement(query);
        if (o.length > 0) {
            for (int i = 0; i < o.length; i++) {
                ps.setObject(i + 1, o[i]);
            }
        }
        return ps;
    }

    public static void executeUpdate(String querry, Object... o) {
        try {
            PreparedStatement ps = getPreparedStatement(querry, o);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet executeQuerry(String query, Object... o) throws Exception {
        return getPreparedStatement(query, o).executeQuery();
    }

}
