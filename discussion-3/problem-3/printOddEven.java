import java.util.Scanner;

public class printOddEven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[1000];
        int n = 0;

        System.out.print("Enter the numbers you want in :");

        while (sc.hasNextDouble() && n < arr.length)
        {
            arr[n] = sc.nextDouble();
            n++;
        }

        int odd = 0;
        int even = 0;

        double[] evenArray = new double[1000];
        int e = 0;

        double[] oddArray = new double[1000];
        int o = 0;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] % 2 == 0)
            {

                evenArray[e] = arr[i];
                e++;
                even++;
            }
            else
            {

                oddArray[o] = arr[i];
                o++;
                odd++;
            }
        }

        System.out.println("Odd Count: " +odd);
        System.out.print("Odd Numbers: ");
        for(int i=0;i<o;i++)
        {
            System.out.print(oddArray[i]+" ");
        }

        System.out.println();

        System.out.println("Even Count: " +odd);
        System.out.print("Even Numbers: ");
        for(int i=0;i<e;i++)
        {
            System.out.print(evenArray[i]+" ");
        }
    }
}
// press ctrl+z after finishing giving input -> press enter