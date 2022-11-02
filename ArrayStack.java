import java.util.Arrays;

public class ArrayStack {
    private int array[];
    private int capacity;
    private int top;

    ArrayStack(int size) {
        array = new int[size];
        top = -1;
        capacity = size;
    }


    public void push(int item) {
        array[++top] = item;
    }

    public int pop() {
        return array[top--];
    }

    public int peek() {
        return array[top];
    }

    public int size() {
        return array.length;
    }

    public String DisplayStack() {
        return Arrays.toString(array);
    }
}
