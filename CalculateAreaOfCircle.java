/* 
* CalculatEAreaOfCircle
 * Nithesh Karuppasamy
 * Find the area of the circle based on the user input's radius
 *
 * Resources :
 *
 */

import java.util.Scanner; 

public class CalculateAreaOfCircle{
    private double radius;
    

    public void acceptInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius for a circle");
        radius = input.nextDouble();
        input.close();
    }
    
    public double solveSlope()
    {
     return (Math.PI*Math.pow(radius,2));
    
    }
}
