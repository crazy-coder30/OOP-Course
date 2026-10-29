import java.util.Scanner;

public class greatestNum
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
        if (n > 0)
        {
            double greatest = arr[0];

            for (int i = 0; i < n; i++)
            {
                if (arr[i] > greatest)
                {
                    greatest = arr[i];
                }
            }
            System.out.println("Greatest number: " + greatest);
        }
    }
}
// press ctrl+z after finishing giving input -> press enter