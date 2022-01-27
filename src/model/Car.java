package model;

public class Car extends Thread implements Comparable<Car> {
    public String name;
    public int speed;
    public static double distance;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public static void setDistance(double distance) {
        Car.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void run() {
        double drivenDistance = 0;
        double drivenTime = distance / speed;
        try {
            while (drivenDistance < distance) {
                drivenDistance += speed;
                Thread.sleep(1000);
                System.out.println(name + " is in " + drivenDistance);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return name + "-" + distance / speed;
    }

    @Override
    public int compareTo(Car o) {
        if(this.speed == o.speed){
            return 0;
        }else if(this.speed < o.speed){
            return -1;
        }else{
            return 1;
        }
    }
}
