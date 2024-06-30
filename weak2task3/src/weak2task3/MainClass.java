package weak2task3;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Book [] arr=new Book[1];
		int count=-1;
		int choice;
		Book b = null ;
		while(true) {
			System.out.println("Press 1 for Add Book :");
			System.out.println("Press 2 for Display All Book :");
			System.out.println("Press 3 for Search Book Record through Name:");
			System.out.println("Press 4 for Delete Book Record :");
			System.out.println("Press 5 for Add a Book at a Specific Position:");
			System.out.println("Press 6 for Exit !");
			choice=s.nextInt();
			if(choice==1) {
				System.out.println("Enter Book  ID :");
				String id=s.next();
				System.out.println("Enter Book Name :");
				String name=s.next();
				System.out.println("Enter Book Price :");
				int price=s.nextInt();
				Book a=new Book(id,name,price);
				if(count==arr.length-1) {
					Book [] newarr=new Book[arr.length+3];
					for(int i=0;i<arr.length;i++) {
						newarr[i]=arr[i];
					}
					arr=newarr;
				}
				arr[count+1]=a;
				count++;
			}
			else if(choice==2) {
				for(int i=0;i<=count;i++) {
					System.out.println("ID is :"+arr[i].id);
					System.out.println("Name is :"+arr[i].name);
					System.out.println("Price is :"+arr[i].price);
				}
			}
			else if(choice==3) {
				System.out.println("Enter Name to Search");
				String name=s.next();
				for(int i=0;i<=count;i++) {
					if(name.equalsIgnoreCase(arr[i].name)) {
						System.out.println("ID is :"+arr[i].id);
						System.out.println("Name is :"+arr[i].name);
						System.out.println("Price is :"+arr[i].price);
						System.out.println();
					}else {
						System.out.println("No Name Found Enter a valid Name");
					}
				}
			}
			else if (choice==4) {
				int f = 0;
				System.out.println("Enter Name to Search");
				String name=s.next();
				for(int i=0;i<=count;i++) { //searching for index
					if(name.equalsIgnoreCase(arr[i].name)) {
						f=i;
					}
					
				}
				for(int j=f;j<count;j++) {   //shiftBackwards
					arr[j]=arr[j+1];
				}
				count--;
			}
			else if(choice==5) {
				System.out.println("Enter Book  ID :");
				String id=s.next();
				System.out.println("Enter Book Name :");
				String name=s.next();
				System.out.println("Enter Book Price :");
				int price=s.nextInt();
				System.out.println("Enter Specific Position :");
				int pos=s.nextInt();
				Book a=new Book(id,name,price);
				if(count==arr.length-1) {
					Book [] newarr=new Book[arr.length+3];
					for(int i=0;i<arr.length;i++) {
						newarr[i]=arr[i];
					}
					arr=newarr;
				}
				for(int i=count+1;i>pos ; i--) {		//shiftForward
					arr[i]=arr[i-1];
				}
				arr[count+1]=a;
				count++;
			}
			
			
		}//loop
		
		

	}

	

}
