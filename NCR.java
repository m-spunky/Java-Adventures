
import java.util.*;
public class NCR
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

    
	public static void main(String args[])
	{
		ncr(2,3);
    };
};