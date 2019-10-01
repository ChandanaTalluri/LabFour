
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0809379
 */
public class Circle {
    private double radius;
    private final double pi = 3.14159;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(){
        this.radius = 0.0;
    }
    public static double area(double pi,double radius){
        double area = pi*radius*radius;
        return area;
    }
    public static double diameter(double radius){
        double diameter = radius*2;
        return diameter;
    }
    public static double circumference(double pi , double radius){
        double circumference = pi*2*radius;
        return circumference;
    }
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle :");
        try {
            double radius = keyboard.nextDouble();
            Circle objCircle = new Circle();
            double pi = objCircle.pi;
            double area = area(pi, radius);
            double diameter = diameter(radius);
            double circumference = circumference(pi, radius);
            String output = String.format("Area of the circle :%.2f\n Diameter of the circle : %.2f\n"
                    + " Circumference of the circle : %.2f", area,diameter,circumference);
            System.err.println(output);
            
        }catch(Exception e ){
             System.out.println("Alphabets and special charecters are not allowed");
        }
        
    }
}
