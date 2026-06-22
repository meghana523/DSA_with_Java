// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value using binary search print the output in array.
/*class Day7
{
    public static int check_left(int[] a, int target)
    {
        int left = 0;
        int right = a.length - 1;
        int possible = -1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(a[mid] == target)
            {
                possible = mid;
                right = mid - 1;
            }
            else if(a[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return possible;
    }
    public static int check_right(int[] a, int target)
    {
        int left = 0;
        int right = a.length - 1;
        int possible = -1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(a[mid] == target)
            {
                possible = mid;
                left = mid + 1;
            }
            else if(a[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return possible;
    }
    public static void main(String[] args)
    {
        int[] a = {5,7,7,8,8,10};
        int target = 8;
        int left = check_left(a, target);
        int right = check_right(a, target);
        int[] ans = {left, right};
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}*/

/*another approach is to use inbuilt functions like binary search and then check for the left and right positions of the target value.*/
/*class Solution {
    public int range(int arr[],int target,boolean flag)
    {
        int low = 0;
        int high = arr.length - 1;
        int possible = -1;
        while(low <= high)
        {
            int mid = low + ((high - low) >> 1);
            if(arr[mid] == target)
            {
                possible = mid;
                if(flag == true)
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return possible;
    }
    public int[] searchRange(int[] nums, int target) {
        int left = range(nums, target, true);
        int right = range(nums, target, false);
        return new int[]{left, right};
    }
}*/

//given a number check whether it is a perfect square or not without using any inbuilt functions like sqrt or pow.
/*public class Day7
{    public static void main(String[] args)       
    {               
        int a = 19;
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
}*/
//another approach to find the perfect square or not
/*class Day7
{
    public static int isPerfectSquare(int num) {
        for(int i=1; i <=num; i++)
        {
            if((i*i) == num)
            {
                return i; // Return the square root if it's a perfect square
            }
            else if((i*i) > num)
            {
                return i - 1;// No need to check further
            }
        }
        return -1; // Not a perfect square
    }
    public static void main(String[] args)
    {
        int nums = 29;
        System.out.println(isPerfectSquare(nums));
    }
}*/

 //another approach to find the perfect square or not using binary search
class Day7
{
    public static int floor_root(int num) {
        int low = 1, high = num;
        while(low <= high)
        {
            int mid = low + ((high - low) >> 1);
            long square = (long) mid * mid; // Use long to avoid overflow
            if(square == num)
            {
                return mid; // Return the square root if it's a perfect square  
            }
            else if(square < num)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return high; // Not a perfect square
    }
    public static void main(String[] args)
    {
        int nums = 29;
        System.out.println(floor_root(nums));
    }
}
        