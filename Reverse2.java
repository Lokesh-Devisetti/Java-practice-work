import java.util.*;
class Reverse2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String st1,st2=" ";
        System.out.println("enter any string:");
        st1=sc.next();
        for(int i=0;i<st1.length();i++)
        {
            st2=st1.charAt(i)+st2;
        }
        System.out.println("the reverse of the given string is:"+st2);
    }
}