package may20;



public class BST {
Node root;
	
	public void insert(int st) {
		Node n=new Node();
		n.data=st;
		if(root == null) {
			root=n;
		}else {
			Node p = root;
			while(true) {
				if(p.data <n.data) {
					if(p.right == null) {
						p.right=n;
						break;
					}else {
						p=p.right;
					}
				}
				else if(p.data >n.data) {
					if(p.left == null) {
						p.left=n;
						break;
					}else {
						p=p.left;
					}
				}
				else {
					System.out.println("Data Already Exist");
					break;
				}
			}
		}
	}
	
	public void minimum() {
		if(root == null) {
			System.out.println("No Data");
			
		}else {
			Node p = root;
			
			while(p.left != null) {
				
				p=p.left;
			}
			System.out.println("Minimum Value is:"+p.data);
			
		}
		
	}
	public void maximum() {
		if(root==null)
		{
			System.out.println("empty");
		}else {
			Node p = root;
			
			while(p.right != null) {
				
				p=p.right;
			}
			System.out.println("Maximum Value is:"+p.data);
			
		}
		
	}
	public int sum() {
		return add(root);
	}
	
	private int add(Node r) {
		if(r == null) 
			return 0;
		else {
			int left=add(r.left);
			int right=add(r.right);
			return left+right+r.data;
		}
	}
	
	public int Count() {
		return count(root);
	}
	
	public int count(Node r) {
		if(r == null) 
			return 0;
		else {
			int left=count(r.left);
			int right=count(r.right);
			return left+right+1;
		}
	}
	public void average() {
		int s=add(root);
		int c= count(root);
		System.out.println("Average is :"+s/c);
	}
	public void search(int v) {
		Node p = root;
		Node pre=null;
		while(true) {
			if(p.data < v) {
				pre =p;
				if(p.right == null) {
					System.out.println("Not Found");
					break;
				}else {
					p=p.right;
				}
			}
			else if(p.data >v) {
				pre =p;
				if(p.left == null) {
					System.out.println("Not Found");
					break;
				}else {
					p=p.left;
				}
			}
			else {
				//System.out.println("Data Already Exist"+p.left);
				if(p.left == null && p.right == null) {
					if(p.data>pre.data) {
						pre.right=null;
					}else {
						pre.left=null;
					}
				}
				break;
			}
		}
	}
	

}
