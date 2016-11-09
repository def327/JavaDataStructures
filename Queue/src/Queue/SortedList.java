package Queue;

/**
 * Created by Дмитрий on 19.10.2016.
 */
public class SortedList
{
    private
        Link first;
    public
        SortedList()
        {
            this.first = null;
        }

        void insert(int key)
        {
            Link newLink = new Link(key);
            Link current = first;
            Link previos = null;
            while(current != null && key > current.getData())
            {
                previos = current;
                current = current.getNext();
            }
            if (previos == null)
            {
                first = newLink;
            }
                else
                {
                    previos.setNext(newLink);
                }
            newLink.setNext(current);
        }

        void displayFirstList()
        {
            Link tmp = first;
            while(tmp != null)
            {
                System.out.println(tmp.getData());
                tmp = tmp.getNext();
            }
        }

        boolean isEmpty()
        {
            return first == null ? true : false;
        }

        Link delete()
        {
            if(this.isEmpty() == true)
            {
                return null;
            }
            else
            {
                Link tmp = this.first;
                this.first = this.first.getNext();
                return tmp;
            }
        }
}
