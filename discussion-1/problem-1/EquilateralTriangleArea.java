import java.util.Scanner;

public class EquilateralTriangleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter arm: ");
        double arm = sc.nextDouble();

        double area = (Math.sqrt(3.0) / 4.0) * Math.pow(arm, 2);

        System.out.println("Area of the Equilateral triangle: " + area);

        sc.close();
    }
}