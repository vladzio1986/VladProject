package ua.edu.npu.lab4.task2;

public class ArrayStack implements Stack {
    private int size;
    private Integer[] arrayStack;
    private  int top;
    private int showData;


    public ArrayStack (Integer size) {
        this.size = size;
        arrayStack = new Integer[size];
        top = -1;
    }

    public void push (int data) {
        if (this.isFull()) {
            System.out.println("Stack is full. Can't add data");
        }
        else {
            arrayStack[++top] = data;
        }
    }

    public int pop () {
        showData = arrayStack[top];
        arrayStack[top--] = null;
        return showData;
    }

    public int getSize () {
        return this.top+1;
    }

    public boolean isEmpty () {
        return (top == -1);
    }

    public boolean isFull () {
        return (top == size - 1);
    }

    public void clear () {
        while (!this.isEmpty()) {
            arrayStack[top--] = null;
        }
        System.out.println("Stack cleared");
    }
}
