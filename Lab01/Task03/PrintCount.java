class PrintCount 
{
	public static void main(String args[]) 
	{
		if (args.length > 0 && args.length < 3)
		{		
				try {
					int num = Integer.parseInt(args[0]);
					for (int i = 0; i<num; i++) 
						System.out.println(args[1]);}
				catch (NumberFormatException e) 								{System.out.println("Frist input must be integer !");}

		}
		else System.out.println("You must input integer and string ");

	}
}