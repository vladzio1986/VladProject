package ua.edu.npu.lab4.task2;

public class Application {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push(4);
        stack.push(3);
        stack.push(9);
        stack.push(6);
        System.out.println("Popped " + stack.pop());
        System.out.println("Stack size is: " + stack.getSize());
        stack.clear();
        System.out.println("Stack size is: " + stack.getSize());

    }
}
