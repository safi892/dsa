package lab4task2;

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		linkedList l=new linkedList();
		
		int choice;
		examScore ex=new examScore();
		
		System.out.println("Enter Name");
		ex.setName(s.next());
		System.out.println("Enter Score");
		ex.setScore(s.nextInt());
		l.insertAtStart(ex);
		examScore ex2=new examScore();
		System.out.println("Enter Name");
		ex2.setName(s.next());
		System.out.println("Enter Score");
		ex2.setScore(s.nextInt());
		l.insertAtStart(ex2);
		l.display();
		System.out.println("Sum of Score is :"+l.sum());
		System.out.println("Average of Score is :"+l.Average());
		
		

	}//amin

}
