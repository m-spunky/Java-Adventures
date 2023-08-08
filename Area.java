import java.util.*;


public class Area{
    public static class Shape{
        public static int area(int l,int b){
            return (l * b);
        };
        public static int area(int side){
            return (4*side);
        };
        public static double area(double h,double b){
            return (0.5 * h * b);
        };
        public static double area(double rad){
            return (3.14 * rad * rad );
        };
        
    };
    
    public static void main(String[] args){
        Shape fig = new Shape();
        System.out.println(fig.area(4.0,5.0));
    };
};