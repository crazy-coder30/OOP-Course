import java.util.Scanner;

public class OddPrint_SumPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the last number of the odd series: ");
        int odd = sc.nextInt();

        for(int i=1;i<=odd;i+=2){
            System.out.print(i+ " ");
        }

        int sumOdd=0;
        for(int i=1;i<=odd;i+=2){
            sumOdd+=i;
        }
        System.out.println();
        System.out.println("Sum of the numbers:  " +sumOdd);

        sc.close();
    }
}