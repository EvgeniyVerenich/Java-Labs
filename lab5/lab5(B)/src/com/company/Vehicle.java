package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class Vehicle {

private String vehicle_name;
private int vehicle_cost;
public double vehicle_time;


    public abstract void print();
    public abstract void setTime(double vehicle_time);
    public abstract void travel_cost();


}
