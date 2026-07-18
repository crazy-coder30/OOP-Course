import java.util.Scanner;

public class EvenPrint_SumPrint2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the last number of the even series: ");
        int even = sc.nextInt();

        int i=2;
        int sum=0;

        while(i<=even){
            sum+=i;
            System.out.print(i+ " ");
            i+=2;
        }
        System.out.println();
        System.out.println("Sum of the numbers: " +sum);

        sc.close();
    }
}