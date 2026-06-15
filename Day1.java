import java.util.Scanner;
class Day1
{
    public static void main(String[] args)
    {
            /*//Even Odd
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int a = sc.nextInt();
            if((a & 1) == 0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }*/
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number");
           int n = sc.nextInt();
           for (int i = 1; i <= n; i++)
           {
                System.out.println("Enter a number");
                int a = sc.nextInt();
                if((a & 1 )== 0)
                {
                   System.out.println("Even");
                }
                else
                {
                     System.out.println("Odd");
                }
           }
    }
}