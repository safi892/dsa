package assignment3;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int choice;
		heapsort b= new heapsort();
				
		while(true) {
			System.out.println("Press 1 for add record :");
			System.out.println("Press 2 displAY :");
			System.out.println("Press 3 for Exit !");
			choice=s.nextInt();
			
			if(choice == 1) {
				patient e= new patient();
				System.out.println("Enter Name");
				e.name =s.next();
				System.out.println("Enter age ");
				e.age =s.nextInt();
				System.out.println("Enter Condition ");
				e.condition=s.next();
				System.out.println("Enter Soverity ");
				e.soverity=s.nextInt();
				b.insert(e);
				
			}
			else if(choice == 2) {
				b.heapSort();
			}
			else if(choice ==3) {
				break;
			}
			
		}
		
		
		

	}

}
