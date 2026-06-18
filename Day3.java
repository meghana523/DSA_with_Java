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

//Patterns
//nested for loop(Square pattern)
/*import java.util.*;
class Day3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++)
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
/*import java.util.*;
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
}*/

//Hallow Pattern square
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/

//Hallow right angle
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                if(i==0 || i==n || j==0 || j==i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/

//Hallow Pattern square numbers
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print(a+" ");
                    a++;
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/

//Hallow Pattern square
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print(a+" ");
                    a++;
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/

//Hallow Pattern inverted right angle
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==1 || i==n || j==1 || j==i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/

//hallow diamond using stars
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                if(k==1 || k==2*i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
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
                if(k==1 || k==2*i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/

//Rhombus using stars
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/


//Hallow Rhombus using stars
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
                if(i==1 || i==n || k==1 || k==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/

//Hallow Rhombus using numbers
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a= 1;
        for(int i=1;i<=n;i++)
        {
            a=1;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
                if(i==1 || i==n || k==1 ||k==n)
                {
                    System.out.print(a+" ");
                    a++;
                }
                else
                {
                    System.out.print("  ");
                    a++;
                }
            }
            System.out.println();
        }
    }
}*/

//Hallow Rhombus using alphabets
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            ch='A';
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
                if(i==1 || i==n || k==1 ||k==n)
                {
                    System.out.print(ch+" ");
                    ch++;
                }
                else
                {
                    System.out.print("  ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}*/

//square using odd numbers
import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a= 2;
        for(int i=1;i<=n;i++)
        {
            a=2;
            for(int j=1;j<=n;j++)
            {
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}

//Square using factorial numbers 
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact = 1;
            for(int j=1;j<=n;j++)
            {
                fact=fact*j;
                System.out.print(fact+" ");
            }
            System.out.println();
        }
    }
}*/

//square using square numbers
/*import java.util.*;
class Day3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for(int i=1;i<=n;i++)
        {
            a=1;
            for(int j=1;j<=n;j++)
            {
                System.out.print(a*a+" ");
                a++;
            }
            System.out.println();
        }
    }
}*/