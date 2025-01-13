import java.util.Arrays;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000); // Generates random numbers between 1000 and 9999
        }
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        // Generate 5 random 4-digit values
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display the generated numbers
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));

        // Find the average, minimum, and maximum values
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
