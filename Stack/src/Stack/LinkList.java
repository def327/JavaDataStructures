package Stack;

/**
 * Created by Дмитрий on 18.10.2016.
 */
public class LinkList
{
    private Link first;

    public LinkList()
    {
        this.first = null;
    }

    public void insertFirst(int val)
    {
        Link newlink = new Link(val);
        newlink.setNext(this.first);
        this.first = newlink;
    }

    public Link deleteFirst()
    {
        if(this.isEmpty() == true)
        {
            return null;
        }
            else
            {
                Link tmp = first;
                first = first.getNext();
                return tmp;
            }
    }

    public void displayLinkList()
    {
        Link current = first;
        while( current != null)
        {
            System.out.println(current.getData() + " ");
            current = current.getNext();
        }
    }

    public boolean isEmpty()
    {
        if(this.first == null)
        {
            return true;
        }
            else
            {
                return false;
            }
    }

    public Link Find(int key)
    {
        if(this.isEmpty() == true)
        {
            return null;
        }
            else
            {
                Link current = this.first;
                while(current != null)
                {
                    if(current.getData() == key)
                    {
                        return current;
                    }
                    current = current.getNext();
                }
                return null;
            }
    }


}
