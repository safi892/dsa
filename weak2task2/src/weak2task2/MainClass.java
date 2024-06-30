package weak2task2;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		Student[] arr=new Student[2];
		Student[] newarr=new Student[arr.length-1];
		int choice;
		int count=0;
		
		while(true) {
			System.out.println("Press 1 for Add Student :");
			System.out.println("Press 2 for Display All Student :");
			System.out.println("Press 3 for Update Student Rcord :");
			System.out.println("Press 4 for Delete Student Rcord :");
			System.out.println("Press 5 for Add a Student at a Specific Position:");
			System.out.println("Press 6 for Exit !");
			choice=s.nextInt();
			
			if(choice==1) {
				System.out.println("Enter Student Roll Number :");
				String rollno=s.next();
				System.out.println("Enter Student Name :");
				String name=s.next();
				System.out.println("Enter Student Age :");
				int age=s.nextInt();
				Student st=new Student(rollno,name,age);
				if(count==arr.length) {
					Student [] temp =new Student[arr.length+3];
					for(int i=0; i<arr.length; i++) {
						temp[i]=arr[i];
					}
					arr=temp;
				}
				arr[count]=st;
				count++;
			}
			else if(choice==2) {
				for(int i=0;i<count;i++) {
					System.out.println("Name :"+arr[i].name);
					System.out.println("RollNumber :"+arr[i].rollno);
					System.out.println("Age :"+arr[i].age);
				}
			}
			else if(choice==3) {
				System.out.println("Enter Student Roll Number to  Update Record:");
				String search=s.next();
				for(int i=0;i<count;i++){
					if(search.equalsIgnoreCase(arr[i].rollno)) {
						System.out.println("Which Record you want to Update Name or Age");
						String update=s.next();
						if(update.equalsIgnoreCase("name")) {
							System.out.println("Enter Student Name :");
							String name=s.next();
							arr[i].name=name;
						}
						if(update.equalsIgnoreCase("age")) {
							System.out.println("Enter Student Age :");
							int age=s.nextInt();
							arr[i].age=age;
						}
					}
				}
				System.out.println("Record Updated Successfully!");
			}
			else if(choice==4) {
				System.out.println("Enter Student Roll Number to  Delete Record:");
				String search=s.next();
				for(int k=0, i=0;i<count;i++) {
					if(search.equalsIgnoreCase(arr[i].rollno)) {
						continue;
					}else {
						newarr[k]=arr[i];
						
						count--;
					}
				}
				arr=newarr;
				
				System.out.println("Record Deleted Successfully!");
			}
			else if(choice==5) {
				System.out.println("Enter Student Roll Number :");
				String rollno=s.next();
				System.out.println("Enter Student Name :");
				String name=s.next();
				System.out.println("Enter Student Age :");
				int age=s.nextInt();
				System.out.println("Enter Specific Position :");
				int pos=s.nextInt();
				Student st=new Student(rollno,name,age);
				if(pos>=0 && pos<=count) {
					if(count==arr.length) {
						Student [] temp =new Student[arr.length+3];
						for(int i=0; i<arr.length; i++) {
							temp[i]=arr[i];
						}
						arr=temp;
					}
					for(int i=count;i>pos ; i--) {		//shiftForward
						arr[i]=arr[i-1];
					}
					arr[pos]=st;
					count++;
					
				}else {
					System.out.println("Not Possible !");
				}
				
			}
			else if(choice==6) {
				break;
				
			}
			
			
		}//loop
		

	}

}
