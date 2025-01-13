import java.util.*;
public class Calendar{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);
    }

    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfMonth = getFirstDayOfMonth(month, year);
        
        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        // Print leading spaces
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("    ");
        }
        
        // Print the days of the month
        int day = 1;
        for (int i = firstDayOfMonth; i < 7; i++) {
            System.out.printf("%3d ", day++);
        }
        System.out.println();
        
        // Print remaining days
        for (int i = 7; i < daysInMonth + firstDayOfMonth; i++) {
            if ((i % 7) == 0) {
                System.out.println();
            }
            System.out.printf("%3d ", day++);
        }
        System.out.println();
    }

    public static String getMonthName(int month) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (1 + x + (31 * m) / 12) % 7;
        return d;
    }
}