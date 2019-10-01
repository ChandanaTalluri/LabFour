/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0809379
 */
public class Car {
    
    private int yearModel;
    private String make;
    private int speed;
    
    public Car(int yearModel , String make){
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public static int accelerate(int speed){
        int currentSpeed = 5;
        currentSpeed += speed;
        return currentSpeed;
    }
    
    public static int brake(int speed){
    int currentSpeed = 5;
        speed -=currentSpeed;
        return speed; 
    }
    
    public static void main(String[] args) {
        
        int yearModel =0;
        String make =  null;
       Car objCar = new Car(yearModel,make);
        for(int i = 0; i<5;i++){
           int speed = objCar.getSpeed();
           speed = accelerate(speed);
           objCar.setSpeed(speed);
            System.out.println("You have applied accelerator and current speed of the car : "+speed);
        }
         for(int i = 0; i<5;i++){
           int speed = objCar.getSpeed();
           speed = brake(speed);
           objCar.setSpeed(speed);
            System.out.println("You have applied a brake and current speed of the car : "+speed);
        }
    }
}
