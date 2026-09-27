/* 
* PythogoreanTheorem
 * Nithesh Karuppasamy
 * Use the pythgorean theorem to find the third side of the 
 *
 * Resources : Quiz corrections from quiz 1a and 1b
 *
 */

import java.util.Scanner; 

public class PythogoreanTheorem{
    private double a;
    private double b;

    public void acceptInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two doubles that represent two side legs of a triange, separate them using a space: ");
        a = input.nextDouble();
        b = input.nextDouble();
        input.close();
    }
    
    public double findsC()
    {
        if (a <= 0 || b <=0){
        System.out.println("Please enter the sides of triangle that is greater than zero");
        return 0;
      } else {
        return (Math.sqrt(Math.pow(a,2)+ Math.pow(b,2)));
      }
    
     }
   }
