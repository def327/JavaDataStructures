package DoubleLinkedList;

/**
 * Created by Дмитрий on 19.10.2016.
 */
public class Link
{
    private
        int data;
        Link next;
        Link prev;
    public
        Link(int val)
        {
            this.data = val;
            this.next = null;
            this.prev = null;
        }

        int getData()
        {
            return this.data;
        }

        Link getNext()
        {
            return this.next;
        }

        Link getPrev()
        {
            return this.prev;
        }

        void setData(int data)
        {
            this.data = data;
        }

        void setNext(Link next)
        {
            this.next = next;
        }

        void setPrev(Link prev)
        {
            this.prev = prev;
        }
}
