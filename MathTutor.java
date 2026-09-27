/*
* Build a Math Tutor 
* Nithesh Karuppasamy
* Solves math problems using basic formulas so students can learn the formula 
* and solve the problem on their own
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
 System.out.println("You want to solve problem " + choice);
 CalculateSlope x = new CalculateSlope();
  x.acceptInput();
  double result = x.solveSlope();
  System.out.println("The slope of the coordinates that you gave is "+ result);
 }
}