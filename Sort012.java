class Sort012 {
    public static void sort012(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int value : arr) {
            if (value == 0) {
                count0++;
            } else if (value == 1) {
                count1++;
            } else if (value == 2) {
                count2++;
            }
        }

        int index = 0;
        while (count0-- > 0) {
            arr[index++] = 0;
        }
        while (count1-- > 0) {
            arr[index++] = 1;
        }
        while (count2-- > 0) {
            arr[index++] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 1, 0, 0, 2, 1};
        sort012(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
