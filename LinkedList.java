public class LinkedList {
    
    NodeList head = null;
    NodeList tail = null;

    int size = 0;

    public static void main(String[] args) {
        LinkedList myObj = new LinkedList();
        myObj.AddNode(8, true);
        myObj.AddNode(7, false);
        myObj.AddNode(11, false);
        myObj.AddNode(4, false);
        myObj.AddNode(9, false);
        myObj.AddNode(2, false);
        myObj.AddNode(14, false);
        myObj.AddNode(1, false);
        myObj.AddNode(5, false);

        myObj.print_all_data();
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

    public void print_all_data() {
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
