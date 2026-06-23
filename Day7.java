// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value using binary search print the output in array.
import java.util.*;

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
/*class Day7
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
}*/

//Given a 2D matrix (rows sorted, first element of each row &gt; last of previous), search a target in O(log(m×n)).search a 2D matrix
 /*class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 35;

        System.out.println(solution.searchMatrix(matrix, target));
    }
    
} */

//Book Allocation Problem: N books with pages, M students — allocate books to minimise the maximum pages assigned to any student.
/*class Day7
{
    public static boolean isPossible(int[] arr, int n, int m, int mid)
    {
        int studentCount = 1;
        int pageSum = 0;
        for(int i=0; i<n; i++)
        {
            if(pageSum + arr[i] <= mid)
            {
                pageSum += arr[i];
            }
            else
            {
                studentCount++;
                if(studentCount > m || arr[i] > mid)
                {
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }
    public static int allocateBooks(int[] arr, int n, int m)
    {
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
        }
        int start = 0;
        int end = sum;
        int ans = -1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(isPossible(arr, n, m, mid))
            {
                ans = mid;
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[] arr = {12, 34, 67, 90};
        int n = arr.length;
        int m = 2; // Number of students
        System.out.println(allocateBooks(arr, n, m));
    }
}*/

//Given a sorted rotated array, find the minimum element
/*class Day7
{
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1; 
            } else {
                high = mid; 
            }
        }

        return nums[low]; 
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(nums)); 
    }
}*/

//Aggressive Cows: place C cows in N stalls to maximise the minimum distance between any two cows.
/*class Day7
{
    public static boolean isPossible(int[] stalls, int n, int c, int mid)
    {
        int count = 1;
        int lastPosition = stalls[0];

        for(int i=1; i<n; i++)
        {
            if(stalls[i] - lastPosition >= mid)
            {
                count++;
                lastPosition = stalls[i];
            }
            if(count == c)
            {
                return true;
            }
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int n, int c)
    {
        Arrays.sort(stalls);
        int start = 0;
        int end = stalls[n-1] - stalls[0];
        int ans = -1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(isPossible(stalls, n, c, mid))
            {
                ans = mid;
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int[] stalls = {1, 2, 4, 8, 9};
        int n = stalls.length;
        int c = 3; // Number of cows
        System.out.println(aggressiveCows(stalls, n, c));
    }
}*/

//Painter's Partition Problem: Given N boards and K painters, minimize the time to paint all boards. Each painter paints continuous boards.
/*class Day7
{
    public static boolean isPossible(int[] boards, int n, int k, int mid)
    {
        int painterCount = 1;
        int timeSum = 0;    
        for(int i=0; i<n; i++)
        {
            if(timeSum + boards[i] <= mid)
            {
                timeSum += boards[i];
            }
            else
            {
                painterCount++;
                if(painterCount > k || boards[i] > mid)
                {
                    return false;
                }
                timeSum = boards[i];
            }
        }
        return true;
    }
    public static int painterPartition(int[] boards, int n, int k)
    {
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum += boards[i];
        }
        int start = 0;
        int end = sum;
        int ans = -1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(isPossible(boards, n, k, mid))
            {
                ans = mid;
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[] boards = {10, 20, 30, 40};
        int n = boards.length;
        int k = 2; // Number of painters
        System.out.println(painterPartition(boards, n, k));
    }
}
*/

