package april16;



public class Queue {
	
	Node first=null,last=null;
	
	public void enQueue(int d) {
		Node n=new Node();
		n.data=d;
		if(first == null) {
			first = n;
			last = n;
		}else {
			last.nextAddress = n;
			last = n;
			
		}
	}
	
	public int deQueue() {
		if(first == null) {
			return (Integer) null;
		}else {
			int dd = first.data;
			first = first.nextAddress;
			return dd;
		}
	}
	public int peek() {
		if(first == null) {
			return (Integer) null;
		}else {
			int dd = first.data;
			return dd;
		}
	}
	
	public void display() {
		Node temp=first;
		while(temp!=null) {
			System.out.println("Data :"+temp.data);
			temp=temp.nextAddress;
			
		}
	}

}

