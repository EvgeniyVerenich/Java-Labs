/**
 * Создать суперкласс Транспортное средство и подклассы Автомобиль, Велосипед, Повозка.
 * Подсчитать время и стоимость перевозки пассажиров и грузов каждым транспортным средством.
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Car[] cars = new Car[2];
        cars[0] = new Car("Mazda",50);
        cars[1] = new Car("Nissan",55);


        Telega[] telegas = new Telega[2];
        telegas[0] = new Telega("Voz-metal",20);
        telegas[1] = new Telega("Voz-wood",15);

        Cycle[] cycles = new Cycle[2];
        cycles[0] = new Cycle("Aist",10);
        cycles[1] = new Cycle("Condor",15);

        Vehicle[] vehicles = {cars[0],cars[1],telegas[0],telegas[1],cycles[0],cycles[1]};

        for (Vehicle a : vehicles){
            a.print();
        }

        System.out.println("Сколько часов вы хотите ехать ?");
        double t = in.nextDouble();
        for (Vehicle time : vehicles){
            time.setTime(time.vehicle_time = t);
        }



        for (Vehicle a : vehicles){
            a.travel_cost();
        }



    }
}
