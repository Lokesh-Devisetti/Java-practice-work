import java.util.*;
class Store
{
    int fact=1;
    int factorial(int n)
    {
        for(int i=1;i<=n;i++)
        fact=fact*i;
        return fact;
    }
}
public class Method3
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number:");
    int n=sc.nextInt();
    Store st=new Store();
    int res=st.factorial(n);
   System.out.println("factorial is"+res);

    }
}
