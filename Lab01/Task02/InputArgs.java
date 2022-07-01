class InputArgs 
{
	public static void main(String args[]) 
	{
		if (args.length>0)
		{
			System.out.println("The strings you entered are : \n");
			for (int i=0; i<args.length; i++)
				System.out.println("args[" + i + "] : " + args[i]);
		}
		else System.out.println("Please Enter any string");

	}
}