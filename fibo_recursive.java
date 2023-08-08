
import java.util.*;

public class fibo
{
    public static void fib(int a,int b,int n){
        if (n<0){
            return;
        };
        System.out.print(a + " ");
        fib(b,a+b,n-1);
    };
    
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Number Of Terms :");
		int n = input.nextInt();
        fib(0,1,n);
    };
};