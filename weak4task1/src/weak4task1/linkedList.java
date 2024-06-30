package weak4task1;

public class linkedList {
	private Node start=null;
	
	public void insertatFirst(float v){
		Node n=new Node();
		n.data=v;
		if(start==null) {
			start=n;
		}else {
			n.nextAddress=start;
			start=n;
		}
	}
	public void display() {
		Node temp=start;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.nextAddress;
			
		}
	}
	public Double average() {
		Node temp=start;
		Double sum = 0.0;
		while(temp!=null) {
			sum+=temp.data;
			temp=temp.nextAddress;
		}
		return sum;
		
	}
	public Float Mininmum() {
		Node temp=start;
		Float min = temp.data;
		while(temp!=null) {
			if(min>temp.data) {
				min=temp.data;
			}
			temp=temp.nextAddress;
		}
		return min;
	}
	public Float Maximum() {
		Node temp=start;
		Float max = temp.data;
		while(temp!=null) {
			if(max<temp.data) {
				max=temp.data;
			}
			temp=temp.nextAddress;
		}
		return max;
	}

}
