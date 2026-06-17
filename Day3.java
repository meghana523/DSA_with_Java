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

//nested for loop(Square pattern)
/*import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n=;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}*/

//numbers in squares pattern
/*import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =1;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}*/

//Alphabets patterns
/*import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a ='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+j-1+" ");
                a++;
            }
            System.out.println();
        }
    }
}*/

//right angle Triangle
/*import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =1;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//same numbers right angle triangle
/*import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =1;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/

//using different numbers right angle triangle
/*import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =1;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}*/

//same alphabet right angle triangle
/*import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a ='A';
        for(int i=0;i<=n;i++)
        {
            a='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}*/

//inverted Alphabets triangle
/*import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a='A';
        for(int i=n;i>=1;i--)
        {
            a='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}*/

//inverted numbers triangle
/*import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=n;i>=1;i--)
        {
            a=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/

//inverted stars triangle
/*import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/

//Triangle using alphabets
/*import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a='A';
        for(int i=1;i<=n;i++)
        {
            a='A';
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}*/

//triangle with stars
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//Triangle usinf numbers
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            a=1;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}*/

//Diamond using Alphabets
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c='A';
        for(int i=1;i<=n;i++)
        {
            c='A';
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(c+"");
                c++;
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            c='A';
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(c+"");
                c++;
            }
            System.out.println();
        }
    }
}*/

//Diamond using Numbers
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            a=1;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(a+"");
                a++;
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            a=1;;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(a+"");
                a++;
            }
            System.out.println();
        }
    }
}*/

//Diamond using Stars
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//half Diamond using stars
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//half Diamond using Alphabets
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c='A';
        for(int i=1;i<n;i++)
        {
            c='A';
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(c+"");
                c++;
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            c='A';
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(c+"");
                c++;
            }
            System.out.println();
        }
    }
}*/

//half Diamond using numbers
import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<n;i++)
        {
            a=1;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(a+"");
                a++;
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            a=1;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(a+"");
                a++;
            }
            System.out.println();
        }
    }
}