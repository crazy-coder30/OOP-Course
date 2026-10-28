import java.util.Scanner;

public class storeValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        System.out.print("How many numbers do you want to calculate: ");
        double[] numbers = new double[sc.nextInt()];

        System.out.print("Enter your numbers: ");
        for(int i=0;i<numbers.length;i++){
            numbers[i]= sc.nextDouble();
            sum+=numbers[i];
        }

        double average = sum/ numbers.length;
        System.out.println("Average: " +average);
    }
}