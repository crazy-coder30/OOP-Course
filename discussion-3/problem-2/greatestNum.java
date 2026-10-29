import java.util.Scanner;
import java.util.ArrayList;

public class greatestNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double>numbers = new ArrayList<>();

        System.out.print("Enter the numbers you want in :");

        while (sc.hasNextDouble())
        {
            numbers.add(sc.nextDouble());
        }
        if (!numbers.isEmpty())
        {
            double greatest = numbers.get(0);

            for (int i = 0; i < numbers.size(); i++)
            {
                if (numbers.get(i) > greatest)
                {
                    greatest = numbers.get(i);
                }
            }
            System.out.println("Greatest number: " + greatest);
        }
    }
}
// press ctrl+z after finishing giving input -> press enter