package com.bean;

public class Order {
    private int order_Id;
    private int order_City_Id;
    private String order_State;
    private double order_Price;

    public Order() {
    }

    public Order(int order_Id, int order_City_Id, String order_State, double order_Price) {
        this.order_Id = order_Id;
        this.order_City_Id = order_City_Id;
        this.order_State = order_State;
        this.order_Price = order_Price;
    }

    public int getOrder_Id() {
        return order_Id;
    }

    public void setOrder_Id(int order_Id) {
        this.order_Id = order_Id;
    }

    public int getOrder_City_Id() {
        return order_City_Id;
    }

    public void setOrder_City_Id(int order_City_Id) {
        this.order_City_Id = order_City_Id;
    }

    public String getOrder_State() {
        return order_State;
    }

    public void setOrder_State(String order_State) {
        this.order_State = order_State;
    }

    public double getOrder_Price() {
        return order_Price;
    }

    public void setOrder_Price(double order_Price) {
        this.order_Price = order_Price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_Id=" + order_Id +
                ", order_City_Id=" + order_City_Id +
                ", order_State='" + order_State + '\'' +
                ", order_Price=" + order_Price +
                '}';
    }
}
