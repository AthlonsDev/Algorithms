public class StackByArray {
    
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.DisplayStack());

        stack.pop();
        System.out.println(stack.DisplayStack());

        stack.peek();
        System.out.println(stack.DisplayStack());

        stack.size();

    }
}
