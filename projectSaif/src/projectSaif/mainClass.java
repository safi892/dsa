package projectSaif;

import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		linkedList l = new linkedList();
		int choice;
		while (true) {

			System.out.println("Press 1 for Add Bike  :");
			System.out.println("Press 2 to Delete Bike :");
			System.out.println("Press 3 to insert at Start :");
			System.out.println("Press 4 to insert at End :");
			System.out.println("Press 5 to Display all Bike Record :");
			System.out.println("Press 6 to Search :");
			System.out.println("Press 7 to Delete First :");
			System.out.println("Press 8 to Delete last :");
			System.out.println("Press 9 for Exit !");
			choice = s.nextInt();
			if (choice == 1) {
				Bike b = new Bike();
				System.out.println("Enter Model :");
				b.model = s.next();
				System.out.println("Enter Company :");
				b.company = s.next();
				System.out.println("Enter Price :");
				b.price = s.nextInt();
				System.out.println("Enter Number of Copies :");
				b.quantity = s.nextInt();
				l.insert(b);

			} else if (choice == 2) {
				System.out.println("Enter Bike Mode Number:");
				String i = s.next();
				l.delete(i);
			}
			else if (choice == 3) {
				Bike b = new Bike();
				System.out.println("Enter Model :");
				b.model = s.next();
				System.out.println("Enter Company :");
				b.company = s.next();
				System.out.println("Enter Price :");
				b.price = s.nextInt();
				System.out.println("Enter Number of Copies :");
				b.quantity = s.nextInt();
				l.insertAtStart(b);

			}
			else if (choice == 4) {
				Bike b = new Bike();
				System.out.println("Enter Model :");
				b.model = s.next();
				System.out.println("Enter Company :");
				b.company = s.next();
				System.out.println("Enter Price :");
				b.price = s.nextInt();
				System.out.println("Enter Number of Copies :");
				b.quantity = s.nextInt();
				l.insertLast(b);

			}

			else if (choice == 5) {
				l.display();
			} else if (choice == 6) {
				System.out.println("Enter Bike Mode Number:");
				String i = s.next();
				l.search(i);
			}
			else if(choice == 7) {
				l.deleteFirst();
			}
			else if(choice == 8) {
				l.deleteLast();
			}

			else if (choice == 9) {
				break;
			}

		} // loop

	}
}
