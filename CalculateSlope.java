/* 
* CalculateSlope
 * Nithesh Karuppasamy
 * Solve a calculate slope problem
 *
 * Resources : Quiz corrections from quiz 1a and 1b and dad 
 *
 */

import java.util.Scanner; 

public class CalculateSlope{
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public void acceptInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 doubles, all separated by a space");
        x1 = input.nextDouble();
        x2 = input.nextDouble();
        y1 = input.nextDouble();
        y2 = input.nextDouble();
        input.close();
    }
    
    public double solveSlope()
    { 
     if (x2-x1 == 0){
        System.out.println("Please enter two different x values and both them cannot be zero");
        return 0;
      } else {
        return ((y2-y1)/(x2-x1));
    }
    
    
    
    }
}
