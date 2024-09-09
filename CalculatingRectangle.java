/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Calculatingrectangle;

/**
 *
 * @author vanjo
 */
public class CalculatingRectangle {

    public static void main(String[] args) {
        //Define the Dimensions
        double length = 20.0; // length, in meters
        double width = 15.0; //  width in meters
        
        //Calculate the area
        double area = calculateArea(length, width);
        
        //Display Result
        /*  System.out.printf("garden with length %.2f meters and width %.2f meters:%n", length, width")';*/
        System.out.printf("Area:%.2f square meters%n", area);
        /*System.out.printf("Perimeter: %.2f meters%n", perimeter");*/
    }
        // Method to calculate the area of the rectangle
        public static double calculateArea(double length, double width) {
        return length * width;
        
        // Method to calculate the perimeter of the rectangle
        /* public static double calculatePerimeter(double length, double width) */
                /* return 2 * (length + width);*/
    }
}
