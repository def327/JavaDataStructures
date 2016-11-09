package Stack;


public class Link
{
    private int data;
    private Link next;

    public Link(int data)
    {
        this.data = data;
        this.next = null;
    }

    public void setData(int d)
    {
        this.data = d;
    }

    public void setNext(Link n)
    {
        this.next = n;
    }

    public int getData()
    {
        return  this.data;
    }

    public Link getNext()
    {
        return this.next;
    }
}
