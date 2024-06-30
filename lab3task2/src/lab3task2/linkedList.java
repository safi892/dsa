package lab3task2;
import java.util.*;
public class linkedList {
	private Node start = null;
	Scanner s = new Scanner(System.in); 
	
	
	public void insertAtStart(String v) {
		Node n =new Node();
		n.data=v;
		if(start==null) {
			start=n;
		}else {
			n.nextAddress=start;
			start=n;
		}
	}
	
	public void inserAtLast(String v) {
		Node n=new Node();
		n.data=v;
		if(start==null) {
			start=n;
		}else {
			Node temp=start;
			while(temp.nextAddress!=null) {
				temp=temp.nextAddress;
			}
			temp.nextAddress=n;
		}
	}
	
	public void search(String v) {
		Node temp=start;
		while(temp!= null) {
			if(temp.data.equalsIgnoreCase(v)) {
				System.out.println("Your Search Song is : "+temp.data);
			}
			
			
			temp=temp.nextAddress;
		}
	}
	public void display() {
		Node temp=start;
		while(temp!= null) {
			
				
			System.out.println(temp.data+"  ");
			
			temp=temp.nextAddress;
		}
	}
	
	public void update(String v) {
		Node temp=start;
		Node n =new Node();
		while(temp!= null) {
			if(temp.data.equalsIgnoreCase(v)) {
				
				System.out.println("Enter Name of Song :");
				String d=s.next();
				temp.data=d;
				
			}
			
			temp=temp.nextAddress;
		}
	}
	
	
	
	
}
