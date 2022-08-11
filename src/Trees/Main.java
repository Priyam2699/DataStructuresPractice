package Trees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Tree tree = new Tree();


        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);



        tree.traverseInOrder();

        System.out.println("\n"+tree.get(7));
        System.out.println(tree.get(27));
        System.out.println(tree.get(15));


        System.out.println("Minimum value in the tree is : "+tree.min());
        System.out.println("Max value in the tree is : "+tree.max());



        tree.delete(30);

        tree.traverseInOrder();


        int[] arr = {1,2,3};

        System.out.println(arr.length);

        arr = Arrays.copyOf(arr,arr.length*2);







    }


}
