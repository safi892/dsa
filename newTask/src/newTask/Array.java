package newTask;

public class Array {
	private Book [] data=new Book[10];
	private int index=-1;
	
	
	public void insertAtLast(Book b) {
		if(index==data.length-1) {
			growArray();
		}
		
		if (index==-1) {
			data[index+1]=b;
			index++;
		}
		else if(index!=-1){
			int searchIndex=0;
			for(int i=0;i<=index;i++) {
				if(data[i].id==b.id && data[i].title.equalsIgnoreCase(b.title) && data[i].price==b.price && data[i].subject.equalsIgnoreCase(b.subject) ) {
					searchIndex++;
					if(data[i].noOfCopies>=1) {
						data[i].noOfCopies=data[i].noOfCopies+b.noOfCopies;
					}
					
				
				}
				
			}
			if (searchIndex==0) {
				data[index+1]=b;
				index++;
				searchIndex=0;
			}
			
		}
		
		
		
	}
	private void growArray() {
		Book[] temp=new Book[data.length+3];
		for (int i=0;i<data.length;i++) {
			temp[i]=data[i];
		}
		data=temp;
	}
	
	public void insertAtStart(Book b) {
		if(index==data.length-1) {
			growArray();
		}
		shiftForward(0);
		data[0]=b;
		index++;
	}
	private void shiftForward(int p) {
		for(int i=index+1;i>p;i--) {
			data[i]=data[i-1];
		}
	}
	
	public void insertAtSpecific(Book b,int p) {
		if(index==data.length-1) {
			growArray();
		}
		
		else if(p>=0 && p<=index+1) {
			shiftForward(p);
			data[p]=b;
			index++;
		}
		else {
			System.out.println("Not Possible !");
		}
	}
	public void display() {
		for(int i=0;i<=index;i++) {
		   	System.out.println("ID "+data[i].id);
			System.out.println("Title  "+data[i].title);
		    System.out.println("Price  "+data[i].price);
		    System.out.println("Number of Copies   "+data[i].noOfCopies);
		    System.out.println("Subject "+data[i].subject);
		    System.out.println();
		   }
	}
	
	private void shiftBackward(int p) {
		for(int i=p;i<=index;i++) {
			data[i]=data[i+1];
		}
	}
	public void delete(int b) {
		if (index==-1) {
			System.out.println("No Data");
		}
		int searchIndex = 0;
		for (int i=0;i<=index;i++) {
			if(data[i].id==b) {
				searchIndex=i;
				if(data[searchIndex].noOfCopies>1){
					data[searchIndex].noOfCopies--;
					if(data[searchIndex].noOfCopies==0) {
						index--;
						System.out.println("Data Deleted");
					}
					
				}else {
					shiftBackward(searchIndex);
					index--;
					System.out.println("Data Deleted");
				}
			}
		}
		
		
	}
	

}
