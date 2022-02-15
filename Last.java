import java.util.Scanner;

public class Last {
	public static void main(String[] args) {
		String delLastCharStr;
		char del_lch;
		int i, len;
		
	Scanner	sc= new Scanner(System.in);

		System.out.print("\nPlease Enter String to Delete Last Character =  ");
		delLastCharStr = sc.nextLine();
		
		System.out.print("\nEnter the Character to Delete =  ");
		del_lch = sc.next().charAt(0);
		
		char[] delLastCharArr = delLastCharStr.toCharArray();
		len = delLastCharArr.length;
		
		for(i = len - 1; i >= 0; i--) {			
			if(delLastCharArr[i] == del_lch) {
				delLastCharArr[i] = 0;
				break;
			}
		}

		System.out.print("\nThe Final String after Deleting Last Occurrence of " + 
				del_lch + " Character = " );
		System.out.print(delLastCharArr);
		
	}
}