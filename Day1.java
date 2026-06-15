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
           /*for (int i = 1; i <= n; i++)
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
           }*/
          //give numeric to Binary number conversion
          String s = "";
          while(n > 0)
          {
              int a = n % 2; //gives the last digit of the binary number 14%2 = 0, 7%2=1, 3%2=1, 1%2=1
              s = s + a;//concatenating the last digit to the string 0, 01, 011, 0111
              n = n / 2;//removing the last digit from the decimal number 14/2=7, 7/2=3, 3/2=1, 1/2=0
          }
            System.out.println(s);
    }
}