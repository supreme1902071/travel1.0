package com.bean;

public class Admin {

    private int admin_Id;
    private String admin_Password;

    public Admin() {
    }

    public Admin(int admin_Id, String admin_Password) {
        this.admin_Id = admin_Id;
        this.admin_Password = admin_Password;
    }

    public int getAdmin_Id() {
        return admin_Id;
    }

    public void setAdmin_Id(int admin_Id) {
        this.admin_Id = admin_Id;
    }

    public String getAdmin_Password() {
        return admin_Password;
    }

    public void setAdmin_Password(String admin_Password) {
        this.admin_Password = admin_Password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_Id=" + admin_Id +
                ", admin_Password='" + admin_Password + '\'' +
                '}';
    }

}
