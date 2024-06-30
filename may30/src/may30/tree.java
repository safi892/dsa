package may30;

public class tree {

	Node root;

	public void insert(String st) {
		Node n = new Node ();
		n.data=st;
		
		
		if(root == null) {
			root=n;
		}else {
			Node p = root;
			while(true) {
				if(p.data.compareTo(n.data)<0) {
					if(p.right == null) {
						p.right=n;
						break;
					}else {
						p=p.right;
					}
				}
				else if(p.data.compareTo(n.data)>0) {
					if(p.left == null) {
						p.left=n;
						break;
					}else {
						p=p.left;
					}
				}
				else  {
					System.out.println("Data Already Exist");
					break;
				}
			}
		}
	}//insert
	
	public void display() {
		inOrder(root);
	}
	private void  inOrder(Node r) {
		if(r != null) {
			inOrder(r.left);
			System.out.println("Name is :"+r.data);
			inOrder(r.right);
		}
			
	}
}

﻿


public class RSAExample {
	﻿

}
}

	
	
	
}