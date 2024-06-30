package circulrQueue;

public class CircularQueue {
	int[] data =new int[5];
	int first=-1,last=-1;
	
	
	public void enQueue(int v) {
		if(first == -1) {
			data[0] =v;
			first = 0;
			last = 0;
		}else {
			int newPos = (last +1)%data.length;
			if (first != newPos) {
				data[newPos] = v;
				last = newPos;
			}else {
				System.out.println("Queue is Full !");
			}
		}
	}
	public int deQueue() {
		if(first == -1) {
			return -1;
		}
		else if(first == last){
			int v = data[first];
			first = -1;
			last = -1;
			return v;
		}
		else {
			int v = data[first];
			first = (first + 1)%data.length;
			return v;
		}
	}
	public int peek() {
		if(first == -1) {
			return -1;
		}
		else {
			int v = data[first];
			return v;
		}
	}
	public void display() {
		int ff=first;
		for(int i=ff ; i <= last;  i++) { 
			
			System.out.println("Data is: "+data[i]);
			ff = (ff + 1)%data.length;
		}
	}

}
