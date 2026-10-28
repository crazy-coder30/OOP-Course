import java.util.Scanner;

public
class gradeMedel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        double grade = sc.nextDouble();

        if (grade >= 2)
        {
            if (grade >= 3.5)
            {
                System.out.println("This is a letter grade & You get the Medel");
            }
            else
            {
                System.out.println("You paased but not with letter grade");
            }
        }
        else
        {
            System.out.println("You failed ! Better luck next time");
        }
    }
}