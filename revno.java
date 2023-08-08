
import java.util.*;
public class revno
{
// 1234
// 1234 % 10 -> 4
// 1234 / 10 -> 123
// 123  % 10 -> 3
// 123  / 10 -> 12
// 12   % 10 -> 2
// 12   / 10 -> 1
// 1    % 10 -> 1

    public static void revnum(int n){
        while(n!= 0){
            int rem = n % 10;
            System.out.print(rem);
            n = n / 10;
        };
    };
    
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Number :");
		int n = input.nextInt();
        revnum(n);
    };
};