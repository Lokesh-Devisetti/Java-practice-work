import java.util.Scanner;
public class Positive
{
    public static void main(String args[])
    {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to check:");
        number=sc.nextInt();
        if(number>0)
        {
            System.out.println(number+" is positive number");
        }
        else
        {
            System.out.println(number+" is negative number");
        }
    }
}