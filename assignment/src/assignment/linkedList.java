package assignment;


public class linkedList {
	Node start =null,last;
	
	public void insertAtStart(Task b) {
		Node n=new Node();
		n.data.id=b.id;
		n.data.description=b.description;
		n.data.date=b.date;
		n.data.priority=b.priority;
		n.data.status=b.status;
		
		if(start==null) {
			start=n;
			last=n;
		}else {
			n.nextAddress=start;
			start=n;
		}
	}
	
	public void inserAtLast(Task b) {
		Node n=new Node();
		n.data.id=b.id;
		n.data.description=b.description;
		n.data.date=b.date;
		n.data.priority=b.priority;
		n.data.status=b.status;
		if(start==null) {
			start=n;
			last=n;
		}else {
			last.nextAddress = n;
			last = n;
		}
	}
	
	public void display() {
		
		Node temp=start;
		while(temp !=  null) {
			System.out.println("Task ID is :"+temp.data.id);
			System.out.println("Task Description is :"+temp.data.description);
			System.out.println("Task Date is :"+temp.data.date);
			System.out.println("Task Priority is :"+temp.data.priority);
			System.out.println("Task Status is :"+temp.data.status);
			
			temp=temp.nextAddress;
		}
	}
	
	public void search(String id) {
		Node temp=start;
		while(temp !=  null) {
			if(temp.data.id.equalsIgnoreCase(id) ){
				System.out.println("Task ID is :"+temp.data.id);
				System.out.println("Task Description is :"+temp.data.description);
				System.out.println("Task Date is :"+temp.data.date);
				System.out.println("Task Priority is :"+temp.data.priority);
				System.out.println("Task Status is :"+temp.data.status);
				System.out.println();
			}
			temp=temp.nextAddress;
		}
	}
	
	public void delete(String id) {
		Node temp = start;
		Node pre = null;
		if ( start == null) {
			System.out.println("No data");
		}else {
			while(!temp.data.id.equalsIgnoreCase(id) && temp.nextAddress != null) {
				pre = temp;
				temp = temp.nextAddress;
			}
		}
		
		if(temp.data.id.equalsIgnoreCase(id)) {
			if(pre == null) {
				start = start.nextAddress;
			}else {
					pre.nextAddress =temp.nextAddress;
			}
		}else {
			System.out.println("No data Found");
		}
	}
	
	public void update(String id, String status) {
		Node temp=start;
		while(temp != null) {
			if(temp.data.id.equalsIgnoreCase(id)) {
				temp.data.status=status;
				System.out.println("Status Updated Successfully");
			}
			temp=temp.nextAddress;
		}
	}
	
	
	
}
