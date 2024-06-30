package weak2task1;

public class Array {
	
	private int[] data=new int[5];
	private int  index=-1;
	
	
	public void insertAtLast(int v) {
		if(index==data.length-1) {
			growArray();
		}
		data[index+1]=v;
		index++;
		
	}
	
	
	private void growArray() {
		int [] temp =new int[data.length+3];
		for(int i=0; i<data.length; i++) {
			temp[i]=data[i];
		}
		data=temp;
	}
	
	public void delete(int p) {
		if(index==-1) {
			System.out.println("No data Exist");
		}else {
			shiftBackward(p);
			index--;
		}
	}
	private void shiftBackward(int p) {
		for(int i =p; i<index;i++) {
			data[i]=data[i+1];
		}
	}
	
	
	public void display() {
		for(int i=0; i<=index; i++) {
			System.out.print("Data :"+data[i]+"  ");
		}
	}
	
	public void insertAtStart(int v) {
		if(index==data.length-1) {
			growArray();
		}
		shiftForward(v);
		data[0]=v;
		index++;
		
	}
	
	private void shiftForward(int v) {
		for(int i=index+1;i>v ; i--) {
			data[i]=data[i-1];
		}
	}
	
	
	
	public void insertAtParticular(int v,int pos) {
		
		if(pos>=0 && pos<=index+1) {
			if(index==data.length-1) {
				growArray();
			}
			shiftForward(pos);
			data[pos]=v;
			index++;
		}else {
			System.out.println("Not Possible !");
		}
		
		
	}
	
	
	
	

}