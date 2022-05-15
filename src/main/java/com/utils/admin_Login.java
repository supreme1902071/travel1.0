package com.utils;

import com.bean.Admin;
import com.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class admin_Login {
    public Admin login(int number, String password){ // 返回Admin对象，为null登陆失败
        Admin admin = null;
        if(password == null)return admin;

        Connection conn = null;
        PreparedStatement pstmt = null;  // 是Statement的子类
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from admin where admin_id = ? and admin_password = ?";
            pstmt = conn.prepareStatement(sql);
            // 给?赋值
            pstmt.setInt(1,number);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();
            //int admin_Id, String admin_Password
            while(rs.next()){
                admin = new Admin(rs.getInt("admin_id"),rs.getString("admin_password"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(conn,pstmt,rs);
        }
        return admin;
    }
}
