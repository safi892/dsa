package june10;

import java.util.ArrayList;
import java.util.Scanner;

public class graph {
	
	ArrayList<Node> nodes;
	boolean isDirected;
	
	public graph(int size,boolean isDirected) {
		this.isDirected=isDirected;
		nodes = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for(int i=0;i<size;i++) {
			System.out.println("Enter Node Name :");
			Node n= new Node();
			n.name=s.next();
			nodes.add(n);
		}
	}

	public void addEdge(String n1,String n2) {
		int index1=search(n1);
		int index2=search(n2);
		if(index1 != -1 && index2 !=-1) {
			Node source=nodes.get(index1);
			source.adjacentList.add(n2);
			if(isDirected==false) {
				Node second=nodes.get(index2);
				second.adjacentList.add(n1);
			}
		}
		else {
			System.out.println("Invalid Name");
		}
	}
	
	private int search(String n) {
		for(int i=0;i<nodes.size();i++) {
			if(nodes.get(i).name.equals(n)) {
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
				System.out.println(source.adjacentList.get(i));
			}
		}
	}
	public void maximum() {
		int max=nodes.get(0).adjacentList.size();
		int j=0;
		for(int i=1;i<nodes.size();i++) {
			int source= nodes.get(i).adjacentList.size();
			if(max< source) {
				max=source;
				j=i;
			}
		}
		System.out.println("Name is "+nodes.get(j).name +"Total Followers is"+max);
	}
}
