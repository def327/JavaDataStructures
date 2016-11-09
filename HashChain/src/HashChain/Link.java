package HashChain;

/**
 * Created by Дмитрий on 27.10.2016.
 */
public class Link
{
    private int data;
    private Link next;

    public Link(int data)
    {
        this.data = data;
        this.next = null;
    }

    public void setNext(Link next)
    {
        this.next = next;
    }

    public Link getNext()
    {
        return this.next;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public int getData()
    {
        return this.data;
    }

    public void displayLink()
    {
        System.out.print(this.data + " ");
    }
}
