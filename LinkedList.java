import java.util.*;

public class LinkedList {
    
    NodeList head = null;
    NodeList tail = null;

    int size = 0;
    int maxSize = 0;

    public static void main(String[] args) {
        LinkedList myObj = new LinkedList();
        // myObj.AddNode(8, true);
        // myObj.AddNode(7, false);
        // myObj.AddNode(11, false);
        // myObj.AddNode(4, false);
        // myObj.AddNode(9, false);
        // myObj.AddNode(2, false);
        // myObj.AddNode(14, false);
        // myObj.AddNode(1, false);
        // myObj.AddNode(5, false);

        // myObj.print_all_data();


         // Task 2: Ask for user input to form linked list
         Scanner sc = new Scanner(System.in);
         System.out.println("Insert size of Linked List");
         myObj.maxSize = sc.nextInt();
 
         System.out.println("Insert Number to Place in The Linked List");
         for (int index = 0; index < myObj.maxSize; index++) {
            
             myObj.addNodeByUser(sc.nextInt(), false);
             
         }
         System.out.println(myObj.GetSize());
         myObj.PrintMe();

        // //  Task 3: Print value from index
        // System.out.println("Select index from which to print");
        // int index = sc.nextInt();
        // myObj.PrintFromIndex(index);

        // Task 4: Delete Node from head or tail
        System.out.println("Should the element be removed from the head?");
        boolean removeHead = sc.hasNextBoolean();
        
        myObj.DeleteItemFromList(removeHead);

    }

    public void DeleteItemFromList(boolean flag) {

        // delete from head
        if (flag) {
            NodeList temp = head;
            head = head.GetNext();
            temp.SetNext(null);
            size--;
        }
        // delete from tail
        else {
            for (int i = 0; i < size; i++) {
                // TODO: loop through list to find tail = when getnext is null
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
        head = new NodeList(data, null);
        tail = head;
        size++;
        return;
        }
    NodeList Temp = new NodeList(data, null);
    if (flag) { //add node at head
        Temp.SetNext(head);
        head = Temp;
    } else { //add node at tail
        tail.SetNext(Temp);
        tail = Temp;
    }
    size++;
    }

    public void AddNode(int data, boolean flag) {
         if (head == null) { //add first node as head, if there's no head
            head = new NodeList(data, null);
            tail = head;
            size++;
            return;
        }
        NodeList Temp = new NodeList(data, null);
        if (flag == true) { //add node at head
            Temp.SetNext(head);
            head = Temp;
        } else { //add node at tail
            tail.SetNext(Temp);
            tail = Temp;
        }
        size++;

    }

    public int get_data(int index, boolean print) {
        if (index <= 0) {
            return 0;
        }

        NodeList Current = head;
// pass through list to reach destination until index == value entered at which point stops the loop and executes method
        for (int i = 1; i < index; i++) {
            // if getnext return 0 it means the list is empty
            if(Current.GetNext() == null) {
                return 0;
            }
            // not 0 so keeps going forward on the list
            Current = Current.GetNext();    
        }
        // the destination is reached and th emethod getdata that gives corresponding data gets called
        return Current.GetData();
    }

    public void PrintMe() {
        NodeList Current = head;
        int returnValue = 0;

        for (int i = 0; i < size; i++) {
            returnValue = Current.GetData();
            System.out.print(returnValue + "-->");
            Current = Current.GetNext();

        }
        System.out.println("null");
    }

    public int GetSize() {
        return size;
    }


}
