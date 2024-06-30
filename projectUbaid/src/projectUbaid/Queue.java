package projectUbaid;


public class Queue {
	
	
	Node first,last;
	
	public void enQueue(complaint d) {
		Node n=new Node();
		n.data.name = d.name;
		n.data.type = d.type;
		n.data.address = d.address;
		
		if(first == null) {
			first = n;
			last = n;
		}else {
			last.nextAddress = n;
			last = n;
			
		}
	}
	
	public complaint deQueue() {
		if(first == null) {
			return null;
		}else {
			complaint dd = first.data;
			first = first.nextAddress;
			return dd;
		}
	}
	public complaint peek() {
		if(first == null) {
			return null;
		}else {
			complaint dd = first.data;
			return dd;
		}
	}
	public void display() {
		Node temp=first;
		while(temp!=null) {
			System.out.println("Data :"+temp.data.name);
			System.out.println("Data :"+temp.data.type);
			System.out.println("Data :"+temp.data.address);
			temp=temp.nextAddress;
			
		}
	}

}
