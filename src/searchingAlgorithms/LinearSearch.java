package searchingAlgorithms;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {



                int[] arr = {20,15,4,89,-48,32,5,88,999,-5};


                Scanner s = new Scanner(System.in);

                int x = s.nextInt();

                for(int i=0; i<arr.length; i++)
                {

                    if(arr[i]==x)
                    {

                        System.out.println("Element found at position "+i);
                        break;

                    }



                }



    }



}
