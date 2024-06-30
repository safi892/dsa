package project;

import java.util.Scanner;

public class mainClass {
	public static void main(String[] argw ) {
		Scanner s = new Scanner (System.in);
		int choice;
		Tree b= new Tree();
		Tree recycleTree= new Tree();
		int forID=1000;
		
		while(true) {
			System.out.println("Press 1 for Add Data :");
			System.out.println("Press 2 to for Recycle:");
			System.out.println("Press 3 for search22");
			System.out.println("Press 4 for Update");
			System.out.println("Press 5 for delete ");
			System.out.println("Press 6 for Display");
			System.out.println("Press 7 for Exit");
			choice=s.nextInt();
			if(choice==1) {
				groceryItem objGrocery=new groceryItem();
				System.out.println("Enter name ");
				objGrocery.name=s.next();
//				System.out.println("Enter  ID ");
				
				objGrocery.id=++forID;
				System.out.println("Enter  Price ");
				objGrocery.price=s.nextInt();
				System.out.println("Enter  Quantity ");
				objGrocery.quantity=s.nextInt();
				b.insert(objGrocery);
				
			}
			else if(choice == 2) {
				int check;
				while(true) {
					System.out.println("Press 1 to Search Value by name:");
					System.out.println("Press 2 for Display");
					System.out.println("Press 3 for Recover");
					System.out.println("Press 4 for exit");
					
					check=s.nextInt();
					if(check== 1) {
						System.out.println("Enter name  to Search ");
						String d=s.next();
						recycleTree.search(d);
					}
					else if(check == 2) {
						recycleTree.display();
					}
					else if(check == 3) {
						groceryItem objGrocery;
						System.out.println("Enter Name to Delete ");
						String d=s.next();
						objGrocery=recycleTree.delete(d);
						
						if(objGrocery == null) {
							System.out.println("Data not Found");
						}else {
							b.insert(objGrocery);
						}
					}
					else if(check ==4) {
						break;
					}
				}	
			}
			else if(choice == 3) {
				System.out.println("Enter name  to Search ");
				String d=s.next();
				b.search(d);
			}
			else if(choice == 4) {
				System.out.println("Enter name  to Search ");
				String d=s.next();
				b.update(d);
			}
			else if(choice == 5) {
				groceryItem objGrocery;
				System.out.println("Enter Name to Delete ");
				String d=s.next();
				objGrocery=b.delete(d);
				if(objGrocery == null) {
					System.out.println("Data not Found");
				}else {
					recycleTree.insert(objGrocery);
				}
				
				System.out.println();
			}
			else if(choice == 6) {
				
				b.display();
			}
			else if(choice == 7) {
				break;
			}
			
		}//loop	
	}
}
