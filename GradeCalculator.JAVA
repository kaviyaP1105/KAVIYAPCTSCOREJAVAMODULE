import java.util.*;
import java.lang.*;
class  GradeCalculator{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the marks out of 100  : ");
        int marks=in.nextInt();
        if(marks>=90 && marks<=100)
        {
            System.out.println("Your grade is A");
        }
        else if(marks>=80 && marks<=89)
        {
            System.out.println("Your grade is B");
        }
        else if(marks>=70 && marks<=79)
        {
            System.out.println("Your grade is C");
        }
        else if(marks>=60 && marks<=69)
        {
            System.out.println("Your grade is D");
        }
        else 
        {
            System.out.println("Your grade is F");
        }
        
        
    }
}