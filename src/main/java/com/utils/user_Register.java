package com.utils;

import com.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class user_Register {
    public int register(User user){   // 返回数据库中受影响的行数，默认是-1，如果是-1则注册失败，如果返回正数，则注册成功

        int line = -1;  // 数据库中受影响的行数，默认是-1
        Connection conn = null;
        PreparedStatement pstmt = null;  // 是Statement的子类
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where user_Email = ? ";
            pstmt = conn.prepareStatement(sql);
            // 给?赋值
            pstmt.setString(1,user.getUser_Email());
            rs = pstmt.executeQuery();

            if(rs.next()){   // 如果该邮箱已经注册，则返回-1
                // line 默认是-1
            } else{
                String sql1 = "insert into user(user_id,user_Email,user_password,user_name,user_sex,user_age) value(?,?,?,?,?,?) "; // 要新建一个String
                pstmt = conn.prepareStatement(sql1);

                pstmt.setInt(1,0);  // user_id数据库会自增，写0就行
                pstmt.setString(2,user.getUser_Email());
                pstmt.setString(3, user.getUser_Password());
                pstmt.setString(4,user.getUser_Name());
                pstmt.setString(5, user.getUser_Sex());
                pstmt.setInt(6,user.getUser_Age());
                line = pstmt.executeUpdate();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(conn,pstmt,rs);
        }
        return line;
    }
}
