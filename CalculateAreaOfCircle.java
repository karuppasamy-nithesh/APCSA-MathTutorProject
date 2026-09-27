/* 
* CalculatEAreaOfCircle
 * Nithesh Karuppasamy
 * Find the area of the circle based on the user input's radius
 *
 * Resources : Quiz corrections from quiz 1a and 1b
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
    
    public double findArea() 
    {
      if (radius == 0){
        System.out.println("Please enter a radius that is not equal to zero");
        return 0;
      } else {
        return (Math.PI*Math.pow(radius,2));
    }
    
    }
}
