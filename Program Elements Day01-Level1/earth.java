class earth{
   public static void main(String[] args){
      
	  //radius of earth in km
	  int rkm=6378;
	  
	  
	  //value of pi
	  double pi=3.14;
	  
	  //volume 4/3*pi*rkm*rkm*rkm
	  double volumekm= (double)4/(double)3*pi*rkm*rkm*rkm;
	  
	  //radius in miles
	  double rm=rkm*0.621;
	  
	  // volume in miles
	  double volmile= (double)4/(double)3*pi*rm*rm*rm;
	  //the desired output
	 System.out.println("The volume of earth in cubic kilometers is "+volumekm+" and cubic miles is "+ volmile);
	 
   }
}