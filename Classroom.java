import java.util.*;


public class Classroom{
    public static class Student{
        String name;
        int roll;
        int phy,chem,maths;
        
        Student(String name,int roll,int phy,int chem,int maths){
            this.name = name ;
            this.roll = roll;
            this.phy = phy;
            this.chem = chem;
            this.maths = maths;
        };
        
        public void printInfo(){
            System.out.println(name);
            System.out.println(roll);
            System.out.println(phy);
            System.out.println(chem);
            System.out.println(maths);
            System.out.println(maths+phy+chem);
            
        };
        
         
    };
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        
    };
};