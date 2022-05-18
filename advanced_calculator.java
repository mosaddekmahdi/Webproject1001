package test;

import java.util.Scanner;

import java.util.*;
public class scientific_calculator {
	
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	
	System.out.print("Enter first number to find sin, cos, tan- ");  
	int a= sc.nextInt();  
	
	System.out.print("Enter second number to find radian- ");  
	int c= sc.nextInt();
	
	 // converting values to radian    
    double b = Math.toRadians(a);   
      
    // return the trigonometric sine of a      
    System.out.println("Sine value of a is: " +Math.sin(a));    
      
    // return the trigonometric cosine value of a  
    System.out.println("Cosine value of a is: " +Math.cos(a));  
      
    // return the trigonometric tangent value of a  
    System.out.println("Tangent value of a is: " +Math.tan(a));  
      
    // return the trigonometric arc sine of a      
    System.out.println("Sine value of a is: " +Math.asin(a));    
      
    // return the trigonometric arc cosine value of a  
    System.out.println("Cosine value of a is: " +Math.acos(a));  
      
    // return the trigonometric arc tangent value of a  
    System.out.println("Tangent value of a is: " +Math.atan(a));  

    // return the hyperbolic sine of a      
    System.out.println("Sine value of a is: " +Math.sinh(a));    
      
    // return the hyperbolic cosine value of a  
    System.out.println("Cosine value of a is: " +Math.cosh(a));  
      
    // return the hyperbolic tangent value of a  
    System.out.println("Tangent value of a is: " +Math.tanh(a));  
	
    //THESE ARE ALL MATH METHODS IN JAVA.
	}
}
