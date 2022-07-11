public class SelectionSort {


    public static void main(String[] args) {


        int[] arr = {20, -15, 35, 7, 55, 1, -22};

        System.out.print("Before Selection Sort \n");

        for (int x : arr) {

            System.out.print(x + " ");
        }

        for (int j = 0; j < arr.length; j++) {


            int min = arr[j];
            int index = j;
            int temp = 0;
            for (int i = j + 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    index = i;

                }
            }

            temp = arr[j];
            arr[j] = arr[index];
            arr[index] = temp;

        }


        System.out.print("\nAfter Selection Sort\n");

        for (int x : arr) {

            System.out.print(x + " ");
        }


    }


}
