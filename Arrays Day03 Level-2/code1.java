import java.util.Scanner;
class ZaraBonusProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays to store salary, years of service, new salary, and bonus
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        
        // Variables to store total bonus, old salary, and new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        // Input loop for the employee data
        for (int i = 0; i < 10; i++) {
            // Get salary and years of service, check for validity
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = scanner.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive value.");
                    continue;
                }
                break;
            }
            
            while (true) {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative value.");
                    continue;
                }
                break;
            }
        }
        
        // Loop to calculate bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            
            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];
            
            // Accumulate totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        
        // Output the results
        System.out.println("\nSummary of Salaries and Bonuses:");
        System.out.println("--------------------------------------------------");
        System.out.println("Employee\tOld Salary\tYears of Service\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t\t" + salary[i] + "\t\t" + yearsOfService[i] + "\t\t" + bonus[i] + "\t" + newSalary[i]);
        }
        
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        scanner.close();
    }
}