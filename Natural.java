import java.util.*;
public class Natural
{
    public static void main(String args[])
    {
        int i,num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("sum from:");
        i=sc.nextInt();
        System.out.println("sum upto:");
        num=sc.nextInt();
        while(i<=num)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("sum of natural numbers:"+sum);
    }
}