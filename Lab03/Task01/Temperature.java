import java.util.*; 
import java.util.function.Function;

class CtoF
{
	public static Float getFah(Float c)
	{
		Function<Float, Float> func = x -> ((x*9)/5)+32;
		return func.apply(c);	
	}
}

public class Temperature 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);      
		System.out.print("Enter temperature in centigrade : ");  
		Float C = sc.nextFloat();
		
		System.out.println("Temperature in Fahrenheit = " + CtoF.getFah(C));
	}
}

