/*
import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50};
        for(int i=0;i<a.length-1;i++)
        {
            System.out.println(a[i]);
        }
    }
}*/
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

//array rotation using loops
/*import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res[] = new int[n];
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%n;
        /*for(int i=0;i<n;i++)  //right rotation 
        {
            res[(i+k)%n] = a[i];
        }*/
       /*for(int i=0;i<n;i++)
       {
            res[i]=a[(i+k)%n];
       }
        for(int i=0;i<n;i++)
        {
            System.out.print(res[i]+" ");
        }
        
    }
}
*/

//Moving zeros to end
/*import java.util.*;
class Day4{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                a[index++]=a[i];
            }
        }
        while(index<a.length)
        {
            a[index++]=0;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}*/

//subarray sum
/*import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=n-1;i++)
        {
            for(int j=1;j<=n-1;j++)
            {
                sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+a[k];
                }
                System.out.println(sum);
            }
        }
    }
}*/

//subarray sum using target sum if sum is equal to target then print target found
/*import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        boolean found = false;

        for(int i = 0; i < n; i++)
        {
            int sum = 0;
            for(int j = i; j < n; j++)
            {
                sum += a[j];
                if(sum == target)
                {
                    System.out.println("Target found");
                    found = true;
                    break;
                }
            }
            if(found)
            {
                break;
            }
        }

        if(!found)
        {
            System.out.println("Target not found");
        }

        sc.close();
    }
}*/

//Given a array of integers, print all armstrong numbers in the array
import java.util.*;
class Day4
{
    public static void main(String[] args)
    {
        int a[]= {153, 370, 371, 10, 20, 30, 40, 50,407,1634};
        for(int i=0;i<a.length;i++)
        {
            int num = a[i];
            int temp = num;
            int sum = 0;
            while(temp>0)
            {
                int rem = temp % 10;
                sum = sum + rem*rem*rem;
                temp = temp / 10;
            }
            if(sum == num)
            {
                System.out.println(num);
            }
        }
    }
}
  