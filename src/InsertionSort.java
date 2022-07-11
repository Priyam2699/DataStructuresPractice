public class InsertionSort {


    public static void main(String[] args) {


        int[] arr = {20, -15, 35, 7, 55, 1, -22};

        System.out.print("Before Insertion Sort \n");

        for (int x : arr) {

            System.out.print(x + " ");
        }


        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        System.out.print("\nAfter Insertion Sort\n");

        for (int x : arr) {

            System.out.print(x + " ");
        }


    }


}
