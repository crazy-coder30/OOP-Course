import java.util.Scanner;

public class EvenPrint_SumPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the last number of the even series: ");
        int even = sc.nextInt();

        int sum=0;

        for(int i=2;i<=even;i+=2){
            System.out.print(i+ " ");
            sum+=i;
        }

        System.out.println();
        System.out.println("Sum of the numbers:  " +sum);

        sc.close();
    }
}