package june10;

import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int choice;
		graph g= new graph (5,true);
		while(true) {
			System.out.println("Press 1 for Follow user :");
			System.out.println("Press 2 to Unfollow a user:");
			System.out.println("Press 3 for Display Followers");
			System.out.println("Press 4 for Exit");
			choice=s.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter node 1 Name");
				String n=s.next();
				System.out.println("Enter node 2 Name");
				String m=s.next();
				g.addEdge(n, m);
			}
			else if(choice == 2) {
				System.out.println("Enter Name to Search");
				String n=s.next();
				g.displayAdjancy(n);
			}
		}
	}

}
