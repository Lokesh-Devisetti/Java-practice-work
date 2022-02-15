import java.util.Scanner;
public class Number2 
{
	public static void main(String[] args) 
	{
		String strTWords;
		int i, totalWords;
		totalWords = 1;
		char TWord_ch;
		
		Scanner sc= new Scanner(System.in);

		System.out.print("\nPlease Enter String to Count Words =  ");
		strTWords = sc.nextLine();
		
		for(i = 0; i < strTWords.length(); i++)
		{
			TWord_ch = strTWords.charAt(i);
			if((TWord_ch == ' ' ) || TWord_ch == '\t') {
				totalWords++;
			}
		}		
		System.out.println("\nTotal Number of Words  =  " + totalWords);
	}
}
