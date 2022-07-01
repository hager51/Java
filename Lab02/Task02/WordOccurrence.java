class WordOccurrence
{
	public static void main(String args[]) 
	{
		String sentence = "iti is a good job oriented technical course, an iti holder can get a good job in electrical, mechanical, and other manufacturing sectors, So you must join iti";
		String word = "iti";
		String temp[] = sentence.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++)
		{
			if (word.equals(temp[i]))
				count++;
		}
		
		System.out.println("The string is: " + sentence);
		System.out.println("The word " + word + " occurs " + count + " times in the above string");
	}
}