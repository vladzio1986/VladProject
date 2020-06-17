package ua.edu.npu.lab4.task3;

public class DynamicStack implements Stack {

    private int initSize = 16;
    private int cutRate = 4;
    private Integer[] stack = new Integer[initSize];
    private int pointer = 0;

    public void push(int data) {
        if(pointer == stack.length-1) {
            resize(stack.length * 2);
        }
        stack[pointer++] = data;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty. Can't pop");
        }
        else {
            stack[pointer--] = null;
            if (stack.length > initSize && pointer < stack.length / cutRate)
                resize(stack.length / 2);
        }
        if(stack[pointer] == null){
            return 3;
        }
        else {
            return stack[pointer];
        }
    }

    public int getSize() {
        return pointer;
    }

    public boolean isEmpty() {
        return (pointer == 0);
    }

    public void clear() {
        while (pointer != 0) {
            stack[pointer--] = null;
        }
        resize(initSize);
        System.out.println("Stack cleared");
    }

    private void resize (int newLength) {
        Integer[] newStack = new Integer[newLength];
        System.arraycopy(stack, 0, newStack, 0, pointer);
        stack = newStack;
    }
}
