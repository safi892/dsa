package priorityqueue;

public class Priority {

	Patient [] data = new Patient[10];
	int index=-1;
	
	public void enQueue(Patient v) {
		Patient obj= new Patient();
		obj.id = v.id;
		obj.name = v.name;
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
	}//enqueue
	
	public Patient deQueue() {
		Patient p;
		p=data[0];
		for(int i =0 ;i<index; i++) {
			data[i] =data[i+1];
		}
		index--;
		return p;
	}
	public void display() {
		for(int i=0; i<=index;i++) {
			System.out.println("Name is :"+data[i].name);
			System.out.println("ID is :"+data[i].id);
			System.out.println("Priority is :"+data[i].priority);
		}
	}
	public Boolean isEmpty() {
		if(index == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
}



