package conditionalstatement;

import java.util.Scanner;

public class Findmaxnumber {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter first input");
		 int a =sc.nextInt();
		 System.out.print("Enter Second input");
		 int b =sc.nextInt();
		 System.out.print("Enter Third input");
		 int c =sc.nextInt();
		 if(a>b && a>c)
		 {
			 System.out.print("The maximum no is:"+a);
		 }
		 else if(b>c)
		 {
			 System.out.print("The maximum no is:"+b);
		 }
		 else
		 {
			 System.out.print("the Maximum no is:"+c);
		 }
	}

}
