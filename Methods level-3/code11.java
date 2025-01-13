import java.util.Random;
class ZaraBonus {
    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonus(employeeData);
        displayBonusSummary(employeeData, bonusData);
    }

    // Method to generate random salaries and years of service
    public static double[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        double[][] data = new double[numberOfEmployees][2];

        for (int i = 0; i < numberOfEmployees; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // Random 5-digit salary
            data[i][1] = random.nextInt(11); // Random years of service (0 to 10)
        }
        return data;
    }

    // Method to calculate bonus and new salaries
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            int yearsOfService = (int) data[i][1];
            double bonusRate = yearsOfService > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            result[i][0] = salary + bonus; // New salary
            result[i][1] = bonus;         // Bonus amount
        }
        return result;
    }

    // Method to display the summary in tabular format
    public static void displayBonusSummary(double[][] oldData, double[][] newData) {
        System.out.println("Emp#\tOld Salary\tYears of Service\tBonus\tNew Salary");
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < oldData.length; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];
            System.out.printf("%d\t%.2f\t\t%d\t\t\t%.2f\t%.2f\n", 
                (i + 1), oldData[i][0], (int) oldData[i][1], newData[i][1], newData[i][0]);
        }
        System.out.printf("Total\t%.2f\t\t\t\t\t%.2f\t%.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }
}