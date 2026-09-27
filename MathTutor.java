/*
* Title of Project
* Author ’s Name
* Purpose
*
* Resources :
*
*/

 import java.util.Scanner;

 public class MathTutor
 {
 public static void main ( String [] args ) 
 { Scanner input = new Scanner(System.in);
    System.out.println ("Choose a math problem: ");
    System.out.println ("1. Find the slope of a line");
    System.out.println ("2. Find the area of a circle");
    System.out.println ("3. Find the hypotenuse of the triangle");
    int choice = input.nextInt();
    input.close();
 System.out.println(choice);
 }
}