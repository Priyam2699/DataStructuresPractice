import java.util.Scanner;

public class BubbleSort {


    public static void main(String[] args) {


        int[] arr = {20, -15, 35, 7, 55, 55, 1, -22};

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorting using Bubble Sort");
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

}
