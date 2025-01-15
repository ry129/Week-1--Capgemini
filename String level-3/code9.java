import java.util.Scanner;

public class Calendar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month (1-12):");
        int month = sc.nextInt();

        System.out.println("Enter the year:");
        int year = sc.nextInt();

        displayCalendar(month, year);
        sc.close();
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 
                             31, 31, 30, 31, 30, 31};

        // Check for leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the calendar
        System.out.println("\n   " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth[month - 1]; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) { // Move to the next line after Saturday
                System.out.println();
            }
        }
        System.out.println();
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }
}
