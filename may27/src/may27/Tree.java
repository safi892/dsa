package may27;



public class Tree {
	Node root;

	public void insert(Dict st) {
		Node n = new Node ();
		n.data.word=st.word;
		n.data.meaning=st.meaning;
		
		if(root == null) {
			root=n;
		}else {
			Node p = root;
			while(true) {
				if(p.data.word.compareTo(n.data.word)<0) {
					if(p.right == null) {
						p.right=n;
						break;
					}else {
						p=p.right;
					}
				}
				else if(p.data.word.compareTo(n.data.word)>0) {
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
			System.out.println("Word is :"+r.data);
			inOrder(r.right);
		}
			
	}
	public void search(String id) {
		Node r=root;
		while(r!=null && !r.data.word.equalsIgnoreCase(id)) {
			
			if(r.data.word.compareTo(id)<0) {
				r=r.right;
			}else
				r=r.left;
		}
		if(r == null) {
			System.out.println("No Data Found");
		}
		else {
			System.out.println("Word is :"+r.data.word);
			System.out.println("Meaning is :"+r.data.meaning);
		}
	}
}
