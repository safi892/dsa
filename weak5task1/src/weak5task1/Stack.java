package weak5task1;

public class Stack {
	private int  index=-1;
	private char[] data;
	
	
	public Stack(int s) {
		data =new char[s];
		index=-1;
	}
	
	public void push(char v) {
		if(index<data.length-1) {
			data[++index]=v;
		}else {
			System.out.println("Stack Overflow");
		}
	}
	
	public char pop() {
		if(index==-1) {
			return '\0';
		}
		else {
			return data[index--];
		}
	}
	public char peak() {
		if(index==-1) {
			return '\0';
		}
		else {
			return data[index];
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
