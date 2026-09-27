/* 
* PythogoreanTheorem
 * Nithesh Karuppasamy
 * Use the pythgorean theorem to find the third side of the 
 *
 * Resources :
 *
 */

import java.util.Scanner; 

public class CalculateAreaOfCircle{
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
     return (Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
    
    }
}
