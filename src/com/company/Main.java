package com.company;

import model.Car;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Car.setDistance(600);

        Car car0 = new Car("Nissan Silvia S15", 250);
        Car car1 = new Car("Toyota Supra", 300);
        Car car2 = new Car("Nissan Gtr 34", 350);

        try{
            car0.join();
            car1.join();
            car2.join();
            car0.run();
            car1.run();
            car2.run();
        }catch (Exception e){
            System.out.println("Thread interrupted");
        }

        TreeSet<Car> allCars = new TreeSet<Car>();

        allCars.add(car0);
        allCars.add(car1);
        allCars.add(car2);

        for (var car: allCars) {
            System.out.println(car.toString());
        }
    }
}
