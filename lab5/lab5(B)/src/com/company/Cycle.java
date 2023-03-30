package com.company;

public class Cycle extends Vehicle {

    private String cycle_name;
    private int cycle_cost;
    public double time;

    public Cycle(String cycle_name, int cycle_cost) {
        this.cycle_cost = cycle_cost;
        this.cycle_name = cycle_name;

    }


    public int getCycle_cost() {
        return cycle_cost;
    }

    public String getCycle_name() {
        return cycle_name;
    }

    public void setCycle_name(String cycle_name) {
        this.cycle_name = cycle_name;
    }

    public void setCycle_cost(int cycle_cost) {
        this.cycle_cost = cycle_cost;
    }

    @Override
    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public void print() {
        System.out.println(cycle_name+" Цена: "+cycle_cost);
    }
    @Override
    public void travel_cost() {
        System.out.println(cycle_name+"-"+cycle_cost * time+"$");
    }
}
