import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to check: ");
        int num=sc.nextInt();

            if(num%2==0)
            {
                System.out.println(" even no");
            }
            else
            {
                System.out.println("odd no");
            }
        }
    }

