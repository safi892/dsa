package april15;

public class Queue {
	
	Node first,last;
	
	public void enQueue(DegreeDetails d) {
		Node n=new Node();
		n.data.name = d.name;
		n.data.degree = d.degree;
		n.data.pasingYear = d.pasingYear;
		
		if(first == null) {
			first = n;
			last = n;
		}else {
			last.nextAddress = n;
			last = n;
			
		}
	}
	
	public DegreeDetails deQueue() {
		if(first == null) {
			return null;
		}else {
			DegreeDetails dd = first.data;
			first = first.nextAddress;
			return dd;
		}
	}
	public DegreeDetails peek() {
		if(first == null) {
			return null;
		}else {
			DegreeDetails dd = first.data;
			return dd;
		}
	}

}
