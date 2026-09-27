/*
* Build a Math Tutor 
* Nithesh Karuppasamy
* Solves math problems using basic formulas so students can learn the formula 
* and solve the problem on their own
* Resources : Dad
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
    System.out.println ("3. Pythogorean Theorem");
    int choice = input.nextInt();
 System.out.println("You want to solve problem " + choice);

    if (choice == 1) {
        CalculateSlope x = new CalculateSlope();
        x.acceptInput();
        double result = x.solveSlope();
        if (result > 0){ 
        System.out.println("The slope of the coordinates you chose is: " + result);  
        }
    
    
    }else if (choice == 2){
        CalculateAreaOfCircle x = new CalculateAreaOfCircle();
        x.acceptInput();
        double result = x.findArea(); 
        if (result > 0){
        System.out.println("The area of the circle based on the given radius is: " + result);
        }

    }else if (choice == 3){
        PythogoreanTheorem x = new PythogoreanTheorem ();
        x.acceptInput();
        double result = x.findsC();
        if (result > 0){
        System.out.println("Side C of the triangle is: " + result);
        }

     } else {
        System.out.println("Invalid Choice. Please Try Again");
     }
    }      
}