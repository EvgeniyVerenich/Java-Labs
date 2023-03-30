package com.company;

public class Telega extends Vehicle {

    private String telega_name;
    private int telega_cost;
    public double time;

    public Telega(String telega_name, int telega_cost) {
        this.telega_name = telega_name;
        this.telega_cost= telega_cost;
    }


    public int getTelega_cost() {
        return telega_cost;
    }

    public String getTelega_name() {
        return telega_name;
    }

    public void setTelega_name(String telega_name) {
        this.telega_name = telega_name;
    }

    public void setTelega_cost(int telega_cost) {
        this.telega_cost = telega_cost;
    }

    @Override
    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public void print() {
        System.out.println(telega_name+" Цена: "+telega_cost);
    }

    @Override
    public void travel_cost() {
        System.out.println(telega_name+"-"+telega_cost * time+"$");
    }
}
