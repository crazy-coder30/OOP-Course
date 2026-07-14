import java.util.Scanner;

public class TriangleArea2{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter 1st arm: ");
        double arm1 = sc.nextDouble();

        System.out.print("Enter 2nd arm: ");
        double arm2 = sc.nextDouble();

        System.out.print("Enter 3rd arm: ");
        double arm3 = sc.nextDouble();

        double s = (arm1 + arm2 + arm3) / 2.0;

        double area = Math.sqrt( s * (s - arm1) * (s - arm2) * (s - arm3) );

        System.out.println("Area of the triangle: " + area);

        sc.close();
    }
}