import java.util.*;

public class Stacks {
    int size = 0;
    public static void main(String[] args) {
        Stacks obj = new Stacks();
        Scanner sc = new Scanner(System.in);
        // create the stack
        Stack<String> friendList = new Stack();

        System.out.println("choose friends name to push to stack");
        
        // repeat until stack has 5 friends in it
        while(friendList.size() <= 5) {
            String name = sc.nextLine();
            // push items into stack
            obj.PushToStack(friendList, name, obj.size);
        }

        // pop items from stack
        System.out.println("how many items to remove from stack?");
        int index = sc.nextInt();
        obj.PopFromStack(friendList, index);

        // display names
        System.out.print(obj.DisplayNames(friendList));
    }

    private void PushToStack(Stack <String> stack, String name, int size) {
  
        if(size <= 5) {
            System.out.println("Friend Pushed on Stack " + stack.push(name));
            size++;
        }
        
    }

    private void PopFromStack(Stack <String> stack, int index) {

        for (int i = 0; i < index; i++) {
            System.out.println(stack.pop() + " is out of the Stack");
            System.out.println("Pop element from top of the Stack");
        }


    }

    private String DisplayNames(Stack <String> stack) {

        if(!(stack.isEmpty()))
            return stack.toString();
        return null;

    }
}
