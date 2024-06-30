package lab9PriorityBase;


public class Priority {

	user [] data = new user[10];
	int index=-1;
	
	public void enQueue(user v) {
		user obj= new user();
		
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
	}
	
	public user deQueue() {
		user p;
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
			System.out.println("Priority is :"+data[i].priority);
		}
	}
	
}
