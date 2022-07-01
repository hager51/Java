import java.util.Scanner;
import java.util.StringTokenizer;

class WordOccurrenceTok
{
	public static void main(String args[]) 
	{
		String sentence = "iti is a good job oriented technical course, an iti holder can get a good job in electrical, mechanical, and other manufacturing sectors, So you must join iti" ;

		String word = "iti";
		int count = 0;

		StringTokenizer st = new StringTokenizer(sentence," ");

		while(st.hasMoreTokens())
		{
			String s5=st.nextToken();
			if(s5.equals(word))
			{
				count++;
			}
		}
		
		System.out.println("The string is: " + sentence);
		System.out.println("The word " + word + " occurs " + count + " times in the above string");
	}
}