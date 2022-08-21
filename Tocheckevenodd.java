package conditionalstatement;


import java.util.Scanner;
public class Tocheckevenodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		 int a =sc.nextInt();
		 if(a%2==0)
		 {
			 System.out.println("This no is even:"+a);
			 
		 }
		 else if(a%2==1)
		 {
			 System.out.println("This no is Odd:"+a);
		 }

	}

}
