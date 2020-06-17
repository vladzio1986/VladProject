package ua.edu.npu.lab4.task3;

public class Application {
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();
        stack.pop();
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(1);
        stack.push(9);
        stack.push(10);
        System.out.println("Popped " + stack.pop());
        System.out.println("Popped " + stack.pop());
        System.out.println("Popped " + stack.pop());
        stack.clear();
        stack.pop();

    }
}
