package com.utils;

import com.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class user_Login {
    public User login(String number, String password){ // 返回User对象，为null登陆失败
        User user = null;
        if(password == null)return user;

        Connection conn = null;
        PreparedStatement pstmt = null;  // 是Statement的子类
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where user_Email = ? and user_password = ?";
            pstmt = conn.prepareStatement(sql);
            // 给?赋值
            pstmt.setString(1,number);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();
            //int user_id, String user_Email, String user_Password, String user_Name, String user_Sex, int user_Age
            while(rs.next()){
                user = new User(rs.getInt("user_id"),rs.getString("user_Email"),rs.getString("user_Password"),rs.getString("user_Name"),rs.getString("user_Sex"),rs.getInt("user_Age"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(conn,pstmt,rs);
        }
        return user;
    }
}
