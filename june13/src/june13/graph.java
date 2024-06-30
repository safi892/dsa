package june13;

import java.util.ArrayList;
import java.util.Scanner;


public class graph {
	ArrayList<Node> nodes;
	boolean isDirected;
	int i=001;
	
	public graph(int size,boolean isDirected) {
		this.isDirected=isDirected;
		nodes = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for(int i=0;i<size;i++) {
			
			Node n= new Node();
			System.out.println("Enter User Name :");
			n.data.name=s.next();
			
			n.data.id="Arid-"+i;
			i++;
			System.out.println("Enter Intrest:");
			n.data.intrest=s.next();
			nodes.add(n);
		}
	}
	
	public void addEdge(String n1,String n2) {
		int index1=search(n1);
		int index2=search(n2);
		if(index1 != -1 && index2 !=-1) {
			Node source=nodes.get(index1);
			Node second=nodes.get(index2);
			source.adjacentList.add(second.data);
			if(isDirected==false) {
				
				second.adjacentList.add(source.data);
			}
		}
		else {
			System.out.println("Invalid Name");
		}
	}
	
	private int search(String n) {
		for(int i=0;i<nodes.size();i++) {
			if(nodes.get(i).data.name.equals(n)) {
				return i;
			}
		}
		return -1;
	}
	public void displayAdjancy(String n) {
		int index= search(n);
		Node source = nodes.get(index);
		if(index != -1) {
			for(int i=0;i<source.adjacentList.size();i++) {
				System.out.println("Name is :"+source.adjacentList.get(i).name);
				System.out.println("Id is :"+source.adjacentList.get(i).id);
				System.out.println("Intrest is :"+source.adjacentList.get(i).intrest);
			}
		}
	}
	
	public void suggestFriend(String n) {
		int index= search(n);
		Node source = nodes.get(index);
		String g="";
		if(index != -1) {
			for(int i=0;i<source.adjacentList.size();i++) {
				g=g+source.adjacentList.get(i).name;
				break;
			}
			
				
			displayAdjancy(g);
			
		}
	}
	

}
