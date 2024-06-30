package weak3task1;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		Student[] arr=new Student[2];
		int choice;
		int count=0;
		while(true) {
			System.out.println("Press 1 for Add Student :");
			System.out.println("Press 2 for Display All Student :");
			System.out.println("Press 3 for Update Student Rcord :");
			System.out.println("Press 4 for Delete Student Rcord :");
			System.out.println("Press 5 for Maximum CGPA:");
			System.out.println("Press 6 for Minimum CGPA:");
			
			System.out.println("Press 7 for Exit !");
			choice=s.nextInt();
			
			if(choice==1) {
				System.out.println("Enter Student Arid Number :");
				String aridno=s.next();
				for(int i=0;i<count;i++) {
					if(aridno.equalsIgnoreCase(arr[i].aridno)){
						System.out.println("AridNo of Student Already Exist :");
						System.out.println("Enter Student Arid Number :");
						String no=s.next();
						arr[i].aridno=no;
					}
				}
				System.out.println("Enter Student Name :");
				String name=s.next();
				System.out.println("Enter Student Age :");
				int age=s.nextInt();
				System.out.println("Enter Student GPA :");
				float cgpa=s.nextFloat();
				
							
							
				Student st=new Student(aridno,name,age,cgpa);
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
					System.out.println("RollNumber :"+arr[i].aridno);
					System.out.println("Age :"+arr[i].age);
					System.out.println("CGPA :"+arr[i].cgpa);
				}
			}
			else if(choice==3) {
				System.out.println("Enter Student Roll Number to  Update Record:");
				String search=s.next();
				for(int i=0;i<count;i++){
					if(search.equalsIgnoreCase(arr[i].aridno)) {
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
						if(update.equalsIgnoreCase("cgpa")) {
							System.out.println("Enter Student CGPA :");
							float cgpa=s.nextFloat();
							arr[i].cgpa=cgpa;
						}
					}
				}
				System.out.println("Record Updated Successfully!");
			}
			else if(choice==4) {
				int f=0;
				System.out.println("Enter Student Roll Number to  Delete Record:");
				String search=s.next();
				for(int k=0, i=0;i<count;i++) {
					if(search.equalsIgnoreCase(arr[i].aridno)) {
						f=i;
					}
						
					
				}
				for(int j=f;j<count;j++) {   
					arr[j]=arr[j+1];
				}
				count--;
				
				
				
				System.out.println("Record Deleted Successfully!");
			}
			else if(choice==5) {
				Student max=arr[0];
				for(int i=0;i<count;i++) {
					if(arr[i].cgpa>max.cgpa) {
						max=arr[i];
					}
				}
				System.out.println("Name :"+max.name);
				System.out.println("RollNumber :"+max.aridno);
				System.out.println("Age :"+max.age);
				System.out.println("Maximum CGPA :"+max.cgpa);
				
			}
			else if(choice==6) {
				Student min=arr[0];
				for(int i=0;i>count;i++) {
					if(arr[i].cgpa<min.cgpa) {
						min=arr[i];
					}
				}
				System.out.println("Name :"+min.name);
				System.out.println("RollNumber :"+min.aridno);
				System.out.println("Age :"+min.age);
				System.out.println("Minimum CGPA :"+min.cgpa);
				
			}
			
			else if(choice==7) {
				break;
				
			}
			
			
		}//loop
		
		
	}

}
