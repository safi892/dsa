package assignment3;


public class heapsort {
	
	patient[] data = new patient[20];
	int index=-1;
	
	public void insert(patient v) {
		data[++index] =v;
	}
	

	public  void heapifyDown(int pos, int index) {
		int minIndex =pos;
		while (true) {
			int left = (minIndex*2)+1;
			int right = (minIndex*2)+2;
			if(left <= index && data[left].soverity < data[minIndex].soverity) {
				minIndex=left;
			}
			if(right <= index && data[right].soverity < data[minIndex].soverity) {
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
		int temp=data[p2].soverity;
		data[p2].soverity=data[p1].soverity;
		data[p1].soverity=temp;
	}
	public  void converArrayToHeap(patient[] arr) {
		int start= (arr.length/2 )-1;
		for(int i= start;i>=0 ;i--) {
			heapifyDown(i,arr.length-1);
		}
	}
	public void heapSort() {
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
