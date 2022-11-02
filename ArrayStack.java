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

    private boolean isEmpty() {
        System.out.println("checking...");
        try {
            System.out.println(array[capacity - capacity - 1]);
            return false; 
        } catch (Exception e) {
            System.out.println("Stack Underflow");
            return true;
        }
    }

    private boolean isFull() {
        System.out.println("checking...");
        try {
            System.out.println(array[capacity + 1]);
            return false; 
        } catch (Exception e) {
            System.out.println("Stack Overflow");
            return true;
        }
        
    }

    public void push(int item) {
        if (isFull()) {
            System.exit(1);
        } else {
            array[++top] = item;
        }
    }

    public int pop() {

        if(isEmpty()) {
            System.exit(1);
            return 0;
        } else {
            int [] temp = new int[array.length - 1];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < temp.length; j++) {
                    temp[j] = array[j];
                }
            }
            array = temp;
            top--;
            return array[top];
        }

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
