import java.util.Scanner;
public
class bonus
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How much have you reached of your targeted sales: ");
        double sales = input.nextDouble();

        System.out.print("Enter your attendance: ");
        double att = input.nextDouble();

        if (sales >= 95)
        {
            if (att == 100)
            {
                System.out.println("You got 60% bonus !");
            }
            else if (att >= 90 &&  att < 100)
            {
                System.out.println("You got 40% bonus !");
            }
        }
        else if (sales >= 80 && sales < 95)
        {
            if (att == 100)
            {
                System.out.println("You got 40% bonus !");
            }
            else if (att >= 90 &&   att < 100)
            {
                System.out.println("You got 20% bonus !");
            }
        }
        else
        {
            System.out.println("You got 5% bonus !");
        }
    }
}