package stacks;

public class Main {

    public static void main(String[] args) {



        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee(1,"Priyam","Dua"));

        stack.push(new Employee(2,"Iqbal","Bhullar"));

        stack.push(new Employee(3,"Gurjinder","Bhatti"));

        stack.push(new Employee(4,"Randeep","Saini"));

        stack.printStack();

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());









    }


}
