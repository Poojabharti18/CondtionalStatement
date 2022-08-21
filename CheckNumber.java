package conditionalstatement;
import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number");
		int num=sc.nextInt();
        
        if(num>=0)
           {
        	System.out.print("The Number is Positive"); 
        	}
        
        else
        {
        	System.out.print("The Number is Negative");
        
	     }
        
	}
}


