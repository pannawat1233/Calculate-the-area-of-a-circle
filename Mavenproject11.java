/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject11;
import  java.util.Scanner;

/**
 *
 * @author PC
 */
public class Mavenproject11 {

    public  static  double calculateCircleArea(double radius)
    {
        return Math.PI * Math.pow(radius, 2);
    }
    public static void main(String[] args) 
    {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enther number");
         if(scanner.hasNextDouble())
         {
             double radius = scanner.nextDouble();
             double area = calculateCircleArea(radius);
             System.out.printf("The area of the circle with radius %.2f is %.2f\n", radius, area);
         }
         else
         {
              System.out.println("Please enter a valid decimal number for the radius.");
         }
         scanner.close();
    }
}
