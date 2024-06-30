package task;
import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		MarkerArray ma=new MarkerArray();
		int choice;
		while(true) {
			System.out.println("Press 1 for Add Marker at start :");
			System.out.println("Press 2 toAdd Marker at last :");
			System.out.println("Press 3 to Add Marker at specific position :");
			System.out.println("Press 4 to Display all Marker Record :");
			System.out.println("Press 5 to delete first Marker :");
			System.out.println("Press 6 to delete last Marker :");
			System.out.println("Press 7 for Exit !");
			choice=s.nextInt();
			
			if(choice==1) {
				Marker m1=new Marker();
				System.out.println("Enter Color :");
				m1.color=s.next();
				System.out.println("Enter Company :");
				m1.company=s.next();
				System.out.println("Enter Price :");
				m1.price=s.nextFloat();
				System.out.println("Is Marker Permanant :");
				m1.isPermanent=s.nextBoolean();
				ma.insertAtStart(m1);
			}
			
			else if(choice==2) {
				Marker m1=new Marker();
				System.out.println("Enter Color :");
				m1.color=s.next();
				System.out.println("Enter Company :");
				m1.company=s.next();
				System.out.println("Enter Price :");
				m1.price=s.nextFloat();
				System.out.println("Is Marker Permanant :");
				m1.isPermanent=s.nextBoolean();
				ma.insertAtLast(m1);
				
			}
			
			
			else if(choice==3) {
				Marker m1=new Marker();
				System.out.println("Enter Position where store data :");
				int pos=s.nextInt();
				System.out.println("Enter Color :");
				m1.color=s.next();
				System.out.println("Enter Company :");
				m1.company=s.next();
				System.out.println("Enter Price :");
				m1.price=s.nextFloat();
				System.out.println("Is Marker Permanant :");
				m1.isPermanent=s.nextBoolean();
				ma.insertMarkerAtSpecificPosition(m1,pos);
				
				
			}
			
			else if(choice==4) {
				
				ma.display();
			}
			
			else if(choice==5) {
				ma.deleteFirstMarker();
				ma.display();
			}
			else if(choice==6) {
				ma.deleteLastMarker();
				ma.display();
				
				
		}
			else if(choice==7) {
				System.out.println("Program Exited Successfully $$$");
				break;
				
			}
		}
		
		
		
	}
}
