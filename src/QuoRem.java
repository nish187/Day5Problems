import java.util.Scanner;
public class QuoRem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int dividend=sc.nextInt();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the divisor: ");
        int divisor=s.nextInt();


            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        }
    }

