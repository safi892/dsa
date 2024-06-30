package may16;

public class BST {
	
	int [] data= new int[200];
	int root=-1;
	
	public BST() {
		for(int i=0;i<data.length;i++) {
			data[i]=-1;
		}
	}
	
	public void insert(int v) {
		if(root == -1) {
			data[0]= v;
			root=0;
		}else {
			int p=root;
			while(true) {
				
				if(v > data[p]) {
					int right=2*p+2;
					if(data[right] == -1) {
						data[right] = v;
						break;
					}else {
						p=right;
					}
				}
				else if(v < data[p]) {
					int left=2*p+1;
					if(data[left] == -1) {
						data[left] = v;
						break;
					}else {
						p=left;
					}
				}
				else {
					System.out.println("Data Already Exist");
					break;
				}
			}
			
		}
	}
	
	public void search(int v) {
		int p=root;
		while(true) {
			
			if(v > data[p]) {
				int right=2*p+2;
				if(data[right] == -1) {
					System.out.println("Data Not found");
					break;
				}else {
					p=right;
				}
			}
			else if(v < data[p]) {
				int left=2*p+1;
				if(data[left] == -1) {
					System.out.println("Data Not found");
					break;
				}else {
					p=left;
				}
			}
			else {
				System.out.println("Data  Found");
				break;
			}
		}
	}//search
	
	public void minimum() {
		int min=data[0];
		
		int p=root;
		int left=0;
		while(data[left] != -1) {
			left=2*p+1;
			min=data[left];
			p=left;
			
		}
		System.out.println("Minimum Value is :"+min);
		
	}
	public void maximum() {
		int max=data[0];
		
		int p=root;
		int right=0;
		while(data[right] != -1) {
			right=2*p+2;
			max=right;
			p=right;
			
		}
		System.out.println("Maximum Value is :"+data[max]);
	}
	
	public void display() {
		int p=root;
		for(int i=0;i<data.length;i++) {
			if(data[i] != -1) {
				System.out.println(data[i]);
			}
		}
	}
	public void ascending() {
		int p=root;
		int temp;
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i] != -1 && data[j] != -1) {
					if (data[i] > data[j]) {
						temp = data[i];
						data[i] = data[j];
						data[j] = temp;
					}
				}
			}
		}
		for(int i=0;i<data.length;i++) {
			if(data[i] != -1) {
				System.out.println(data[i]);
			}
		}	
	}
	public void descending() {
		int p=root;
		int temp;
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i] != -1 && data[j] != -1) {
					if (data[i] < data[j]) {
						temp = data[i];
						data[i] = data[j];
						data[j] = temp;
					}
				}
			}
		}
		for(int i=0;i<data.length;i++) {
			if(data[i] != -1) {
				System.out.println(data[i]);
			}
		}	
	}
//		int i=0;
//		while(data[i] != -1) {
//			System.out.println(data[i]);
//			i=2*p+2;
//		}
//		while(true) {
//			
//			
//				int right=2*p+2;
//				System.out.println(data[right]);
//				if(data[right] == -1) {
//					
//					break;
//				}else {
//					p=right;
//				}
//			
//				
//				int left=2*p+1;
//				System.out.println(data[left]);
//				if(data[left] == -1) {
//					//System.out.println(data[left]);
//					break;
//				}else {
//					p=left;
//				}
//			
//		}
		
	

}
