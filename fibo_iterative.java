import java.util.*;

public class fibo
{
    public static void fib(int n){
        int a,b,temp;
        a = 0;
        b = 1;
        
        for(int i=0;i<n;i++){
            System.out.print(a + " ");
            temp = b;
            b = a +b;
            a = temp;
        };
    };
    
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Number of Terms :");
		int n = input.nextInt();
        fib(n);
    };
};