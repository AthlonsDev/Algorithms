import java.util.*;

public class LinkedList {
    
    NodeList head = null;
    NodeList tail = null;

    int size = 0;
    int maxSize = 0;

    public static void main(String[] args) {
        LinkedList myObj = new LinkedList();

         // Task 2: Ask for user input to form linked list
         Scanner sc = new Scanner(System.in);
         System.out.println("Insert size of Linked List");
         myObj.maxSize = sc.nextInt();
 
         System.out.println("Insert Number to Place in The Linked List");
         for (int index = 0; index < myObj.maxSize; index++) {
            
             myObj.addNodeByUser(sc.nextInt(), false);
             
         }
         myObj.PrintMe();

        // //  Task 3: Print value from index
        System.out.println("Select index from which to print");
        int index = sc.nextInt();
        myObj.PrintFromIndex(index);

        // Task 4: Delete Node from head or tail
        System.out.println("Should the element be removed from the head?");
        boolean removeHead = sc.nextBoolean();
        
        myObj.DeleteItemFromList(removeHead);

    }

    public void DeleteItemFromList(boolean flag) {

        // if head is not found = list is empty
        if(head == null) {
            System.out.println("Linked list is empty");
        }

        NodeList temp = head;
        // if falge is true delete from head
        if (flag) {
            // get pointer
            head = head.GetNext();
            // set pointer to null
            temp.SetNext(null);
            size--;
        }
        // delete from tail
        else {
            //loop through list to find tail = when getnext is null
            for (int i = 0; i < size; i++) {
                // if the pointer of the node null
                if(temp.GetNext() == null) {
                    System.out.println("found the tail - Deleting...");
                    // set pointer to tail - unnecessary, the pointer of the tail is always null
                    temp.SetNext(tail);
                    size--;
                }
                // if the tail is not found proceed with next node
                temp = temp.GetNext();
            }
        }
        PrintMe();

    }

    public void PrintFromIndex(int index) {
        NodeList Current = head;
        int returnValue = 0;

        for (int i = 0; i < size; i++) {
            if(i == index) {
                returnValue = Current.GetData();
                System.out.print(returnValue + "-->");
                return;
            }
            Current = Current.GetNext();

        }
        System.out.println("null");
    }

    public void addNodeByUser(int data, boolean flag) {
        if (head == null) { //add first node as head, if there's no head
        // set head to new node with data and no pointer
        head = new NodeList(data, null);
        // for now head is also tail
        tail = head;
        size++;
        return;
        }
    // one item is present so adds items at head
    NodeList Temp = new NodeList(data, null);
    if (flag) { 
        // here the pointer will be head, this places the new node in front of the previous
        Temp.SetNext(head);
        head = Temp;
    // adds items at tail
    } else { 
        // pointer will be temp which is null so it will be placed behind prevoius element
        tail.SetNext(Temp);
        tail = Temp;
    }
    size++;
    }

    public void PrintMe() {
        NodeList Current = head;
        int nodeData = 0;

        for (int i = 0; i < size; i++) {
            // stores the data of the current element
            nodeData = Current.GetData();
            // prints data of current element
            System.out.print(nodeData + "-->");
            // current element, using pointer, passes to the next element
            Current = Current.GetNext();

        }
        
        System.out.println("null");
    }

}
