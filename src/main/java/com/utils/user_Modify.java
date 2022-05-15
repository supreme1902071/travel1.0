package com.utils;

import com.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class user_Modify {
    public int modify(User user){   // 返回数据库中受影响的行数，

        int line = -1;  // 数据库中受影响的行数，默认是-1
        Connection conn = null;
        PreparedStatement pstmt = null;  // 是Statement的子类
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "update user set user_password = ?,user_name = ?,user_sex = ?,user_age = ? where user_Email = ?";
            pstmt = conn.prepareStatement(sql);
            // 给?赋值
            pstmt.setString(1, user.getUser_Password());
            pstmt.setString(2,user.getUser_Name());
            pstmt.setString(3, user.getUser_Sex());
            pstmt.setInt(4,user.getUser_Age());
            pstmt.setString(5, user.getUser_Email());

            line = pstmt.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(conn,pstmt,rs);
        }
        return line;
    }
}
