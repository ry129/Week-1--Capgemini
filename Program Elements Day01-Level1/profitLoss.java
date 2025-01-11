class profitLoss{
   public static void main(String[] args){
      
	  //cost price
	  int cp=129;
	  
	  //selling price
	  int sp=191;
	  
	  //sp>cp therefore profit
	  int profit=sp-cp;
	  
	  // profit percent 
	  double p=(double)profit/cp*100;
	  
	  //the desired output
	 System.out.println("The Cost Price is INR "+cp+ "and Selling Price is INR "+ sp );
	 System.out.println("The Profit is INR "+profit+ "and Profit Percentage is INR "+ p );
	
	 

   }
}