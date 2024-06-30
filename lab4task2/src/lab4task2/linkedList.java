package lab4task2;

public class linkedList {
	Node start;
	int count=0;
	
	
	
	public void insertAtStart(examScore e) {
		Node n=new Node();
		String d=e.getName();
		n.data.setName(e.getName());
		n.data.setScore(e.getScore());
		
		if(start==null) {
			start=n;
			count++;
		}else {
			n.nextAddress=start;
			start=n;
			count++;
		}	
	}
	
	public void display() {
		Node temp=start;
		while(temp!=null) {
			System.out.println("Name is "+temp.data.getName());
			System.out.println("Name is "+temp.data.getScore());
			temp=temp.nextAddress;
		}
	}
	public int sum() {
		int sum=0;
		Node temp=start;
		while(temp!=null) {
			sum+=temp.data.getScore();
			temp=temp.nextAddress;
		}
		return sum;
	}
	public float Average() {
		float avg;
		avg =(sum()/count);
		return avg;
	}
	
	
	
	
	
}
