package Queue;

/**
 * Created by Дмитрий on 19.10.2016.
 */
public class FirstLastList
{
    private
        Link first;
        Link last;
    public
        FirstLastList()
        {
            this.first = null;
            this.last = null;
        }

        void insertFirst(int val)
        {
            if(this.isEmpty() == true)
            {
                Link newLink = new Link(val);
                newLink.setNext(first);
                first = newLink;
                last = newLink;
            }
                else
                {
                    Link newLink = new Link(val);
                    newLink.setNext(first);
                    first = newLink;
                }
        }

        void insertLast(int val)
        {
            if( this.isEmpty() == true)
            {
                this.insertFirst(val);
            }
                else
                {
                    Link newLink = new Link(val);
                    newLink.setNext(last.getNext());
                    this.last.setNext(newLink);
                    last = newLink;
                }
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

        Link deleteFirst()
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

    // /-----For merge ---------
       /* static void mergeList(FirstLastList lst1, FirstLastList lst2)
        {
            lst1.last.setNext(lst2.first);
            lst1.last = lst2.last;
        }

        Link getFirst()
        {
            return first;
        }
        Link getLast()
        {
            return last;
        }

        void setLast(Link last)
        {
            this.last = last;
        }
        */
}
