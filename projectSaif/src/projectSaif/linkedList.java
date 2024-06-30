package projectSaif;


public class linkedList {
	
	Node start;
	
	public void insertAtStart(Bike b) {
		Node n=new Node();
		n.data.model=b.model;
		n.data.price=b.price;
		n.data.company=b.company;
		n.data.quantity=b.quantity;
		
		if(start==null) {
			start=n;
		}else {
			Node temp=start;
			boolean forSearch=false;
			Node pre=null;
			
			while(temp.nextAddress != null) {
				if(temp.data.model.equalsIgnoreCase(b.model) && temp.data.company.equalsIgnoreCase(b.company)
						&& (temp.data.price==b.price) ) {
					
					if(temp.data.quantity>=1) {
						
						temp.data.quantity=temp.data.quantity + b.quantity;
						forSearch = true;
					}
				}
			    temp=temp.nextAddress;
			}
			if(forSearch == false) {
				n.nextAddress=start;
				start=n;
			}
		}
	}
	
	public void insertLast(Bike b) {
		Node n=new Node();
		n.data.model=b.model;
		n.data.price=b.price;
		n.data.company=b.company;
		n.data.quantity=b.quantity;
		
		if(start==null) {
			start=n;
		}else {
			Node serch=start;
			while(serch.nextAddress != null) {
				serch=serch.nextAddress;
			}
			Node temp=start;
			boolean forSearch=false;
			Node pre=null;
			
			while(temp.nextAddress != null) {
				if(temp.data.model.equalsIgnoreCase(b.model) && temp.data.company.equalsIgnoreCase(b.company)
						&& (temp.data.price==b.price) ) {
					
					if(temp.data.quantity>=1) {
						
						temp.data.quantity=temp.data.quantity + b.quantity;
						forSearch = true;
					}
				}
			    temp=temp.nextAddress;
			}
			if(forSearch == false) {
				serch.nextAddress=n;
			}
			
			
		}
	}

	public void insert(Bike b) {
		Node n=new Node();
		n.data.model=b.model;
		n.data.price=b.price;
		n.data.company=b.company;
		n.data.quantity=b.quantity;
		if(start==null) {
			start=n;
		}else {
			Node temp=start;
			boolean forSearch=false;
			Node pre=null;
			
			while(temp.nextAddress != null) {
				if(temp.data.model.equalsIgnoreCase(b.model) && temp.data.company.equalsIgnoreCase(b.company)
						&& (temp.data.price==b.price) ) {
					
					if(temp.data.quantity>=1) {
						
						temp.data.quantity=temp.data.quantity + b.quantity;
						forSearch = true;
					}
				}
			    temp=temp.nextAddress;
			}
			if(forSearch == false) {
				
				temp.nextAddress=n;
			}
		}
	}

	
	public void delete(String  v) {
		Node temp=start;
		Node pre=null;
		while(!temp.data.model.equalsIgnoreCase(v)  && temp.nextAddress != null) {
			pre =temp;
			temp=temp.nextAddress;
		}
		if(temp.data.model.equalsIgnoreCase(v)) {
			
			if(pre == null) {
				if(temp.data.quantity <= 1 ){
					start=start.nextAddress;
					System.out.println("Data Deleted");
				}
				else if(temp.data.quantity > 1) {
					temp.data.quantity--;
					System.out.println("Number of Quantity Reduced");
				}
			}
			else {
				if(temp.data.quantity > 1) {
					temp.data.quantity--;
					System.out.println("Number of Quantity Reduced");
				}
				else if(temp.data.quantity  < 2){
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
			System.out.println("Model "+temp.data.model);
			System.out.println("Company  "+temp.data.company);
		    System.out.println("Price  "+temp.data.price);
		    System.out.println("Quantity "+temp.data.quantity);
		    System.out.println();
		    temp=temp.nextAddress;
		}
	}
	public void search(String m) {
		Node temp = start;
		while(temp != null) {
			if(temp.data.model.equalsIgnoreCase(m)){
				System.out.println("Model "+temp.data.model);
				System.out.println("Company  "+temp.data.company);
				System.out.println("Price  "+temp.data.price);
				System.out.println("Quantity "+temp.data.quantity);
				System.out.println();
			}
			
		    temp=temp.nextAddress;
		}
	}
	
	public void deleteFirst() {
		Node n =new Node();
		if(start == null) {
			System.out.println("No Data");
		}else {
			Node temp=start;
			if(temp.data.quantity > 1) {
				temp.data.quantity--;
				System.out.println("Number of Quantity Reduced");
			}else if(temp.data.quantity == 0){
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
			if(temp.data.quantity > 1) {
				temp.data.quantity--;
				System.out.println("Number of Quantity Reduced");
			}else if(temp.data.quantity == 0){
				pre.nextAddress=null;
				System.out.println("Data Deleted");
			}
			
			
		}
	}
	
	
	
	
}
