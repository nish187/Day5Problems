 import java.util.Scanner;
public class Quadratic
{
    public static void main(String[] Strings)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        double d= Math.pow(b,2) - 4.0 * a * c;
        double r1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);





    }
}

