 import java.util.Scanner;
 import java.util.*;
 class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Main method to test the UnitConverter class
    public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter in km:");
      double km=sc.nextDouble();
	  System.out.println("Enter in miles:");
	  double miles=sc.nextDouble();
	  System.out.println("Enter in meters:");
		double meters=sc.nextDouble();
		System.out.println("Enter in feet:");
		double feet=sc.nextDouble();
        

        // Test the methods
        System.out.println(km + " kilometers is equal to " + convertKmToMiles(km) + " miles.");
        System.out.println(miles + " miles is equal to " + convertMilesToKm(miles) + " kilometers.");
        System.out.println(meters + " meters is equal to " + convertMetersToFeet(meters) + " feet.");
        System.out.println(feet + " feet is equal to " + convertFeetToMeters(feet) + " meters.");
    }
}
