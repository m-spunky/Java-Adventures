
import java.util.*;
public class Pastri
{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n * fact(n-1);
    }
    
    public static int ncr(int n,int r){
        int res;
        res = fact(n) / (fact(r) * fact(n-r));
        return res;
    }
    
    public static void pascal(int n){
        for (int row =0;row<=n;row++){
            for(int col =0 ;col<=row;col++){
                int ele = ncr(row,col);
                System.out.print(ele + " ");
            };
            System.out.print("\n");
        }

    };
    
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Number of rows :");
		int n = input.nextInt();
		System.out.println();
	
		pascal(n);

    };
};