package searchingAlgorithms;

import java.util.*;

public class BinarySearchByIteration {


    public static void main(String[] args) {


        Integer[] arr = {-15,-5,5,18,23,52,79,951,105584};


        Scanner s = new Scanner(System.in);

        Integer x = s.nextInt();


        System.out.println("The element is present in " + binarySearch(arr, x));


    }


    public static int binarySearch(Object[] arr, Integer value) {


        int start = 0;
        int end = arr.length;

        while (start < end) {

            int mid = (start + end) / 2;

            if (arr[mid] == value) {

                return mid;
            } else if ((Integer)arr[mid] < value) {

                start = mid + 1;

            } else {

                end = mid - 1;
            }


        }


        return -1;
    }


}
