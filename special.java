import java.util.*;
public class special
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character:");
        ch=sc.next().charAt(0);
    if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
    {
        switch(ch)
        {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
          System.out.println("Its vowel");
          break;
          default:
          System.out.println("Itc consonant");
        }
    }
    else
    
    {
    System.out.println("Enter alphabet only");
}
    }
}