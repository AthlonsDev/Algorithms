public class NodeList {
    // Data
    int data;
    // Pointer
    NodeList Next;

    // create new node
    public NodeList(int _data, NodeList _next) {
        Next = _next;
        data = _data;
    }

    // go to next node
    public NodeList GetNext() {
        return Next;
    }

    // return data
    public int GetData() {
        return data;
    }

    // add data in the list
    public void SetData(int _data) {
        data = _data;
    }

    // set the new pointer
    public void SetNext(NodeList _next) {
        Next = _next;
    }
}
