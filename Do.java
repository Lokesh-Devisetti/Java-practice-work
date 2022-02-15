import java.util.*;
public class Do
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();
        int i=1,fact=1;
        do
        {
            fact=fact*i;
            i++;
            
        }while(i<=num);
        System.out.println("factorial of the number:"+fact);
    }
}