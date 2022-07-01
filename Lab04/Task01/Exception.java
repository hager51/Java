import java.io.IOException;
import java.util.*;

class WrongFileNameException extends IOException 
{ 
	public WrongFileNameException(String errorMessage) 
	{  
		super(errorMessage);  
    	}  
}  


class validation
{
	static void empty (String name) throws WrongFileNameException
	{
		if(name.length()==0) 
		{
			throw new WrongFileNameException("Invalid input, name must not be empty");
		}
	}

	static void number (String name) throws WrongFileNameException
	{
		if(Character.isDigit(name.charAt(0)))
		{
			throw new WrongFileNameException("Invalid input, name must not start with number");
		}
	}

	static void exceed (String name) throws WrongFileNameException
	{
		if(name.length()>50) 
		{
			throw new WrongFileNameException("Invalid input, name must not exceed 50");
		}
	}
}

public class Exception
{
	public static void main(String args[])  
	{  
		Scanner sc= new Scanner(System.in);      
		System.out.print("Enter file name : ");
		String filename = sc.nextLine();

		int flag = 0;

		try  
		{    
			validation.empty(filename);
		}  
		catch (WrongFileNameException e)  
        		{  
            			System.out.println("Caught the exception");  
 			System.out.println("Exception occured : " + e); 
			flag = 1; 
        		}  

		try  
		{    
			validation.number(filename);
		}  
		catch (WrongFileNameException e)  
        		{  
            			System.out.println("Caught the exception");  
 			System.out.println("Exception occured : " + e);
			flag = 1;   
        		}

		try  
		{    
			validation.exceed(filename);
		}  
		catch (WrongFileNameException e)  
        		{  
            			System.out.println("Caught the exception");  
 			System.out.println("Exception occured : " + e);  
			flag = 1; 
        		}
	
		if (flag == 0)
			System.out.println("Valid name"); 
	}
}  