package newTask;

public class linkedList {
	Node start;
	
	
	public void insertAtStart(Book b) {
		Node n=new Node();
		n.data.id=b.id;
		n.data.price=b.price;
		n.data.title=b.title;
		n.data.subject=b.subject;
		n.data.noOfCopies=b.noOfCopies;
		
		if(start==null) {
			start=n;
		}else {
			n.nextAddress=start;
			start=n;
		}
	}
	
	public void inserAtLast(Book b) {
		Node n=new Node();
		n.data.id=b.id;
		n.data.price=b.price;
		n.data.title=b.title;
		n.data.subject=b.subject;
		n.data.noOfCopies=b.noOfCopies;
		if(start==null) {
			start=n;
		}else {
			Node temp=start;
			while(temp.nextAddress != null) {
				temp=temp.nextAddress;
			}
			temp.nextAddress=n;
		}
	}
	
	public void insertSpecific(Book b ,int id) {
		Node n=new Node();
		n.data.id=b.id;
		n.data.price=b.price;
		n.data.title=b.title;
		n.data.subject=b.subject;
		n.data.noOfCopies=b.noOfCopies;
		
		Node pre=null,temp;
		if(start==null) {
			start=n;
		}else {
			temp=start;
			while(temp.data.id != id && temp.nextAddress != null) {
				pre=temp;
				temp=temp.nextAddress;
			}
			if(temp.data.id == id) {
				if(pre == null) {
					insertAtStart(b);
				}else {
					pre.nextAddress = n;
					n.nextAddress = temp;
				}
			}else {
				System.out.println(" Data Not Found");
			}
		}
	}
	
	public void deleteFirst() {
		Node n =new Node();
		if(start == null) {
			System.out.println("No Data");
		}else {
			Node temp=start;
			if(temp.data.noOfCopies > 1) {
				temp.data.noOfCopies--;
				System.out.println("Number of Quantity Reduced");
			}else if(temp.data.noOfCopies == 0){
				start=start.nextAddress;
				System.out.println("Data Deleted");
			}
			
		}
	}
	public void deleteLast() {
		Node n=new Node();
		Node pre = null,temp = null;
		
		if(start == null) {
			System.out.println("No Data");
		}
		else {
			temp = start;
			while(temp.nextAddress != null) {
				pre=temp;
				temp=temp.nextAddress;
			}		
		}
		if(pre == null) {
			start=null;
		}else {
			if(temp.data.noOfCopies > 1) {
				temp.data.noOfCopies--;
				System.out.println("Number of Quantity Reduced");
			}else if(temp.data.noOfCopies == 0){
				pre.nextAddress=null;
				System.out.println("Data Deleted");
			}
			
			
		}
	}
	
	public void deleteSpecific(int v) {
		Node n =new Node();
		Node temp=start;
		Node pre=null;
		if(start==null) {
			start=n;
		}else {
			
			while(temp.data.id != v && temp.nextAddress != null) {
				pre =temp;
				temp=temp.nextAddress;
			}
			
		}
		if(temp.data.id == v) {
			if(pre == null) {
				start=start.nextAddress;
			}else {
				if(temp.data.noOfCopies > 1) {
					temp.data.noOfCopies--;
					System.out.println("Number of Quantity Reduced");
				}else if(temp.data.noOfCopies == 0){
					pre.nextAddress=temp.nextAddress;
					System.out.println("Data Deleted");
				}
				
			}
		}else {
			System.out.println("Data Not Found");
		}
	}
	public void display() {
		Node temp = start;
		while(temp != null) {
			System.out.println("ID "+temp.data.id);
			System.out.println("Title  "+temp.data.title);
		    System.out.println("Price  "+temp.data.price);
		    System.out.println("Number of Copies   "+temp.data.noOfCopies);
		    System.out.println("Subject "+temp.data.subject);
		    System.out.println();
		    temp=temp.nextAddress;
		}
	}
	
	
}
