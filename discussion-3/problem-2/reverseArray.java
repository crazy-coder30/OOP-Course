import java.util.Scanner;

public class reverseArray
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

        System.out.print("Reversed Array: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
// press ctrl+z after finishing giving input -> press enter