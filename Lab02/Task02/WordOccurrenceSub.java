class WordOccurrenceSub
{
	public static void main(String args[]) 
	{
		String sentence = "iti is a good job oriented technical course, an iti holder can get a good job in electrical, mechanical, and other manufacturing sectors, So you must join iti";
		int index;
		int count = 0;
		String sub = sentence;
		
		System.out.println("The string is: " + sentence);

		while (sub.indexOf("iti") >= 0)
		{
			index = sub.indexOf("iti");
			sub = sentence.substring(index+1);
			if (sub.length() != sentence.length())
			{ 	
				count++;
				sentence = sub;
			}
		}
		
		System.out.println("The word iti occurs " + count + " times in the above string");
	}

}
