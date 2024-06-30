package project;
import java.util.Scanner;
public class Tree {
	Node root;
	
	
	Scanner s= new Scanner (System.in);
	
	
	public void insert(groceryItem v) {
		Node objNode = new Node ();
		objNode.objGroceryItem.id=v.id;
		objNode.objGroceryItem.name=v.name;
		objNode.objGroceryItem.price=v.price;
		objNode.objGroceryItem.quantity=v.quantity;
		if(root == null) 
			root=objNode;
		else {
			Node p = root;
			while(true) {
				if(p.objGroceryItem.name.compareTo(objNode.objGroceryItem.name)<0) {
					if(p.right == null) {
						p.right=objNode;
						break;
					}else {
						p=p.right;
					}
				}
				else if(p.objGroceryItem.name.compareTo(objNode.objGroceryItem.name)>0) {
					if(p.left == null) {
						p.left=objNode;
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
			System.out.println("Name is :"+r.objGroceryItem.name);
			System.out.println("ID is :"+r.objGroceryItem.id);
			System.out.println("Price is :"+r.objGroceryItem.price);
			System.out.println("Quantity is :"+r.objGroceryItem.quantity);
			inOrder(r.right);
		}	
	}
	
	public void search(String id) {
		Node r=root;
		while(r!=null && !r.objGroceryItem.name.equalsIgnoreCase(id)) {
			if(r.objGroceryItem.name.compareTo(id)<0) {
				r=r.right;
			}else
				r=r.left;
		}
		if(r == null) {
			System.out.println("No Data Found");
		}
		else {
			System.out.println("Name is :"+r.objGroceryItem.name);
			System.out.println("ID is :"+r.objGroceryItem.id);
			System.out.println("Price is :"+r.objGroceryItem.price);
			System.out.println("Quantity is :"+r.objGroceryItem.quantity);
		}
	}
	
	public void update(String id) {
		Node r=root;
		while(r!=null && !r.objGroceryItem.name.equalsIgnoreCase(id)) {
			if(r.objGroceryItem.name.compareTo(id)<0) {
				r=r.right;
			}else
				r=r.left;
		}
		if(r == null) {
			System.out.println("No Data Found");
		}
		else {
			System.out.println("What you want yo update ID,Price,Quantity");
			String store=s.next();
			if(store.equalsIgnoreCase("id")) {
				System.out.println("Enter ID to Update ");
				int i=s.nextInt();
				r.objGroceryItem.id=i;
			}
			else if(store.equalsIgnoreCase("price")) {
				System.out.println("Enter Price to Update ");
				int i=s.nextInt();
				r.objGroceryItem.price=i;
			}
			else if(store.equalsIgnoreCase("quantity")) {
				System.out.println("Enter Quantity to Update ");
				int i=s.nextInt();
				r.objGroceryItem.quantity=i;
			}
			else {
				System.out.println("Invalid input");
			}
			
			
			
			System.out.println("Name is :"+r.objGroceryItem.name);
			System.out.println("ID is :"+r.objGroceryItem.id);
			System.out.println("Price is :"+r.objGroceryItem.price);
			System.out.println("Quantity is :"+r.objGroceryItem.quantity);
		}
	}
	Node t=null;
	
	public groceryItem delete(String id) {
		Node r=root;Node parent=null;
		while(r!=null && !r.objGroceryItem.name.equalsIgnoreCase(id)) {
			parent=r;
			if(r.objGroceryItem.name.compareTo(id)<0) {
				r=r.right;
			}else
				r=r.left;
		}
		if(r == null) {
			System.out.println("No Data Found");
		}
		else {
			if(r.left == null && r.right == null) {
				System.out.println("case 0");
				if(parent == null) {
					t=root;
					root=null;
				}
				else if(id.compareTo(r.objGroceryItem.name)>0) {
					t=parent.right;
					parent.right=null;
				}
				else {
					t=parent.left;
					parent.left=null;
				}	
			}
			else if(r.left == null) {
				System.out.println("case 1");
				if(parent == null) {
					t=root;
					root=root.right;
				}
				else if(parent.objGroceryItem.name.compareTo(id)<0) {
					t=r;
					parent.right=r.right;
				}	
				else {
					t=r;
					parent.left=r.right;
				}	
			}
			else if(r.right == null) {
				System.out.println("case 2");
				if(parent == null) {
					t=root;
					root=root.left;
				}
				else if(parent.objGroceryItem.name.compareTo(id)<0) {
					t=r;
					parent.right=r.left;
				}
				else {
					t=r;
					parent.left=r.left;
				}
			}
			else {
				System.out.println("case 3");
				Node maxParent=null;
				Node max=r.left;
				while(max.right != null) {
					maxParent=max;
					max=max.right;
				}
				if(maxParent != null) {
					t=r;
					r.objGroceryItem.name= max.objGroceryItem.name;
					maxParent.right=max.left;
				}else {
					t=r;
					r.objGroceryItem.name=max.objGroceryItem.name;
					r.left=max.left;
				}
			}
		}
		return t.objGroceryItem;
		
	}//delete
	

	
}
