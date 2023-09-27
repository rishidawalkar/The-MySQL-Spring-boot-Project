package com.example.the_mysql_project;


public class Cars {

    private String name;
    private double price;
    private String model;

    public Cars() {
    }

    public Cars(String name, double price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel(){
        return model;
    }

}
