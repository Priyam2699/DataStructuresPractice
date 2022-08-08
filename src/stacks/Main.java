package stacks;

public class Main {

    public static void main(String[] args) {


        LinkedListStack stack = new LinkedListStack();
        stack.push(new Employee(1,"Priyam","Dua"));

        stack.push(new Employee(2,"Iqbal","Bhullar"));

        stack.push(new Employee(3,"Gurjinder","Bhatti"));

        stack.push(new Employee(4,"Randeep","Saini"));


        System.out.println("Before Pop");
        stack.printStack();

        System.out.println("The top element that is peeked is"+stack.peek());



        stack.pop();

        System.out.println("After Pop");
        stack.printStack();
















    }


}
