import java.util.Scanner;
class Collinear{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input three points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = sc.nextDouble();
        
        // Check if the points are collinear
        boolean collinear = arePointsCollinear(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear? " + (collinear ? "Yes" : "No"));
    }

    public static boolean arePointsCollinear(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        
        return slopeAB == slopeBC && slopeAB == slopeAC;
    }
}