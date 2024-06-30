package weak2task1;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		Array a=new Array();
		
		System.out.print("Enter Number");
		int n=s.nextInt();
		a.insertAtLast(n);
		System.out.print("Enter Number");
		int n2=s.nextInt();
		a.insertAtLast(n2);
		System.out.print("Enter Number");
		int n21=s.nextInt();
		a.insertAtLast(n21);
		System.out.print("Enter Number");
		int n211=s.nextInt();
		a.insertAtLast(n211);
		
		//System.out.print("Enter index to delete");
		//int d=s.nextInt();
		//a.delete(d);
		
		
		//a.display();
		
		
		System.out.print("Enter Number to addd Start of an Array");
		int r=s.nextInt();
		a.insertAtStart(r);
		
		
		System.out.print("Enter Number to addd at Particular");
		int g=s.nextInt();
		System.out.print("Enter position");
		int p=s.nextInt();
		a.insertAtParticular(g, p);
		a.display();

	}

}