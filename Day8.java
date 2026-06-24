//Given two sorted arrays merge them into single sorted array such that the time complexity will be equal to sum of lengths of both arrays.
/*class Day7
{
    public static int[] merge(int[] a1, int[] a2)
    {
        int n1 = a1.length;
        int n2 = a2.length;
        int i = 0, j = 0, k = 0;
        int result[] = new int[n1 + n2];
        while(i < n1 && j < n2)
        {
            if(a1[i] <= a2[j])
            {
                result[k++] = a1[i++];
            }
            else
            {
                result[k++] = a2[j++];
            }
        }
        while(i < n1)
        {
           result[k++] = a1[i++];
        }
        while(j < n2)
        {
            result[k++] = a2[j++];
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] a1 = {1, 3, 5, 7, 9, 10};
        int[] a2 = {2, 4, 6, 8};
        int result[] = merge(a1, a2);
        // Print the merged array
        for(int x = 0; x < result.length; x++)
        {
            System.out.print(result[x] + " ");
        }
        System.out.println();
    }
}*/

//Given array and sort the array using merge sort.
/*class Day8
{
    public static void merge(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int mid = low + ((high - low) >> 1 );
            merge(arr, low, mid);
            merge(arr, mid + 1, high);
            mergeSort(arr, low, mid, high);
        }
    }
    public static void mergeSort(int[] arr, int low , int mid, int high)
    {
        int size = high - low + 1;
        int[] dummy = new int[size];
        int i = low, j = mid + 1, k = 0;
        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
            {
                dummy[k++] = arr[i++];
            }
            else
            {
                dummy[k++] = arr[j++];
            }
        }
        while(i <= mid)
        {
            dummy[k++] = arr[i++];
        }
        while(j <= high)
        {
            dummy[k++] = arr[j++];
        }
        for(int ind = 0; ind < size; ind++)
        {
            arr[low + ind] = dummy[ind];
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {10, 7, 15, 3, 16, 8};
        merge(arr, 0, arr.length - 1);
        for(int i=0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }  
}*/

//Given an array and count the no of inversions in the array using merge sort.
/*class Day7
{
    public static int Count_inversion(int[] arr ,int low, int high)
    {
        int ans = 0;
        if(low < high)
        {
            int mid = low + ((high - low) >> 1);
            ans = Count_inversion(arr, low, mid);
            ans = Count_inversion(arr, mid + 1, high);
            ans = merge(arr, low, mid, high);
        }
        return ans;
    }
    public static int merge(int[] arr, int low,int mid, int high)
    {
        int size = high - low + 1;
        int[] dummy = new int[size];
        int i = low, j = mid + 1,k = 0 ,count = 0;
        while(i<=mid && j<=high)
        {
            if(arr[i] <= arr[j])
            {
                dummy[k++] = arr[i++];
            }
            else
            {
                count += (mid - i + 1);
                dummy[k++] = arr[j++];
            }
        }
        while(i<= mid)
        {
             dummy[k++] = arr[i++];
        }
        while(j<=high)
        {
            dummy[k++] = arr[j++];
        }
        for(int ind=0;ind<size;ind++)
        {
            arr[ind+low] = dummy[ind];
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr = {5,6,8,1,2,7};
        int res = Count_inversion(arr,0,arr.length-1);
        System.out.println(res);
    }
}*/  

// Given an array and an element refered as pivot element move all the elements which were lesser than or equal to that given element to left and all the greater elements to the right.(ordering doesn't needed to be same).
/*class Day8
{
    public static void pivotPartition(int[] arr, int pivot)
    {
        int low = 0, high = arr.length - 1;
        while(low < high)
        {
            while(low < high && arr[low] <= pivot) low++;
            while(high > low && arr[high] >= pivot) high--;
            if(low < high)
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] a = {5, 6, 71, 86, 96, 75, 95, 38, 30, 100};
        int pivot = 53; 
        pivotPartition(a, pivot);
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}*/

//Given an array and sort the array using Quick sort. 
/*class Day8
{
    public static int pivotPartition(int[] arr, int lower, int upper)
    {
        int pivot = arr[lower];
        int low = lower, high = upper;
        while(low < high)
        {
            while(low < high && arr[high] > pivot) high--;
            while(low < high && arr[low] <= pivot) low++;
            if(low < high)
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        arr[lower] = arr[low];
        arr[low] = pivot;
        return low;
    }
    public static void QuickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = pivotPartition(arr, low , high);
            QuickSort(arr, low, pivot - 1);
            QuickSort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {5, 6, 71, 86, 96, 75, 95, 38, 30, 100};
        QuickSort(arr, 0 , arr.length-1);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}*/

