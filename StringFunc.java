import java.util.*;

public class StringFunct
{
	public static void main(String[] args)
	{	
		Scanner in=new Scanner(System.in);		

		System.out.print("\n\n Input the first string :");	
		String str = in.next();
	
		System.out.print("\n Input the second string : ");	
		String str2 = in.next();

		System.out.print("\n \n Using equals() we get: ");					
		System.out.println(str.equals(str2));

		System.out.print("\n Using equalsIgnoreCase() we get: ");			
		System.out.println(str.equalsIgnoreCase(str2));

		String str3=str.concat(str2);
		System.out.print("\n Using concat() we get: ");				
		System.out.println(str3);

		System.out.print("\n Using compareTo() we get: ");				
		System.out.println(str.compareTo(str2));

		System.out.print("\n Using compareToIgnoreCase() we get: ");		
		System.out.println(str.compareToIgnoreCase(str2));
	
		System.out.print("\n Using substring(int beginIndex) we get: ");		
		System.out.println(str.substring(3));

		System.out.print("\n Using substring(int beginIndex, int endIndex) we get: ");	
		System.out.println(str.substring(1,2));

		System.out.print("\n Using toUpperCase() we get: ");			
		System.out.println(str.toUpperCase());

		System.out.print("\n Using to LowerCase() we get: ");				
		System.out.println(str.toLowerCase());

		System.out.print("\n Using trim(): ");						
		System.out.println(str.trim());
	
		System.out.print("\n The length of string is: ");				
		System.out.println(str.length());	

		System.out.print("\n Using charAt(int index): ");			
		System.out.println(str.charAt(2));

	}
}