import java.util.Scanner;
public class TwoD
{
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row length of an array : ");
        int M=sc.nextInt();
        System.out.println("Enter column length of an array : ");
        int N=sc.nextInt();
        int a[][]=new int[M][N];
        System.out.print("Enter " + M*N + " Elements to Store in Array :");
        for (int i = 0; i < M; i++)
        {
            for(int j = 0; j < N; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Elements in Array are :");
        for (int i = 0; i < M; i++)
        {
            for(int j = 0; j < N; j++)
            {
                System.out.println("Row ["+i+"]:  Column ["+j+"] :");
            }
        }
    }
}
