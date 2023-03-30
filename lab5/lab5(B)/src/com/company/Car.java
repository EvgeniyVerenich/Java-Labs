package com.company;

public class Car extends Vehicle {

    private String car_name;
    private int car_cost;
    public double time;

    public Car(String car_name,int car_cost){
        this.car_name = car_name;
        this.car_cost = car_cost;
    }


    public String getCar_name() {
        return car_name;
    }

    public int getCar_cost() {
        return car_cost;
    }

    public void setCar_cost(int car_cost) {
        this.car_cost = car_cost;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }


    public void setTime(double time){
        this.time = time;
    }

    @Override
    public void print() {
        System.out.println(car_name+" Цена: "+ car_cost);
    }

    @Override
    public void travel_cost() {
        System.out.println(car_name+"-"+car_cost * time+"$");
    }
}
