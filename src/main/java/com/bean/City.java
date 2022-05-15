package com.bean;

public class City {
    private int city_Id;
    private String city_Name;
    private String city_Describe;
    private String city_Scenic_Spot;  // 城市旅游景点
    private double city_Tourism_Price;


    public City() {
    }

    public City(int city_Id, String city_Name, String city_Describe, String city_Scenic_spot, double city_Tourism_Price) {
        this.city_Id = city_Id;
        this.city_Name = city_Name;
        this.city_Describe = city_Describe;
        this.city_Scenic_Spot = city_Scenic_spot;
        this.city_Tourism_Price = city_Tourism_Price;
    }

    public int getCity_Id() {
        return city_Id;
    }

    public void setCity_Id(int city_Id) {
        this.city_Id = city_Id;
    }

    public String getCity_Name() {
        return city_Name;
    }

    public void setCity_Name(String city_Name) {
        this.city_Name = city_Name;
    }

    public String getCity_Describe() {
        return city_Describe;
    }

    public void setCity_Describe(String city_Describe) {
        this.city_Describe = city_Describe;
    }

    public String getCity_Scenic_spot() {
        return city_Scenic_Spot;
    }

    public void setCity_Scenic_spot(String city_Scenic_spot) {
        this.city_Scenic_Spot = city_Scenic_spot;
    }

    public double getCity_Price() {
        return city_Tourism_Price;
    }

    public void setCity_Price(double city_Tourism_Price) {
        this.city_Tourism_Price = city_Tourism_Price;
    }

    @Override
    public String toString() {
        return "City{" +
                "city_Id=" + city_Id +
                ", city_Name='" + city_Name + '\'' +
                ", city_Describe='" + city_Describe + '\'' +
                ", city_Scenic_spot='" + city_Scenic_Spot + '\'' +
                ", city_Price=" + city_Tourism_Price +
                '}';
    }

}
