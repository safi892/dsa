package may21;

public class BST {
	Node root;

	public void insert(Employee st) {
		Node n = new Node();
		n.data.id = st.id;
		n.data.name = st.name;
		n.data.age = st.age;

		if (root == null) {
			root = n;
		} else {
			Node p = root;
			while (true) {
				if (p.data.id < n.data.id) {
					if (p.right == null) {
						p.right = n;
						break;
					} else {
						p = p.right;
					}
				} else if (p.data.id > n.data.id) {
					if (p.left == null) {
						p.left = n;
						break;
					} else {
						p = p.left;
					}
				} else {
					System.out.println("Data Already Exist");
					break;
				}
			}
		}
	}// insert

	public void search(String v) {
		Node p = root;
		while (true) {

			if (p.data.name.compareTo(v) < 0) {
				if (p.right == null) {
					System.out.println("Not Found");
					break;
				} else {
					p = p.right;
				}
			} else if (p.data.name.compareTo(v) > 0) {
				if (p.left == null) {
					System.out.println("Not Found");
					break;
				} else {
					p = p.left;
				}
			} else if(p.data.name.equalsIgnoreCase(v)) {
				System.out.println("ID is :" + p.data.id);
				System.out.println("Name is :" + p.data.name);
				System.out.println("Age is :" + p.data.age);

				break;
			}
		}

	}

	public void search2(int id) {
		Node r = root;
		while (r != null && r.data.id != id) {

			if (r.data.id < id) {
				r = r.right;
			}
			else {
				r = r.left;
			}

		}
		if (r == null) {
			System.out.println("No Data Found");
		} else {
			System.out.println("Name is :" + r.data.name);
			System.out.println("ID is :" + r.data.id);
			System.out.println("Price is :" + r.data.age);
		}
	}

	public void display() {
		inOrder(root);
	}

	private void inOrder(Node r) {
		if (r != null) {
			inOrder(r.left);
			System.out.println("ID is :" + r.data.id);
			System.out.println("Name is :" + r.data.name);
			System.out.println("Age is :" + r.data.age);
			inOrder(r.right);
		}

	}

	public void delete(int v) {

	}

	public void maximum() {
		if (root == null) {
			System.out.println("empty");
		}
		Node p = root;

		while (p.right != null) {

			p = p.right;
		}
		System.out.println("Maximum Value is:" + p.data.id);
		System.out.println("Maximum Value is:" + p.data.name);
		System.out.println("Maxximum Value is:" + p.data.age);
	}

	public void minimum() {
		if (root == null) {
			System.out.println("empty");
		}
		Node p = root;

		while (p.left != null) {

			p = p.left;
		}
		System.out.println("Maximum Value is:" + p.data.id);
		System.out.println("Maximum Value is:" + p.data.name);
		System.out.println("Maxximum Value is:" + p.data.age);
	}

	public void searchByRecord(String x) {
		Node temp = root;
		while (temp != null) {
			if (temp.data.name.equalsIgnoreCase(x)) {
				System.out.println(
						temp.data.name+ " " + temp.data.id + " " + temp.data.age);
				break;
			}
			if (temp.left != null) {
				Node left = temp.left;
				if (left.data.name.equalsIgnoreCase(x)) {
					System.out.println(temp.data.name + " " + temp.data.id + " "
							+ temp.data.age);
					break;
				}
				temp = left;

			} else if (temp.right != null) {
				Node right = temp.right;
				if (right.data.name.equalsIgnoreCase(x)) {
					System.out.println(temp.data.name + " " + temp.data.id + " "
							+ temp.data.age);
					break;
				}
				temp = right;
			}
		}
	}

}
