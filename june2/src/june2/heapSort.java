package june2;

public class heapSort {
	public static void heapifyDown(int pos, int index,int [] data) {
		int minIndex =pos;
		while (true) {
			int left = (minIndex*2)+1;
			int right = (minIndex*2)+2;
			if(left <= index && data[left] > data[minIndex]) {
				minIndex=left;
			}
			if(right <= index && data[right] > data[minIndex]) {
				minIndex=right;
			}
			if(minIndex!= pos) {
				swap(data,pos,minIndex);
				pos = minIndex;
			}
			else {
				break;
			}
		}//loop
	}
	
	public static void swap(int a[],int p1,int p2) {
		int temp=a[p2];
		a[p2]=a[p1];
		a[p1]=temp;
	}
	public static void converArrayToHeap(int [] arr) {
		int start= (arr.length/2 )-1;
		for(int i= start;i>=0 ;i--) {
			heapifyDown(i,arr.length-1,arr);
		}
	}
	public static void heapSort(int[] arr) {
		converArrayToHeap(arr);
		int last = arr.length-1;
		while(last>0) {
			swap(arr,0,last);
			last--;
			heapifyDown(0,last,arr);
		}
	}
	public static void main(String [] args) {
		
		int [] arr= {4,78,59,8,9,23,56};
		heapSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
