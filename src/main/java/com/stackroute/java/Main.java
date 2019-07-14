package main.java.com.stackroute.java;

public class Main {
    public static void main(String args[])
    {
        HondaCity hondaCity=new HondaCity();
        hondaCity.moving();
        hondaCity.setVehicleNumber("AP01 AP 1234");
        hondaCity.setVehicleType(4);
        hondaCity.handSteering();
        hondaCity.setGear(2);
        hondaCity.setCarModel("HondaCity");
        hondaCity.displayCar();
        hondaCity.display();
        hondaCity.changeGear(3);
        System.out.println("gear changed to" +hondaCity.getGear());
        hondaCity.changeGear(1);
        System.out.println("gear changed to" +hondaCity.getGear());
       hondaCity.display();


    }
}

