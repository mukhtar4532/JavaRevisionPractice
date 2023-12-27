import java.util.*;

public class array1 {

    // LINEAR SEARCH
    /*
     * public static int linearSearch(int arr[], int key){
     * for (int i = 0; i < arr.length; i++) {
     * if (key == arr[i]) {
     * return i;
     * }
     * }
     * return -1 ;
     * }
     */

    // LARGEST NO. IN AN ARRAY
    // public static int largestNum(int arr[]) {
    //     int largest = Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (largest < arr[i]) {
    //             largest = arr[i];
    //         }
    //     }
    //     return largest;
    // }

    // public static int smallestNum(int arr[]){
    //     int smallest = Integer.MAX_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (smallest > arr[i]) {
    //             smallest = arr[i];
    //         }
    //     }
    //     return smallest;
    // }

    //  BINARY SEARCH
    public static int binarySearch(int arr[], int key){
        int si = 0;
        int ei = arr.length-1;
        int mid = ei + ((si-ei)/2);

        while (si <= ei) {
            if (key == arr[mid]) {
                return mid;
            }else if (key < arr[mid]) {
                ei = mid-1 ;
            }else{
                si = mid+1 ;
            }
        }
        return -1 ;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /*
         * System.out.println("Enter the key, you find in array ");
         * int key = sc.nextInt();
         * int ans = linearSearch(arr, key);
         * if (ans == -1) {
         * System.out.println("Key NOT FOUND ");
         * }else{
         * System.out.println("Key at index "+ ans);
         * }
         */

        // int ans = largestNum(arr);
        // System.out.println("Largest no. is " + ans);

        // int ans = smallestNum(arr);
        // System.out.println("Smallest No. is "+ans);

        System.out.println("Enter the key ");
        int key = sc.nextInt();
        int ans = binarySearch(arr, key);
        if (ans == -1) {
            System.out.println("Key Not Found ");
        }else{
            System.out.println("Key at Index "+ ans);
        }
    }
}
