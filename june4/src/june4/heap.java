package june4;

public class heap {
	
	employee[] data = new employee[20];
	int index=-1;
	
	public void insert(employee v) {
		data[++index] =v;
	}
	

	public  void heapifyDown(int pos, int index) {
		int minIndex =pos;
		while (true) {
			int left = (minIndex*2)+1;
			int right = (minIndex*2)+2;
			if(left <= index && data[left].age < data[minIndex].age) {
				minIndex=left;
			}
			if(right <= index && data[right].age < data[minIndex].age) {
				minIndex=right;
			}
			if(minIndex!= pos) {
				swap(pos,minIndex);
				pos = minIndex;
			}
			else {
				break;
			}
		}//loop
	}
	public  void swap(int p1,int p2) {
		int temp=data[p2].age;
		data[p2].age=data[p1].age;
		data[p1].age=temp;
	}
	public  void converArrayToHeap(employee[] arr) {
		int start= (arr.length/2 )-1;
		for(int i= start;i>=0 ;i--) {
			heapifyDown(i,arr.length-1);
		}
	}
	public void heapSort(employee[] e) {
		converArrayToHeap(data);
		int last = data.length-1;
		while(last>0) {
			swap(0,last);
			last--;
			heapifyDown(0,last);
		}
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}
	
}
