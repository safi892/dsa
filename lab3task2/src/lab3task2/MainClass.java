package lab3task2;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		linkedList l=new linkedList();
		int choice;
		int count=0;
		while(true) {
			System.out.println("Press 1 for Add Song :");
			System.out.println("Press 2 for Display Song :");
			System.out.println("Press 3 for Update  Song Title :");
			System.out.println("Press 4 for insert Song at Start:");
			System.out.println("Press 5 for Search  Song by Name :");
			System.out.println("Press 6 for Exit !");
			choice=s.nextInt();
			if(choice==1) {
				System.out.println("Enter Song Name :");
				String t=s.next();
				l.inserAtLast(t);
				
			}
			else if(choice==2) {
				l.display();
			}
			else if(choice==3) {
				System.out.println("Enter Song Name  to update:");
				String t=s.next();
				l.update(t);
				//System.out.println("Data U !");
			}
			else if (choice==4) {
				System.out.println("Enter Song Name :");
				String t=s.next();
				l.insertAtStart(t);
			}
			else if(choice==5) {
				System.out.println("Enter Song Name  to Search:");
				String t=s.next();
				l.search(t);
				//System.out.println("Data U !");
			}
			else if(choice==6) {
				break;
			}
		}
		
	}//main

}
