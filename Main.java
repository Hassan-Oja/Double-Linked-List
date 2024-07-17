public class Main {
    public static void main(String[] args) {
        double_LL l1 = new double_LL();
        System.out.println(l1.isEmpty());
        l1.insert_first(10);
        l1.insert_last(20);
        l1.insert_pos(15,1);
        l1.insert_last(25);
        l1.insert_sort(30);
        l1.insert_first(5);
        l1.display();
        System.out.println("");

        System.out.println(l1.count());
        System.out.println("");

        System.out.println(l1.getLen());
        System.out.println("");

        System.out.println(l1.search(20));
        System.out.println(l1.search(30));
        System.out.println("");

        l1.printMiddle();
        System.out.println("");

        l1.deleteFirst();
        l1.deleteLast();
        l1.deletpos(3);
        l1.display();
        System.out.println("");

        System.out.println(l1.reverse());
        System.out.println("");

        System.out.println(l1.sum());
        System.out.println("");

        l1.clear();
        l1.display();

    }
}