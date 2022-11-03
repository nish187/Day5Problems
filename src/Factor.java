import java.util.Scanner;
public class Factor
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number to be factor: ");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();

        System.out.print("Factors of " + number + " are: ");

        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
