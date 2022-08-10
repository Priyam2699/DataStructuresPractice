package searchingAlgorithms;

import java.util.Scanner;

public class BinarySearchByRecursion {

    public static void main(String[] args) {


        int[] arr = {-15, -5, 5, 18, 23, 52, 79, 951, 105584};


        Scanner s = new Scanner(System.in);

        int x = s.nextInt();


        System.out.println("The element is present in " + binarySearch(arr, x));


    }


    public static int binarySearch(int[] arr, int value) {


        return binarySearch(arr, 0, arr.length, value);

    }

    public static int binarySearch(int[] arr, int start, int end, int value) {


        if (start > end) {


            return -1;
        }


        int mid = (start + end) / 2;


        if (arr[mid] == value) {

            return mid;
        } else if (arr[mid] < value) {


            return binarySearch(arr, mid + 1, end, value);
        } else {

            return binarySearch(arr, start, mid - 1, value);
        }










    }


}
