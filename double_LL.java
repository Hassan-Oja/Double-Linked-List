public class double_LL {
    Node head;


    public double_LL() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert_first(int data) {
        Node current = head;
        Node newnode = new Node(data);
        if (isEmpty()) {
            head = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            newnode.prev = null;
            head = newnode;
        }
    }

    public void insert_last(int data) {
        Node current = head;
        Node newnode = new Node(data);
        if (isEmpty()) {
            head = newnode;
        } else {

            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
            newnode.prev = current;
            newnode.next = null;
        }
    }

    public int count() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insert_pos(int data , int pos) {
        Node current = head;
        Node newnode = new Node(data);
        int c = count();
        if (pos == 0) {
            insert_first(data);
        } else if (pos == c) {
            insert_last(data);
        } else if (pos < 0 || pos > c) {
            System.out.println("pos error");
        } else {

            for (int i = 0; i < pos; i++) {
                current = current.next;
            }
            newnode.prev = current.prev;
            newnode.next = current;
            current.prev.next = newnode;
            current.prev = newnode;

        }
    }
        public void insert_sort(int data){
            Node new_node = new Node(data);
            if(isEmpty()){
                insert_first(data);
            }else if(head.next==null){
                if(head.data>data){
                    insert_first(data);
                }else{
                    insert_first(data);
                }
            }else{
                if(head.data>data){
                    insert_first(data);
                }else{
                    Node temp = head;
                    Node temp1 = temp.next;
                    while (temp1 != null && temp1.data<data){
                        temp = temp1;
                        temp1 = temp1.next;
                    }
                    if(temp1 == null){
                        insert_last(data);
                    }else{
                        temp.next = new_node;
                        new_node.next = temp1;

                    }
                }
            }
        }
    public int getLen(){
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }


    public int deleteFirst() {
        Node current = head;
        int x;
        if (isEmpty()) {
            return 0;
        } else {
            x = head.data;
            head = head.next;
            current.prev = null;
        }
        return x;
    }

    public void printMiddle() {
        if (head != null) {
            int length = getLen();
            Node temp = head;
            int middleLength = length / 2;
            while (middleLength != 0) {
                temp = temp.next;
                middleLength--;
            }
            System.out.print("The middle element is ["
                    + temp.data + "]");
            System.out.println();
        }
    }

    public int deleteLast() {
        Node current = head;
        if (isEmpty()) {
            return 0;
        } else {
            int x;
            if (head.next == null) {
                x = head.data;
                head = null;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                x = temp.data;
                temp.prev.next = null;
            }
            return x;
        }
    }

    public int deletpos(int pos) {
        Node current = head;
       int c = count();
       if(pos == 0){
           deleteFirst();
       } else if (pos == c-1) {
           deleteLast();
       } else if (pos < 0 || pos > c) {
           return 0 ;
       }else{
           for(int i = 0 ; i < pos ; i++){
               current = current.next;
           }
           int x = current.data;
           current.prev.next = current.next;
           current.next.prev = current.prev;
           return x ;
       }
        return c;
    }
    public int sum(){
        double_LL temp = new double_LL();
        int sum = 0;
        int x;
        while(!isEmpty()){
            x = deleteFirst();
            temp.insert_first(x);
            sum += x;
        }
        while(!temp.isEmpty()){
            x = temp.deleteFirst();
            insert_first(x);
        }
        return sum;
    }

    public void display() {
        Node current = head;
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Node temp = head;
            System.out.print("List Values are:  ");
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.println();
        }
    }

    public Object reverse(){
        double_LL temp = new double_LL();
        while (!isEmpty()){
            int x = deleteFirst();
            temp.insert_first(x);
        }
        while (!temp.isEmpty()){
            int x = temp.deleteFirst();
            insert_last(x);
        }
        return this;
    }
    public boolean search(int data) {
        Node current = head;
        if (isEmpty()) {
            return false;
        } else {
            while (current != null) {
                if (current.data == data) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }
    public void clear(){
        head = null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("singel_LL{");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        sb.append("}");
        return sb.toString();
    }
}