//Quick select
/*class Day8
{
    public static int pivotPartition(int[] arr, int lower, int upper)
    {
        int pivot = arr[lower];
        int low = lower, high = upper;
        while(low < high)
        {
            while(low < high && arr[high] > pivot) high--;
            while(low < high && arr[low] <= pivot) low++;
            if(low < high)
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        arr[lower] = arr[low];
        arr[low] = pivot;
        return low;
    }
    public static int QuickSelect(int[] arr, int low, int high, int target)
    {
        if(low <= high)
        {
            int pivot = pivotPartition(arr, low , high);
            if(target == pivot)
            {
                return arr[pivot];
            }
            else if(target < pivot)
            {
                return QuickSelect(arr, low, pivot - 1, target);
            }
            else
            {
                return QuickSelect(arr, pivot + 1, high, target);
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {5, 6, 71, 86, 96, 75, 95, 38, 30, 100};
        int res = QuickSelect(arr, 0 , arr.length-1, 3);
        
        System.out.println(res);
    }
}*/

//sort an array of 0s,1s,2s in an unsorted array using multiple passes.
/*class Day8
{
    public static void sort(int[] arr)
    {
        int count = 0, count1 = 0, count2 = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
            {
                count++;
            }
            else if(arr[i] == 1)
            {
                count1++;
            }
            else if(arr[i] == 2)
            {
                count2++;
            }
        }
        for(int ind = 0; ind<count;ind++)
        {
            arr[ind] = 0;
        }
        for(int ind = count; ind<(count1+count1);ind++)
        {
            arr[ind] = 1;
        }
        for(int ind = count+count1; ind<(count+count1+count2);ind++)
        {
            arr[ind] = 2;
        }
        
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 0, 2, 1, 2, 0, 0, 1, 2};
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}*/

//another approch using dutch national flag
/*public class Main {
    private static void swap(int[] array, int first, int second){
        int safe = array[first];
        array[first] = array[second];
        array[second] = safe;
    }
    private static void count(int[] arr){
        int low=0,mid = 0, high = arr.length-1;
        while(mid<= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid ++;
            }else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {0,1,2,2,1,0,1,2,0,0,2,1,1,2,0,1,0,2};
        count(arr);
        for(int num: arr){
            System.out.print(num+ " ");
        }
    }
} */

//Heaps
import java.util.*;
/*class Day8
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>();
        min_heap.add(10);
        min_heap.add(20);
        min_heap.add(30);
        min_heap.add(3);
        min_heap.add(40);
        min_heap.add(2);
        System.out.println(min_heap.poll());
        System.out.println(min_heap);
    }
}*/

//max heap using min heap
/*class Day8
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>();
        min_heap.add(-11);
        min_heap.add(-5);
        min_heap.add(-9);
        min_heap.add(12);
        min_heap.add(-2);
        min_heap.add(-3);
        int num = min_heap.poll();
        System.out.println(min_heap);
    }
}*/
 
//k-th largest element in an unsorted array using quick select
/*public class Day8 {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    private static int quickSelect(int[] arr, int low, int high, int kSmallest) {
        if (low == high) {
            return arr[low];
        }

        int pivotIndex = partition(arr, low, high);

        if (kSmallest == pivotIndex) {
            return arr[pivotIndex];
        } else if (kSmallest < pivotIndex) {
            return quickSelect(arr, low, pivotIndex - 1, kSmallest);
        } else {
            return quickSelect(arr, pivotIndex + 1, high, kSmallest);
        }
    }

    public static int findKthLargest(int[] arr, int k) {
        int n = arr.length;
        int kSmallest = n - k; // convert k-th largest to index for k-th smallest
        return quickSelect(arr, 0, n - 1, kSmallest);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 71, 86, 96, 75, 95, 38, 30, 100};
        int k = 3;
        int kthLargest = findKthLargest(arr, k);
        System.out.println(k + "-th largest element is: " + kthLargest);
    }
}*/

//Given N rope lengths, find the minimum cost to connect all ropes(always merge two shortest) solve using sorting.
class Day8
{
    private static int min_cost(int[] arr)
    {
        PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>();
        for(int val : arr) min_heap.add(val);

        while(min_heap.size() > 1)
        {
            int first = min_heap.poll();
            int second = min_heap.poll();
            min_heap.add(first+second);
        }
        return min_heap.poll();
    }
    public static void main(String[] args)
    {
        int[] arr = {2,2,1,7,5,3};
        System.out.println(min_cost(arr));
    }
}