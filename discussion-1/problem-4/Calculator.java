import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number a: ");
        double a = sc.nextDouble();

        System.out.print("Enter 2nd number b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the operation: ");
        char ch = sc.next().charAt(0);

        double sum = a+b;
        double sub = a-b;
        double mul = a*b;
        double div = a/b;

        if(ch == '+'){
            System.out.print("a+b = " + sum);
        }
        if(ch == '-'){
            System.out.print("a-b = " + sub);
        }
        if(ch == '*'){
            System.out.print("a*b = " + mul);
        }
        if(ch == '/'){
            System.out.print("a/b = " + div);
        }

        sc.close();
    }
}