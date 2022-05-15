package com.utils;

import com.bean.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class city_ShowAll {
    public ArrayList<City> show_all (){
        ArrayList<City> list = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstmt = null;  // 是Statement的子类
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from city";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // int city_Id, String city_Name, String city_Describe, String city_Scenic_spot, double city_Price
            while(rs.next()){
                list.add(new City(rs.getInt("city_id"),rs.getString("city_name"),rs.getString("city_describe"),rs.getString("city_scenic_spot"),rs.getDouble("city_tourism_Price")));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(conn,pstmt,rs);
        }

        return list;
    }
}
