//PROGRAM 4
import java.util.*;
import java.lang.*;

class Leap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int y=in.nextInt();
        if(y%100==0)
        {
            if(y%400==0)
            {
                System.out.println(y+" is a leap year");
            }
            else
            {
                System.out.println(y+" is not a leap year");
            }
        }
        else
        {
            if(y%4==0)
            {
                System.out.println(y+" is a leap year");
            }
            else
            {
                System.out.println(y+" is not a leap year");
            }
        }
    }
}