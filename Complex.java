import java.util.*;


public class Complex{
    double real,imaginary;
    
    Complex(double r,double i){
        this.real = r;
        this.imaginary = i;
    };
    
    static void printComplex(Complex c){
      System.out.println(c.real + " " + c.imaginary);  
    }
    static void sum(Complex c1,Complex c2){
        Complex c3 = new Complex(0.0,0.0);
        c3.real = c1.real + c2.real;
        c3.imaginary = c1.imaginary + c2.imaginary;
        printComplex(c3);
    };
    
    public static void main(String[] args){
        Complex c1 = new Complex(4.0,3.9);
        Complex c2 = new Complex(4.2,2.9);
        Complex.sum(c1,c2);
        
    };
};