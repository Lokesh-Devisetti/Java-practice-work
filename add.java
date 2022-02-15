import java.util.*;
public class add
{
    public static void main(String args[])
    {
        int a,b,c,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("1.ADDITION");
        System.out.println("2.SUBSTRACTION");
        System.out.println("3.MULTIPLICATION");
        System.out.println("4.DIVISION");
        System.out.println("5.MODULO DIVISION");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        System.out.println("enter a,b values: ");
        a=sc.nextInt();
        b=sc.nextInt();
        switch(ch)
        {
               case 1:
                c=a+b;
                System.out.println("the addition value is:"+c);
                break;
                case 2:
                c=a-b;
                System.out.println("the substraction value is:"+c);
                break;
                case 3:
                c=a*b;
                System.out.println("the multiplication value is:"+c);
                break;
                case 4:
                c=a/b;
                System.out.println("the division value is:"+c);
                break;
                case 5:
                c=a%b;
                System.out.println("the modulo division value is:"+c);
                break;
                default:
                System.out.println("enter between 1-5 numbers only");
        }

    }
}