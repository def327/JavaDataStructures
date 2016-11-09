package Queue;

/**
 * Created by Дмитрий on 19.10.2016.
 */
public class Link
{
    private int data;
    private Link next;
    public
        Link(int data)
        {
            this.data = data;
            this.next = null;
        }

        void setData(int data)
        {
            this.data = data;
        }

        void setNext(Link a)
        {
            this.next = a;
        }

        int getData()
        {
            return this.data;
        }

        Link getNext()
        {
            return this.next;
        }

}
