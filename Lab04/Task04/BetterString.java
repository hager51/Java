import java.util.function.BiPredicate;

public class BetterString 
{
	public static String findString(String s1, String s2, BiPredicate<String, String> p)
	{
		if(p.test(s1, s2))	{ return s1; }
		else 		{ return s2; }
	}

	public static void main(String[] args) 
	{
		String S1 = "Ahmed";
		String S2 = "Mohamed";
		
		String longer = findString(S1, S2, (s1, s2) -> s1.length() >= s2.length());
		System.out.println("\nThe better string is : " + longer);
	}
}