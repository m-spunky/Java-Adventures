
import java.util.*;
public class Armstr
{
    public static void get_armstrong(int n){
        int num = 0;
        int check = n;
        while(n!= 0){
            int rem = n % 10;
            num = num + (rem*rem*rem);
            n = n / 10;
        };
        if (num == check){
    		System.out.println(num + " is Armstrong");
        }
        else{
    		System.out.println(num + " is not a Armstrong");
        };
    };

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Number : ");
		int n = input.nextInt();
		System.out.println();
		get_armstrong(n);
    };
};