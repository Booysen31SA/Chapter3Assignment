package PartOne;

public class Vehicle implements VehicleIdentity {

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.carType("car");
    }

    public String carType(String car) {
        return car;
    }

    public int wheels(String value){
        return Integer.parseInt(value);
    }
}
