
import java.util.*;

public class calc
{
    public static void calci(int a,int b,int op){
        int ans;
        switch (op){
            case 1:
                ans = a + b;
                System.out.println("Answer :"+ans);
                break;
            case 2:
                ans = a - b;
                System.out.println("Answer :"+ans);
                break;
            case 3:
                ans = a * b;
                System.out.println("Answer :"+ans);
                break;
            case 4:
                ans = a / b;
                System.out.println("Answer :"+ans);
                break;
        };
    };
    
	public static void main(String args[])
	{
		int n,a,b,op;

		Scanner input = new Scanner(System.in);
		System.out.println("Number 1:");
		a = input.nextInt();
		System.out.println("Number 2:");
		b = input.nextInt();
		
		System.out.println("Operator 1.(+)  2.(-)  3.(*)  4.(/):");
		op = input.nextInt();
		// op = input.next().charAt(0);
		calci(a,b,op);

    };
};