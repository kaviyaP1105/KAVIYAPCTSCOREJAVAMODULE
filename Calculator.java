import java.util.*;
import java.lang.*;
class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Arithmetic Calculator");
        System.out.println("Enter num1");
        int a=in.nextInt();
        System.out.println("Enter num2");
        int b=in.nextInt();
        in.nextLine();
        System.out.println("Enter the operation:\nADDITION : '+'\nSUBRACTION: '-'\nMULTIPLICATION:'*'\nDIVISION:'/'");
        char ch=in.nextLine().charAt(0);
        switch(ch)
        {
            case '+':
                {
                System.out.println("The addition of two number is : "+(a+b));
                break;
                }
                case '-':
                    {
                System.out.println("The subraction of two number is : "+(a-b));
                break;
                }
                case '*':
                    {
                System.out.println("The multiplication of two number is : "+(a*b));
                break;
                }
                case '/':
                    {
                        if(b==0)
                        {
                            System.out.println("INVALID DIVIDE BY ZERO");
                        }
                        else
                        {
                          System.out.println("The divide of two number is : "+(a/b));
                        }
                break;
                }
                
            default:
            System.out.println("INVALID OPERATION");
        }
    }
}