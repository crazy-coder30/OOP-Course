import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        double num = sc.nextDouble();

        if (num >= 0 && num <= 39) {
            System.out.println("Your Grade: F");
        } else if (num >= 40 && num <= 59) {
            System.out.println("Your Grade: C+");
        } else if (num >= 60 && num <= 69) {
            System.out.println("Your Grade: B");
        } else if (num >= 70 && num <= 79) {
            System.out.println("Your Grade: A-");
        } else if (num >= 80 && num <= 89) {
            System.out.println("Your Grade: A");
        } else {
            System.out.println("Your Grade: A+");
        }

        sc.close();
    }
}