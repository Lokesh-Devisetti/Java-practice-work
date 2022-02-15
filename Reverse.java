import java.io.*;
class InputDemo
{
    public static void main(String args[])throws Exception
    {
        int empnumber;
        String empName;
        Float empSalary;
        DataInputStream br=new DataInputStream(System.in);
        System.out.println("Enter employee number:");
        empnumber=Integer.parseInt(br.readLine());
        System.out.println("Enter employee name:");
        empName=br.readLine();
        System.out.println("Enter employee salary:");
        empSalary=Float.parseFloat(br.readLine());
        System.out.println("employee number is:"+empnumber);
        System.out.println("employee name is:"+empName);
        System.out.println("employee salary is:"+empSalary);

        
    }
}