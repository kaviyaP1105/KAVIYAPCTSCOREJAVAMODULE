import java.util.*;
import java.lang.*;
class  Factorial{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter non-negative Integer");
        int n=in.nextInt();
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans*=i;
        }
        System.out.println("The factorial of "+n+" is "+ans);
        
    }
}