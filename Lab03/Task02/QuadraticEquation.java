import java.util.*; 
import java.util.function.*;

// The result of solving a quadratic equation
class Solution 
{
 	double x1;
	double x2;
	double img;
	double real;
}


class Compute
{
	public static void getResult(double a, double b, double c)
	{
		Double eq[] = {a, b, c};
		Solution roots = new Solution();

		Consumer<Double[]> func = x -> 
			{
			double d = b*b - 4*a*c; 
      			if (d>0) 
			{
        				roots.x1 = (-b-Math.sqrt(d))/(2*a);
        				roots.x2 = (-b+Math.sqrt(d))/(2*a);
        				System.out.println("x1 = " + roots.x1);
      				System.out.println("x2 = " + roots.x2);
      			}
			else if (d==0)
			{
        				roots.x1 = -b/(2*a);
        				roots.x2 = roots.x1;
        				System.out.println("x1 = " + roots.x1);
      				System.out.println("x2 = " + roots.x2);
			}
      			else
			{
				roots.real = -b/(2*a);
				roots.img = Math.sqrt(-(b*b - 4*a*c));
				System.out.println("x1 = " + roots.real + "+" + roots.img + "i");
      				System.out.println("x2 = " + roots.real + "-" + roots.img + "i");
			}
        				
    		};
		func.accept(eq);	
	}
}


public class QuadraticEquation
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);      
		System.out.print("Enter parameter a : ");  
		double a = sc.nextDouble();

		System.out.print("Enter parameter b : ");  
		double b = sc.nextDouble();

		System.out.print("Enter parameter c : ");  
		double c = sc.nextDouble();
	
		Compute.getResult(a, b, c);
  	}
}