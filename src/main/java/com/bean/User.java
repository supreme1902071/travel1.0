package com.bean;

import java.util.List;

public class User {

    private int user_Id;
    private String user_Email;
    private String user_Password;
    private String user_Name;
    private String user_Sex;
    private int user_Age;
    private List<Order> user_Orders;


    public User() {
    }

    public User(int user_id, String user_Email, String user_Password, String user_Name, String user_Sex, int user_Age) {
        this.user_Id = user_id;
        this.user_Email = user_Email;
        this.user_Password = user_Password;
        this.user_Name = user_Name;
        this.user_Sex = user_Sex;
        this.user_Age = user_Age;
    }

    public int getUser_id() {
        return user_Id;
    }

    public void setUser_id(int user_id) {
        this.user_Id = user_id;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }

    public String getUser_Password() {
        return user_Password;
    }

    public void setUser_Password(String user_Password) {
        this.user_Password = user_Password;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Sex() {
        return user_Sex;
    }

    public void setUser_Sex(String user_Sex) {
        this.user_Sex = user_Sex;
    }

    public int getUser_Age() {
        return user_Age;
    }

    public void setUser_Age(int user_Age) {
        this.user_Age = user_Age;
    }

    public List<Order> getUser_Orders() {
        return user_Orders;
    }

    public void setUser_Orders(List<Order> user_Orders) {
        this.user_Orders = user_Orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_Id +
                ", user_Email='" + user_Email + '\'' +
                ", user_Password='" + user_Password + '\'' +
                ", user_Name='" + user_Name + '\'' +
                ", user_Sex=" + user_Sex +
                ", user_Age=" + user_Age +
                ", user_Orders=" + user_Orders +
                '}';
    }
}
