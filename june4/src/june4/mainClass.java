package june4;

import java.util.Scanner;

public class mainClass {
	public static void main(String [] args) {
		Scanner s= new Scanner(System.in);
		heap h = new heap();
		int choice;
		while(true) {
			System.out.println("Press 1 for add record :");
			System.out.println("Press 2 displAY :");
			System.out.println("Press 6 for Exit !");
			choice=s.nextInt();
			if(choice ==1) {
				
				employee em= new employee();
				System.out.println("Enter NAme :");
				em.name= s.next();
				System.out.println("enter age :");
				em.age=s.nextInt();
				h.insert(em);
			}
			
			else if(choice ==2) {
				h.heapSort();
				
			}
		}
		
	}

}
