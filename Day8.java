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
class Day8
{
    public static void pivotPartition(int[] arr, int pivot)
    {
        int low = 0, high = arr.length - 1;
        while(low < high)
        {
            while(low < high && arr[low] <= pivot) low++;
            while(low < high && arr[high] >= pivot) high--;
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
}
