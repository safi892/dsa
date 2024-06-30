package may15;

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
		if(root == -1) {
			int minIndex=0;
			while(data[minIndex*2+1]!= -1) {
				minIndex=minIndex*2+1;
			}
			System.out.println("Minimum Value is:"+data[minIndex]);
		}
		
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

}
