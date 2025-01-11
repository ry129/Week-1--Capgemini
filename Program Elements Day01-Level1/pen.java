class pen{
   public static void main(String[] args){
      
	  //no of pens
	  int p=14;
	  
	  //no of student
	  int s=3;
	  
	  //equally distributed
	  int pen=p/s;
	  
	  // extra pen 
	  int extra=p%s;
	  
	  //the desired output
	 System.out.println("The Pen Per Student is "+ pen+ " and the remaining pen not distributed is "+ extra);
	 
	
	 

   }
}