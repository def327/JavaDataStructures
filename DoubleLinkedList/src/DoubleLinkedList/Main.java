package DoubleLinkedList;

public class Main {

    public static void main(String[] args)
    {
	    DoubleLinkedList lst = new DoubleLinkedList();
        lst.insertLast(1);
        lst.insertLast(2);
        lst.insertFirst(14);
        //lst.delKey(14);
        lst.delKey(1);
        //lst.delKey(2);
        //lst.showForward();
        lst.insertFirst(123);
        lst.showBackForward();
        lst.showForward();

    }
}
