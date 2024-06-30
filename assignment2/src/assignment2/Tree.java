package assignment2;



public class Tree {
	Node root;
	
	public void insert(patientRecord v) {
		Node obj_node = new Node();
		obj_node.obj_patient.medicalRecordNumber = v.medicalRecordNumber;
		obj_node.obj_patient.name = v.name;
		obj_node.obj_patient.medicalCondition = v.medicalCondition;
		obj_node.obj_patient.treatment = v.treatment;
		if (root == null)
			root = obj_node;
		else {
			Node for_search = root;
			while (true) {
				if(for_search.obj_patient.medicalRecordNumber < obj_node.obj_patient.medicalRecordNumber) {
					if(for_search.right == null) {
						for_search.right=obj_node;
						break;
					}else
						for_search=for_search.right;
				}
				else if(for_search.obj_patient.medicalRecordNumber > obj_node.obj_patient.medicalRecordNumber) {
					if(for_search.left == null) {
						for_search.left=obj_node;
						break;
					}else 
						for_search=for_search.right;
				}
				else {
					System.out.println("Data Already Exists");
					break;
				}

			}
		}
	}
	public void search(int id) {
		Node for_search = root;
		while(true) {
			if(for_search.obj_patient.medicalRecordNumber < id) {
				if(for_search.right == null) {
					System.out.println("Data not Found");
					break;
				}else
					for_search = for_search.right;
			}
			else if(for_search.obj_patient.medicalRecordNumber > id) {
				if(for_search.left == null) {
					System.out.println("Data not Found");
					break;
				}else
					for_search = for_search.left;
			}
			else {
				System.out.println("Patient Medical Record Number is :"+for_search.obj_patient.medicalRecordNumber);
				System.out.println("Patient Name is :"+for_search.obj_patient.name);
				System.out.println("Patient Treatment is :"+for_search.obj_patient.treatment);
				System.out.println("Patient Condition is :"+for_search.obj_patient.medicalCondition);
				
				
				break;
			}
		}
	}
	public void search2(int id) {
		Node r=root;Node parent=null;
		while(r!=null && r.obj_patient.medicalRecordNumber!=id) {
			parent=r;
			if(id>r.obj_patient.medicalRecordNumber) {
				r=r.right;
			}else
				r=r.left;
		}
		if(r == null) {
			System.out.println("No Data Found");
		}
		else {
			if( r.obj_patient.medicalRecordNumber==id) {
				System.out.println("Patient Medical Record Number is :"+r.obj_patient.medicalRecordNumber);
				System.out.println("Patient Name is :"+r.obj_patient.name);
				System.out.println("Patient Treatment is :"+r.obj_patient.treatment);
				System.out.println("Patient Condition is :"+r.obj_patient.medicalCondition);
			}
		}
	}
	public void delete(int id) {
		Node r=root;Node parent=null;
		while(r!=null && r.obj_patient.medicalRecordNumber!=id) {
			parent=r;
			if(id>r.obj_patient.medicalRecordNumber) {
				r=r.right;
			}else
				r=r.left;
		}
		if(r == null) {
			System.out.println("No Data Found");
		}
		else {
			if(r.left == null && r.right == null) {
				if(parent == null)
					root=null;
				else if(id>parent.obj_patient.medicalRecordNumber)
					parent.right=null;
				else
					parent.left=null;
			}
			else if(r.left == null) {
				if(parent == null)
					root=root.right;
				else if(id>parent.obj_patient.medicalRecordNumber)
					parent.right=r.right;
				else
					parent.left=r.right;
			}
			else if(r.right == null) {
				if(parent == null)
					root=root.left;
				else if(id<parent.obj_patient.medicalRecordNumber)
					parent.right=r.left;
				else
					parent.left=r.left;
			}
			else {
				Node maxParent=null;
				Node max=r.left;
				while(max.right != null) {
					maxParent=max;
					max=max.right;
				}
				if(maxParent != null) {
					r.obj_patient.medicalRecordNumber= max.obj_patient.medicalRecordNumber;
					maxParent.right=max.left;
				}else {
					r.obj_patient.medicalRecordNumber=max.obj_patient.medicalRecordNumber;
					r.left=max.left;
				}
			}
		}
	}//delete
	public void display() {
		inOrder(root);
	}
	private void  inOrder(Node r) {
		if(r != null) {
			inOrder(r.left);
			System.out.println("Patient Medical Record Number is :"+r.obj_patient.medicalRecordNumber);
			System.out.println("Patient Name is :"+r.obj_patient.name);
			System.out.println("Patient Treatment is :"+r.obj_patient.treatment);
			System.out.println("Patient Condition is :"+r.obj_patient.medicalCondition);
			inOrder(r.right);
		}
			
	}

}
