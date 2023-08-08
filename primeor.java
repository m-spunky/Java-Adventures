
import java.util.*;

public class primeor
{
    public static boolean checker(int n){
		for(int i=2;i<n;i++){
		    if (n%i==0){
		       return true;
		    }
		};
		return false;        
    };
    
	public static void main(String args[])
	{
		int n;

		Scanner input = new Scanner(System.in);
		while (true){
		System.out.println("Enter a Number :");
		n = input.nextInt();
		
		if(checker(n)){
		    System.out.println("Given Number is not a Prime\n");
		}
		else{
		    System.out.println("Given Number is a Prime\n");
		}}

	}
}