import java.io.*;
class Buffer
{
    public static void main(String args[])throws IOException
    {
        int eno;
        String ename;
        float esal;
       
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader ki= new BufferedReader(in);
        System.out.println("Enter Employe number:");
        eno=Integer.parseInt(ki.readLine());
       
        System.out.println("Enter Employe name:");
        ename=ki.readLine();
        System.out.println("Enter Employe salary:");
        esal=Float.parseFloat(ki.readLine());
       
        System.out.println("The Employe number:"+eno);
        System.out.println("The Employe name:"+ename);
        System.out.println("The Employe Salary:"+esal);
       
    }
}