package may28;

public class Tree {
	Node root;
	public void insert(book b) {
		Node n=new Node();
		n.data.id=b.id;
		n.data.name=b.name;
		n.data.author=b.author;
		if(root == null) {
			root=n;
		}else {
			Node p = root;
			while(true) {
				if(p.data.id <n.data.id) {
					if(p.right == null) {
						p.right=n;
						break;
					}else {
						p=p.right;
					}
				}
				else if(p.data.id >n.data.id) {
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
	public void search(int id) {
		Node r=root;
		while(r!=null && r.data.id!= id) {
			
			if(id>r.data.id) {
				r=r.right;
			}else
				r=r.left;
		}
		if(r == null) {
			System.out.println("No Data Found");
		}
		else {
			System.out.println("ID is :"+r.data.id);
			System.out.println("Name is :"+r.data.name);
			System.out.println("Author is :"+r.data.author);
		}
	}
	public void displayAscending() {
		inOrder(root);
	}
	private void  inOrder(Node r) {
		if(r != null) {
			inOrder(r.left);
			System.out.println("ID is :"+r.data.id);
			System.out.println("Name is :"+r.data.name);
			System.out.println("Author is :"+r.data.author);
			inOrder(r.right);
		}
			
	}
	public void displayDesending() {
		preOrder(root);
	}
	private void  preOrder(Node r) {
		if(r != null) {
			inOrder(r.right);
			System.out.println("ID is :"+r.data.id);
			System.out.println("Name is :"+r.data.name);
			System.out.println("Author is :"+r.data.author);
			
			inOrder(r.left);
		}
			
	}

}
