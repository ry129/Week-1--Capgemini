import java.util.Scanner;

 class c6SpringSeason{
	public void checkdate(int month, int day){
		
	
	// Check if the date is within the Spring season (March 20 to June 20)
        if ((month == 3 && day >= 20) || // March 20 or later
            (month == 4) ||              // Any day in April
            (month == 5) ||              // Any day in May
            (month == 6 && day <= 20)) {  // June 20 or earlier
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
}

    public static void main(String[] args) {
		// Ensure exactly three command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java DayOfWeek <month> <day> ");
            return;
        }
          // Parse command-line arguments
        int month = Integer.parseInt(args[0]); // month
        int day = Integer.parseInt(args[1]); // day
		
		c6SpringSeason obj = new c6SpringSeason();
		obj.checkdate(month,day);
	}
}