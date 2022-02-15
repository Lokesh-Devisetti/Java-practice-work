import java.util.*;
class Store
{
    int fact=1;
    int factorial()
    {
     Scanner sc=new Scanner(System.in);
    System.out.println("enter number:");
    int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        fact=fact*i;
        return fact;
    }
}
public class Method4
{
    public static void main(String args[])
    {
    Store st=new Store();
    int res=st.factorial();
   System.out.println("factorial is"+res);

    }
}
