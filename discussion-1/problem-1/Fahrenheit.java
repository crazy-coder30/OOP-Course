import java.util.Scanner;

public class Fahrenheit{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Celsius value: ");
        double Celsius = sc.nextDouble();

        double Fahrenheit = ((9.0/5.0) * Celsius) + 32.0;

        System.out.println("Temp in Fahrenheit scale: " + Fahrenheit);

        sc.close();
    }
}