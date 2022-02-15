public class Calculate
{
    public static void main(String[] args)
    {
      int sum=0;
    for(int k=9;k<300;k++)
    {
     if(k%7==0 && k%63!=0)
     {
            sum=sum+k;
        }
    
        }
        System.out.println(sum);
    }
}