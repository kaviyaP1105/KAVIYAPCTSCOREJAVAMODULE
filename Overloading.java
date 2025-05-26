import java.util.*;
import java.lang.*;
class  Overloading{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static double add(double a,double b)
    {
        return a+b;
    }
    public static int add(int a,int b,int c)
    {
        return a+b+c;
    }
    
    public static void main(String[] args) {
        int int2add=add(10,20);
        System.out.println("Two integers : "+int2add);
        double doub2add=add(10.50,11.70);
        System.out.println("Tow doubles : "+doub2add);
        int int3add=add(10,20,30);
        System.out.println("Three integers : "+int3add);
        
        
    }
}