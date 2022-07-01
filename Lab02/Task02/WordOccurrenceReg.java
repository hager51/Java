import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WordOccurrenceReg
{
	public static void main(String args[]) 
	{
		String sentence = "iti is a good job oriented technical course, an iti holder can get a good job in electrical, mechanical, and other manufacturing sectors, So you must join iti";
		Pattern pattern = Pattern.compile("iti");
		Matcher matcher = pattern.matcher(sentence);
		int count = 0;
		while (matcher.find()) {count++;}
		
		System.out.println("The string is: " + sentence);
		System.out.println("The word iti occurs " + count + " times in the above string");
	}
}