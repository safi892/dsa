package april1;

public class intStack {
	private int  index=-1;
	private int [] data;
	
	
	public intStack(int s) {
		data =new int[s];
		index=-1;
	}
	
	public void push(int v) {
		if(index<data.length-1) {
			data[++index]=v;
		}else {
			System.out.println("Stack Overflow");
		}
	}
	public int getIndex() {
		return index;
	}
	
	public int pop() {
		if(index==-1) {
			return 0;
		}
		else {
			return data[index--];
		}
	}
	public int peak() {
		if(index==-1) {
			return '\0';
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

