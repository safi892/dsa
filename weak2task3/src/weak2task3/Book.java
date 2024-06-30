package weak2task3;

public class Book {
	String id,name;
	int price;
	
	public Book(String i,String n,int p) {
		id=i;
		name=n;
		price=p;
	}
	private Book[] data=new Book[5];
	private int  index=-1;
	
	public Book[] getData() {
		return data;
	}
	
	public void insertAtLast(Book v) {
		if(index==data.length-1) {
			growArray();
		}
		data[index+1]=v;
		index++;
		
	}
	private void growArray() {
		Book [] temp =new Book[data.length+3];
		for(int i=0; i<data.length; i++) {
			temp[i]=data[i];
		}
		data=temp;
	}
	public void display() {
		for(int i=0; i<=index; i++) {
			System.out.println("Book Id :"+data[i].id);
			System.out.println("Book Name :"+data[i].name);
			System.out.println("Book Price :"+data[i].price);
		}
	}
	private void shiftForward(Book v) {
		for(int i=index+1;i>0 ; i--) {
			data[i]=data[i-1];
		}
	}
	public void insertAtStart(Book v) {
		if(index==data.length-1) {
			growArray();
		}
		shiftForward(v);
		data[0]=v;
		index++;
		
	}
	
	
	
	
	
}
