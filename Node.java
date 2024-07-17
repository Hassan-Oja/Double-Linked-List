public class Node {
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data = data;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public Node getprev() {
        return prev;
    }

    public void setprev(Node prev) {
        this.prev = prev;
    }


    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
