import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate delta
        double delta = Math.pow(b, 2) - (4 * a * c);

        // If delta is negative, no real roots
        if (delta < 0) {
            return new double[0]; // Return empty array
        }

        // If delta is zero, one root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        }

        // If delta is positive, two roots
        double sqrtDelta = Math.sqrt(delta);
        double root1 = (-b + sqrtDelta) / (2 * a);
        double root2 = (-b - sqrtDelta) / (2 * a);
        return new double[] { root1, root2 };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for coefficients a, b, and c
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Call the method to find roots
        double[] roots = findRoots(a, b, c);

        // Display the results
        if (roots.length == 0) {
            System.out.println("No real roots exist for the given quadratic equation.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        }

        scanner.close();
    }
}
