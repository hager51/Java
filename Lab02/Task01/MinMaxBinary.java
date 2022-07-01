import java.lang.Math;

class MinMaxBinary 
{
	public static void main(String args[]) 
	{
		double random_arr[];
		random_arr = new double[1000];

		for (int i = 0; i<random_arr.length; i++)
		{
			random_arr[i] = Math.random();
		}

		long t1 = System.nanoTime();
		
		Sort(random_arr);

		long t2 =  System.nanoTime();

		System.out.println("Minmum number in random array is : " + random_arr[0]);
		System.out.println("Maximum number in random array is : " + random_arr[random_arr.length-1]);
		System.out.print("time in nanoseconds = " + (t2 - t1));
	}


	public static void Sort(double args[]) 
	{
		for (int i = 0; i < args.length; i++)   
		{  
			for (int j = i + 1; j < args.length; j++)   
			{  
				double tmp = 0.0;  
				if (args[i] > args[j])   
				{  
					tmp = args[i];  
					args[i] = args[j];  
					args[j] = tmp;  
				}  
			}  

		}
	}


}