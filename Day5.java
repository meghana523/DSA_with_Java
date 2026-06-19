//Strings reading and counting the length
/*import java.util.*;
class Day5
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            count++;
        }
        System.out.println("String is:"+s1);
        System.out.println("String length is :"+count);
    }
}*/

// String Slicing indexing
/*import java.util.*;
class Day5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        String s2 = s1.substring(0, 14);
        System.out.println("Sliced string is: " + s2);
    }
}*/

//Reverse String
/*import java.util.*;
class Day5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        String reversed = "";
        for (int i = s1.length() - 1; i >= 0;i--)
            {
                reversed += s1.charAt(i);
            }
        System.out.println("Reversed string is: " + reversed);
    }
}*//*Examples:

Input: s = "Geeks"
Output: "skeeG"*/
/*class Solution {
public:
    void reverseString(vector<char>& s) {
        int left=0;
        int right=s.size()-1;
        while(left<right)
        {
            swap(s[left],s[right]);
            left++;
            right--;
        }
    }
};*/
/*Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]*/

//if a sentence was given we need to count the vowels ,spaces,consonants and alphanumeric characters
/*import java.util.*;
class Day5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s1 = sc.nextLine();
        int vowels=0,spaces=0,consonants=0,alphanumeric=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vowels++;
            }
            else 
            {
                if(ch==' ')
                {
                    spaces++;
                }
                else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                {
                    consonants++;
                }
                else if((ch>='0'&&ch<='9'))
                {
                    alphanumeric++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of spaces: " + spaces);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of alphanumeric characters: " + alphanumeric);
    }
}*/

// valid anagram of a string
import java.util.*;
class Day5
{
    public static void main(String[] args)          
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter another string: ");
        String s2 = sc.nextLine();
        if(s1.length()!=s2.length())
        {
            System.out.println("Not an anagram");   
        }
        else
        {
            char[] arr1=s1.toCharArray();
            char[] arr2=s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2))
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not an anagram");
            }
        }
    }
}