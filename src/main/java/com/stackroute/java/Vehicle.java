package main.java.com.stackroute.java;

//this is a base class for Vehicle
public class Vehicle {
    String vehicleNumber;
    int vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(int vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void moving() {
        System.out.println("Vehicle is moving");
    }



}





