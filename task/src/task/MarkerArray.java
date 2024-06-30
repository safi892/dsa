package task;

public class MarkerArray {
	 private Marker[] data=new Marker[5];
     private int  index=-1;
     
     public void insertAtLast(Marker m) {
   	   if(index==data.length-1) {
   		   growArray();
   	   }
   	   data[index+1]=m;
   	   index++;
      }
      private void growArray() {
   	   Marker[] temp=new Marker[data.length+2];
   	   for(int i=0;i<data.length;i++) {
   		   temp[i]=data[i];
   	   }
   	   data=temp;
      }
      
      public void insertAtStart(Marker m) {
   	   if(index==data.length-1) {
   		   growArray();
   	   }
   	   ShiftForward(0);
   	   data[0]=m;
   	   index++;
      }
      
      private void ShiftForward(int p) {
   	   for(int i=index+1;i>p;i--)
   		   data[i]=data[i-1];
      }
      
      public void insertMarkerAtSpecificPosition(Marker m,int pos) {
   	   if(index==data.length-1) {
   		   growArray();
   	   }
   	   else if(pos>=0&&pos<=index+1) {
   		   ShiftForward(pos);
   		   data[pos]=m;
   		   index++;
   		   growArray();
   		   
   	   }
   	   else {
   		   System.out.println("Not possible");
   	   }
      }
      
      
      public void display() {
   	for(int i=0;i<=index;i++) {
   	System.out.println("Color "+data[i].color);
	System.out.println("Company  "+data[i].company);
    System.out.println("Price  "+data[i].price);
    System.out.println("isPermanent   "+data[i].isPermanent);
    System.out.println("\n");
   	}
      }
      
      public void deleteFirstMarker() {
     	  if(index==-1) {
      		   System.out.println("No data");
      	   } 
     	  else {
     		  ShiftBackward(0);
     		  index--;
     	  }
      }
      
      private void ShiftBackward(int p) {
   	   for(int i=p;i<=index;i++) {
   		   data[i]=data[i+1];
   	   }
      }
      
      
      public void deleteLastMarker() {
    	  if(index==-1) {
     		   System.out.println("No data");
     	   } 
    	  else {
    		  index--;
    	  }
     }

   
}
