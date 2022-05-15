package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.bean.Admin;
import com.bean.City;
import com.bean.User;

public class JDBCUtils {
    public static String db_url = "jdbc:mysql://localhost:3306/travel?useUnicode=true&characterEncoding=utf-8";
    public static String user = "root";
    public static String password = "123";

    public static Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db_url,user,password);
        }catch(Exception ex){
            ex.printStackTrace();
        }

        return conn;
    }

    public static void close(Connection conn, Statement stmt){
        try{
            if(stmt!=null){
                stmt.close();
            }if(conn!=null){
                conn.close();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs){
        try{
            if(rs!=null){
                rs.close();
            }
            if(stmt!=null){
                stmt.close();
            }if(conn!=null){
                conn.close();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        int line = 0;
        User user = new User();
        Connection conn = JDBCUtils.getConnection();
        System.out.println(conn);
        user_Login userLogin = new user_Login();
        user_Register user_register= new user_Register();
        admin_Login admin_login = new admin_Login();
        user_Modify user_modify = new user_Modify();
        city_ShowAll city_showAll = new city_ShowAll();
        // 用户登录测试
        /*user = userLogin.login("110","111111");
        if(user != null){
            System.out.println("true");
            System.out.println(user);
        }else{
            System.out.println("false");
        }*/

        // 用户注册测试
       /* User user1 = new User(0,"111","123","哈哈","女",23);
        line = user_register.register(user1);
        System.out.println(line);*/

        // 管理员登陆测试
       /* Admin admin = null;
        admin = admin_login.login(1,"admin");
        if(admin != null){
            System.out.println("true");
            System.out.println(admin);
        } else{
            System.out.println("false");
        }*/

        // 用户修改信息测试
        /*User user2 = new User(0,"111","666666","哈哈","女",23);
        line = user_modify.modify(user2);
        System.out.println(line);*/

        // 城市全部展示测试
        ArrayList<City> cities = city_showAll.show_all();
        System.out.println(cities);
    }
}
