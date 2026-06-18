//Basic programm of array
/*import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50};
        for(int i=0;i<=a.length-1;i++)
        {
            System.out.println(a[i]);
        }
    }
}*/

//Sum of array elements
/*import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50};
        int sum = 0;
        for(int i=0;i<=a.length-1;i++)
        {
            System.out.println(a[i]);
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}*/

//Largest element in array
/*import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for(int i=1;i<=a.length-1;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}*/

//Second largest element in array
/*import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int max1 = a[0];
        for(int i=1;i<=a.length-1;i++)
        {
            if(a[i]>max)
            {
                max1 = max;
                max = a[i];
            }
            else
            {
                max1 = a[i];
            }
        }
        System.out.println(max1);
    }
}*/

//Third largest element in array
/*import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int max1 = a[0];
        int max2 = a[0];
        for(int i=1;i<=a.length-1;i++)
        {
            if(a[i]>max)
            {
                max2 = max1;
                max1 = max;
                max = a[i];
            }
            else if(a[i]>max1)
            {
                max2=max1;
                max1=a[i];
            }
            else
            {
                max2 = a[i];
            }
        }
        System.out.println(max2);
    }
}*/

//Minimum element in array
/*import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for(int i=1;i<=a.length-1;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
*/

//Sorting of array using loops
/*import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}*/

//Sorting of array using inbuilt method
/*import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
*/   

//Array rotation right 
/*import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0;i<k;i++)
        {
            int l = a[a.length-1];
            for(int j=a.length-1;j>0;j--)
            {
                a[j] = a[j-1];
            }
            a[0] = l;
        }
        System.out.println(Arrays.toString(a));
    }
}*/

import java.util.*;
class Day4
{
    
}