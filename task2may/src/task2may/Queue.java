package task2may;


public class Queue {
	
	Team[] data = new Team[10];
	int index=-1;
	public void enQueue(Team v) {
		Team obj= new Team();
		obj.designation = v.designation;
		obj.document = v.document;
		obj.priority = v.priority;
		
		if(index == -1) {
			data[0] = obj;
			index++;
		}else {
			for(int i = 0 ;i <= index; i++) {
				if(obj.priority < data[i].priority) {
					for(int j = index+1; j > i; j--) {
						data[j] = data[j-1];
					}
					data[i] =obj;
					index++;
					return;
				}
			}
			index++;
			data[index] = obj;
		}
	}
	
	public Team deQueue() {
		Team p;
		p=data[0];
		for(int i =0 ;i<index; i++) {
			data[i] =data[i+1];
		}
		index--;
		return p;
	}
	public void display() {
		for(int i=0; i<=index;i++) {
			
			System.out.println("Document is :"+data[i].document);
			System.out.println("Designation is :"+data[i].designation);
			System.out.println("Priority is :"+data[i].priority);
			
		}
	}
}
