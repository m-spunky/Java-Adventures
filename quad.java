import java.lang.*;
import java.util.*;
import java.lang.Math;
public class quad
{
	public static void main(String args[])
	{
		int a,b,c;
		int discr;
		
		Scanner input = new Scanner(System.in);
		System.out.println("If the equation is in the form ax^2 + bx + c = 0 \n");

		System.out.println("Enter a : ");
		a = input.nextInt();
		System.out.println("Enter b : ");
		b = input.nextInt();
		System.out.println("Enter c : ");
		c = input.nextInt();
		
		double x1,x2;
		discr = (b*b)-(4*a*c);

		if (discr<0)
		{
			System.out.println("Roots are imaginary!");
		}

		else if(discr==0)
		{
			x1=(-b)/(2*a);
			System.out.println("Both the Roots are equal and they are : " + x1);
		}
		else
		{
			x1=((-b)+Math.sqrt(discr))/(2*a);
			x2=((-b)-Math.sqrt(discr))/(2*a);
			System.out.println("Roots are real and they are : " + x1 + " and " + x2);
		}
	}
}