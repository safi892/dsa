package istask1;
import java.util.Scanner;
public class SimpleCalculator {
	public static void main (String [] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter first num : ");
		   double num1=s.nextDouble();
		   System.out.println("Enter second num : ");
		   double num2=s.nextDouble();
		   System.out.println("Enter Operator : ");
		   String op=s.next(); 
		   if(op.equals("+")) {
			   double sum=num1+num2;
			   System.out.println("Sum : "+sum);
		   }
		   else if(op.equals("-")) {
			   double sub=num1-num2;
			   System.out.println("Subtraction : "+sub);
		   }
		   else if(op.equals("*")) {
			   double mul=num1*num2;
			   System.out.println("Multiplication : "+mul);
		   }
		   else if(op.equals("/")) {
			   double d=num1/num2;
			   System.out.println("Division : "+d);
		   }
		   else {
			   System.out.println("Invalid Operator   $$%$$$$%%$$%^&^&%$##% ");
		   }
		   
		   s.close();
	}
}
