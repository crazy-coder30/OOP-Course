import java.util.Scanner;

public class OddPrint_SumPrint3 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the last number of the odd series: ");
        int odd = sc.nextInt();

        int i=1;
        int sum=0;

        do{
            sum+=i;
            System.out.print(i+ " ");
            i+=2;
        } while(i<=odd);

        System.out.println();
        System.out.println("Sum of the numbers: " +sum);

        sc.close();
    }
}