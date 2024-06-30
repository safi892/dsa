package may166;



public class BST {
	Node root;
	
	public void insert(Student st) {
		Node n=new Node();
		n.data.id=st.id;
		n.data.name=st.name;
		n.data.cgpa=st.cgpa;
		if(root == null) {
			root=n;
		}else {
			Node p = root;
			while(true) {
				if(p.data.cgpa >n.data.cgpa) {
					if(p.right == null) {
						p.right=n;
						break;
					}else {
						p=p.right;
					}
				}
				else if(p.data.cgpa <n.data.cgpa) {
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
	
	public Student minimum() {
		if(root == null) {
			System.out.println("No Data");
			return null;
		}else {
			Node p = root;
			
			while(p.left != null) {
				
				p=p.left;
			}
			return p.data;
			
		}
		
	}
	public void maximum() {
		if(root==null)
		{
			System.out.println("empty");
		}
		Node p = root;
		
		while(p.right != null) {
			
			p=p.right;
		}
		System.out.println("Maximum Value is:"+p.data.id);
		System.out.println("Maximum Value is:"+p.data.name);
		System.out.println("Maxximum Value is:"+p.data.cgpa);
	}

}
