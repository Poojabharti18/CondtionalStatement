package conditionalstatement;

import java.util.Scanner;

public class Check5digitornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		int num=sc.nextInt();
        
        if(num<=99999 && num>=10000)
           {
        	System.out.print("The Number is 5 Digit"); 
        	}
        
        else
        {
        	System.out.print("The Number is Not a five digit");
        
	     }
        
	}
}


