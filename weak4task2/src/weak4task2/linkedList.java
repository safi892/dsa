package weak4task2;

import java.util.Scanner;

public class linkedList {
	private Node start=null;
	int count=0;
	
	
	public void insertLast(int v) {
		Node n=new Node();
		n.data=v;
		if(start==null) {
			start=n;
			count++;
		}else {
			Node temp=start;
			while(temp.nextAddress!=null) {
				temp=temp.nextAddress;
			}
			temp.nextAddress=n;
			count++;
		}
	}
	public void insertatFirst(int v){
		Node n=new Node();
		n.data=v;
		if(start==null) {
			start=n;
			count++;
		}else {
			n.nextAddress=start;
			start=n;
			count++;
		}
	}
	
	public void insertSpecific(int v,int p) {
		Node n=new Node();
		n.data=v;
		Node pre = null;
		Node temp=start;
		if(start==null) {
			start=n;
			count++;
		}else {
			
			while(temp.data != p && temp.nextAddress!=null) {
				pre =temp;
				temp=temp.nextAddress;
				
			}
			if(temp.data==p) {
				if(pre==null) {
					insertatFirst(v);
				}else {
					pre.nextAddress=n;
					n.nextAddress=temp;
				}
			}
			else {
				System.out.println("Not Found");
			}
				
		}
		
		
	}
		
	
	public void display() {
		Node temp=start;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.nextAddress;
			
		}
	}
	
		
	public void deleteFirst() {
		Node n=new Node();
		
		if(start==null) {
			System.out.println("No Data ! ");
		}else {
			start=start.nextAddress;
		}
	}
	
	public void deleteLast() {
		Node n=new Node();
		Node pre = null;
		Node temp=start;
		if(start==null) {
			System.out.println("No Data ! ");
		}else {
			
			
			while(temp.nextAddress!=null) {
				pre =temp;;
				temp=temp.nextAddress;
				
			}
			if(pre==null) {
				start=null;
			}else {
				pre =pre.nextAddress=null;
			}
		}
		
	}
	
	public void deleteSpecific(int v) {
		Node n=new Node();
		Node pre = null;
		Node temp=start;
		
		if(start==null) {
			System.out.println("No Data ! ");
		}else {
			
			while(temp.data != v && temp.nextAddress!=null) {
				pre =temp;;
				temp=temp.nextAddress;
				
			}
		}
		if(temp.data==v) {
			if(pre==null) {
				start=start.nextAddress;
			}else {
				pre.nextAddress=temp.nextAddress;
			}
		}else {
			System.out.println("Not Found");
		}
		
	}
	public void update(int v,int d) {
		Node temp=start;
		Node n =new Node();
		while(temp!= null) {
			if(temp.data==v) {
				
				
				temp.data=d;
				
			}
			
			temp=temp.nextAddress;
		}
	}
	
	public int sum() {
		int sum=0;
		Node temp=start;
		while(temp!=null) {
			sum+=temp.data;
			temp=temp.nextAddress;
		}
		return sum;
	}
	public float Average() {
		float avg;
		avg =(sum()/count);
		return avg;
	}
	

}//class
