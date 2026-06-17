import java.util.*;
/*public class Day2 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        boolean opposite=((a ^ b)<0);
        System.out.println(opposite);
    }
}*/
/*
public class Day2 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=0;i<=a;i++)
        {
            System.out.println(i);  
        }
    }
} */

//even numbers
/*public class Day2 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=0;i<=a;i=i+2)
        {
            System.out.println(i);  
        }
    }
}*/


//factorial of a number
/*public class Day2 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}*/

//Spy number
/*class Day2 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int sum=0;
        int product=1;
        while(a>0)
        {
            int rem=a%10;
            sum=sum+rem;
            product=product*rem;
            a=a/10;
        }
        if(sum==product)
        {
            System.out.println("Spy number");
        }
        else
        {
            System.out.println("Not a Spy number");
        }
    }
}*/

//magic number
/*public class Day2 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int sum=0;
        while(a>0 || sum>9)
        {
            if(a==0)
            {
                a=sum;
                sum=0;
            }
            int rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        if(sum==1)
        {
            System.out.println("Magic number");
        }
        else
        {
            System.out.println("Not a Magic number");
        }
    }   
}*/



//happy number
/*public class Day2 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int sum=0;
        while(a>0 || sum>9)
        {
            if(a==0)
            {
                a=sum;
                sum=0;
            }
            int rem=a%10;
            sum=sum+(rem*rem);
            a=a/10;
        }
        if(sum==1)
        {
            System.out.println("Happy number");
        }
        else
        {
            System.out.println("Not a Happy number");
        }
    }
}*/

//perfect number
/*public class Day2 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==a)
        {
            System.out.println("Perfect number");
        }
        else
        {
            System.out.println("Not a Perfect number");
        }
    }
}*/



//armstrong number
/*public class Day2 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int sum=0;
        int temp=a;
        while(temp>0)
        {
            int rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        if(sum==a)
        {
            System.out.println("Armstrong number");
        }   
        else
        {
            System.out.println("Not a Armstrong number");
        }
    }
}*/

//palindrome number
/*public class Day2 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int rev=0;
        int temp=a;
        while(temp>0)
        {
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;        
        }
        if(rev==a)
        {
            System.out.println("Palindrome number");
        }   
        else
        {
            System.out.println("Not a Palindrome number");
        }
    }
}*/

//swapping of two numbers
/*public class Day2
{
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int b =obj.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}*/


//reverse of a number
/*public class Day2
{    public static void main(String[] args)
    {               
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int rev=0;
        while(a>0)
        {
            int rem=a%10;
            rev=rev*10+rem;
            a=a/10;        
        }
        System.out.println(rev);
     }
}   

//sum of digits of a number
/*public class Day2       
{    public static void main(String[] args)
    {               
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int sum=0;
        while(a>0)
        {
            int rem=a%10;
            sum=sum+rem;
            a=a/10;        
        }
        System.out.println(sum);
     }
}   */

// perfect square
public class Day2
{    public static void main(String[] args)       
    {               
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int i=1;
        while(i*i<a)
        {
            i++;
        }
        if(i*i==a)
        {
            System.out.println("Perfect square");
        }
        else
        {
            System.out.println("Not a Perfect square");
        }
     }
} 


//neon number
/*public class Day2
{    public static void main(String[] args)      
    {           
        Scanner obj =new Scanner(System.in);
        int a=obj.nextInt();
        int sq=a*a;
        int sum=0;
        while(sq>0)
        {
            int rem=sq%10;
            sum=sum+rem;
            sq=sq/10;        
        }
        if(sum==a)
        {
            System.out.println("Neon number");
        }
        else
        {
            System.out.println("Not a Neon number");
        }
     }*/