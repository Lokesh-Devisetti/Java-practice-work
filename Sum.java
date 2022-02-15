import java.util.*;
class Store
{
    int fact=1,n;
    void fact()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        fact=fact*i;
        System.out.println("factorial of"+n+" is"+fact);
    }
}
public class Method
{
    public static void main(String args[])
    {
        Store st=new Store();
        st.fact();
    }
}
