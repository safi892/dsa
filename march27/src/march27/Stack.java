package march27;


public class Stack {
	private int  index=-1;
	private String [] data;
	
	
	public Stack(int s) {
		data =new String[s];
		index=-1;
	}
	
	public void push(String v) {
		if(index<data.length-1) {
			data[++index]=v;
		}else {
			System.out.println("Stack Overflow");
		}
	}
	public int getIndex() {
		return index;
	}
	
	public String pop() {
		if(index==-1) {
			return "No data";
		}
		else {
			return data[index--];
		}
	}
	public String peak() {
		if(index==-1) {
			return "No data";
		}
		else {
			return data[index];
		}
	}
	public void display() {
		if(index==-1) {
			System.out.println("No data");
		}
		for (int i=index;i>=0;i--) {
			System.out.println(data[i]+"  ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
