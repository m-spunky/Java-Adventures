import java.util.*;   
   
public class Palindrome{
	public static boolean isPal(String str)
	{
		int n = str.length()-1;
		for(int i=0;i<n/2;i++)
		{
			if(str.charAt(i) != str.charAt(n-i))
				return false;
	  	}	
		return true;
	}
    public static void main(String[] args)
    {
        String str = "hello";
        if(isPal(str)){
          System.out.println(str+" is Palindrome");  
        }
        else{
          System.out.println(str+" is Not Palindrome");            
        };
        
                
    };
};