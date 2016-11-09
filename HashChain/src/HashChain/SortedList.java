package HashChain;

/**
 * Created by Дмитрий on 27.10.2016.
 */
public class SortedList
{
    private Link first;

    public SortedList()
    {
        this.first = null;
    }

    public Link getFirst()
    {
        return first;
    }

    public void setFirst(Link first)
    {
        this.first = first;
    }

    public void insertList(Link newLink)
    {
        Link previous = null;
        Link current = first;
        while(current != null && newLink.getData() > current.getData())
        {
            previous = current;
            current = current.getNext();
        }
        if(previous == null)
        {
            first = newLink ;
        }
            else
            {
                previous.setNext(newLink);
            }
        newLink.setNext(current);
    }

    public void display()
    {
        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.getNext();
        }
    }

    public boolean delete(int key)
    {
        Link current = first;
        Link previous = null;
        while(current != null && key != current.getData())
        {
            previous = current;
            current = current.getNext();
        }

        if(current == null)
        {
            return false ;
        }

             else if(previous == null && current != null)
             {
                first = first.getNext();
             }

                else
                {
                    previous.setNext(current.getNext());
                }
        return  true;
    }

    public Link find(int key)
    {
        Link current = first;
        while((current != null) && (current.getData() <= key))
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
