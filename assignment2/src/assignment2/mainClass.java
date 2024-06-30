package assignment2;

import java.util.Scanner;


public class mainClass {
	public static void main(String[] argw ) {
		Scanner s = new Scanner (System.in);
		int choice;
		Tree b= new Tree();
		while(true) {
			System.out.println("Press 1 for Add Data :");
			System.out.println("Press 2 to Search Value by name:");
			System.out.println("Press 3 for search22");
			System.out.println("Press 4 for delete ");
			System.out.println("Press 5 for Display Maximum");
			System.out.println("Press 6 for Exit");
			choice=s.nextInt();
			if(choice==1) {
				patientRecord e = new patientRecord();
				System.out.println("Enter Medical Record ID");
				e.medicalRecordNumber =s.nextInt();
				System.out.println("Enter Name ");
				e.name =s.next();
				System.out.println("Enter Medical Condition ");
				e.medicalCondition=s.next();
				System.out.println("Enter Medical Treatment ");
				e.treatment=s.next();
				b.insert(e);
			}
			else if(choice == 2) {
				System.out.println("Enter Medical Record ID to Search ");
				int d=s.nextInt();
				b.search(d);
			}
			else if(choice == 3) {
				System.out.println("Enter Medical Record ID to Search ");
				int d=s.nextInt();
				b.search2(d);
			}
			else if(choice == 4) {
				
				System.out.println("Enter Medical Record ID to Delete ");
				int d=s.nextInt();
				b.delete(d);
			}
			else if(choice == 5) {
				
				b.display();
			}
			else if(choice == 6) {
				break;
			}
			
		}//loop

		
		
		
	}

}
