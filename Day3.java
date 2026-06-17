//Insert at position arrays
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no'of elements:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int a[] =new int[n+1];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the postion:");
        int pos = sc.nextInt();
        System.out.println("Enter the element:");
        int ele=sc.nextInt();
        for(int i=n;i>pos;i--)
        {
            a[i]=a[i-1];
        }
        a[pos]=ele;
        n++;
        System.out.println("Array after adding:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}*/
//nested for loop
import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}