import java.util.*;
class Store
{
    int fact=1;
    void factorial(int n)
    {
        for(int i=1;i<=n;i++)
        fact=fact*i;
        System.out.println("factorial of"+n+" is"+fact);
    }
}
public class Method2
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number:");
    int n=sc.nextInt();
    Store st=new Store();
    st.factorial(n);
    }
}
