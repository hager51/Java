import java.lang.Math;

class MinMax 
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
		
		double max = getMax(random_arr);
		double min = getMin(random_arr);

		System.out.println("Minmum number in random array is : " + min);
		System.out.println("Maximum number in random array is : " + max);

		long t2 =  System.nanoTime();

		System.out.print("time in nanoseconds = " + (t2 - t1));
	}


	public static double getMax (double args[]) 
	{
		double max = args[0];
		for (int i = 1; i<args.length; i++)
		{
			if (args[i]>max) 
				max = args[i];
		}
		return max;
	}


	public static double getMin (double args[]) 
	{
		double min = args[0];
		for (int i = 1; i<args.length; i++)
		{
			if (args[i]<min) 
				min = args[i];
		}
		return min;
	}

}