import java.util.Scanner;
public class Variable
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input the first number: ");
         int num1=sc.nextInt();
        System.out.println("input the second number: ");
        int num2=sc.nextInt();
        System.out.println("input the third number: ");
         int num3=sc.nextInt();
         if(num1==num2 && num2==num3 && num3==num1)
         {
             System.out.println(" all variables are equal ");
         }
         else
         {
             System.out.println(" all variables are not equal ");
         }
}
}
