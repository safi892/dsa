package weak4task2;

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		linkedList l=new linkedList();
		int choice;
		int count=0;
		while(true) {
			System.out.println("Press 1 for Add Data :");
			System.out.println("Press 2 for Display Data :");
			
			//System.out.println("Press 3 for Delete Last Data :");
			//System.out.println("Press 4 for Delete First Data :");
			System.out.println("Press 5 for Delete Specific Data :");
			System.out.println("Press 6 for insert Specific Data :");
			System.out.println("Press 7 for Sum :");
			System.out.println("Press 8 for Average :");
			System.out.println("Press 9 for Update :");
			System.out.println("Press 0 for Exit !");
			choice=s.nextInt();
			if(choice==1) {
				System.out.println("Enter Number :");
				int t=s.nextInt();
				l.insertLast(t);
				count++;
			}
			else if(choice==2) {
				l.display();
			}
			
			
			else if(choice==5) {
				System.out.println("Enter Number  to Delete:");
				int t=s.nextInt();
				l.deleteSpecific(t);
				System.out.println("Data Deleted !");
			}
			else if(choice == 6) {
				System.out.println("Enter Number :");
				int t=s.nextInt();
				System.out.println("Enter Position :");
				int p=s.nextInt();
				l.insertSpecific(t, p);
			}
			
			else if(choice==7) {
				System.out.println("Sum of Data is :"+l.sum());
			}
			else if(choice==0) {
				System.out.println("Average of Data is :"+l.Average());
			}
			else if(choice==9) {
				System.out.println("Enter Data :");
				int p=s.nextInt();
				System.out.println("Enter Data to search:");
				int v=s.nextInt();
				l.update(v, p);
			}
			else if (choice==0) {
				break;
			}

		}//loop

	}//main

}
