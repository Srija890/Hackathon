package main.java.com.stackroute.java;

public class Car extends Vehicle {
    private String carModel;
    public int gear;

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public String getCarModel()
    {

        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void changeGear(int changegear)
    {
        if(this.gear<changegear) {
            this.gear=changegear;
            increaseSpeed();
        }
        else{
            this.gear=changegear;
            decreaseSpeed();
        }
    }

    private void decreaseSpeed() {
        System.out.println("Car speed Decrease");
    }

    public void handSteering()
    {
        System.out.println("Steering a car");
    }
    public void increaseSpeed()
    {
        System.out.println("Car speed Increased");
    }

    public void display(){
        System.out.println(" CarModel:\n"+getCarModel()+"\n Gear:"+getGear());
    }
}




