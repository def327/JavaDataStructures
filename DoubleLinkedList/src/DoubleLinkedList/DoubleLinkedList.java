package DoubleLinkedList;

/**
 * Created by Дмитрий on 19.10.2016.
 */
public class DoubleLinkedList
{
    private
        Link last;
        Link first;
    public
        DoubleLinkedList()
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
                newLink.setPrev(null);
                first = newLink;
                last = newLink;
            }
                else
                {
                    Link newLink = new Link(val);
                    first.setPrev(newLink);
                    newLink.setNext(first);
                    newLink.setPrev(null);
                    first = newLink;
                }
        }

        void insertLast(int val)
        {
            if(this.isEmpty() == true)
            {
                Link newLink = new Link(val);
                newLink.setNext(first);
                newLink.setPrev(null);
                first = newLink;
                last = newLink;
            }
                else
                {
                    Link newLink = new Link(val);
                    newLink.setNext(last.getNext());
                    newLink.setPrev(last);
                    last.setNext(newLink);
                    last = newLink;
                }
        }

        void insertAfter(int key,int val)
        {
            if( this.isEmpty() == true)
            {
                System.out.println("Double LINKED LIST is EMPTY!");
            }
                else
                {
                    Link current = first;
                    while( current != null)
                    {
                        if(current.getData() == key)
                        {
                            Link newLink = new Link(val);
                            newLink.setNext(current.getNext());
                            newLink.setPrev(current);
                            current.setNext(newLink);
                            return;
                        }
                        current = current.getNext();
                    }
                    System.out.println("There is no element with key = " + key);
                }
        }

        Link deleteFirst()
        {
            if(this.isEmpty() == true)
            {
                return null;
            }
             else
                {
                    Link tmp = first;
                    first = first.getNext();
                    if(first == null)
                    {
                        last = null;
                        return tmp;
                    }
                    first.setPrev(null);
                    return tmp;
                }
        }

        Link deleteLast()
        {
            if(this.isEmpty() == true)
            {
                return null;
            }
            else
            {
                Link tmp = last;
                last = last.getPrev();
                if(last == null)
                {
                    first = null;
                    return tmp;
                }
                last.setNext(null);
                return tmp;
            }
        }

        Link deleteKey(int key)
        {
            if(this.isEmpty() == true)
            {
                return null;
            }
                else
                {
                    Link current = first;
                    while(current != null)
                    {
                        if(current.getData() == key)
                        {
                            if(current.getPrev() == null)
                            {
                                return deleteFirst();
                            }
                            current.getPrev().setNext(current.getNext());
                            if(current.getNext() == null)
                            {
                                last = current.getPrev();
                            }
                            if(current.getNext() != null)
                            {
                                current.getNext().setPrev(current.getPrev());
                            }
                            return current;
                        }
                        current = current.getNext();
                    }
                    return null;
                }
        }

        void delKey(int key)
        {
            if(this.isEmpty() == true)
            {
                System.out.println("List is empty!!!");
                return;
            }
            Link tmp = this.deleteKey(key);
            if(tmp == null)
            {
                System.out.println("There is no element with key = " + key);
            }
                else
                {
                    System.out.println("Delete " + tmp.getData() + " from first");
                }
        }

        void delFirst()
        {
            Link tmp = this.deleteFirst();
            if(tmp == null)
            {
                System.out.println("List is empty!!!");
            }
                else
                {
                    System.out.println("Delete " + tmp.getData() + " from first");
                }
        }

        void delLast()
        {
            Link tmp = this.deleteLast();
            if(tmp == null)
            {
                System.out.println("List is empty!!!");
            }
                else
                {
                    System.out.println("Delete " + tmp.getData() + " from last");
                }
        }

        void showForward()
        {
            if(this.isEmpty() == true)
            {
                System.out.println("List is empty!!!");
            }
                else
                {
                    Link tmp = first;
                    while( tmp != null)
                    {
                        System.out.println(tmp.getData());
                        tmp = tmp.getNext();
                    }
                }
        }

        void showBackForward()
        {
            if(this.isEmpty() == true)
            {
                System.out.println("List is empty!!!");
            }
                else
                {
                    Link tmp = last;
                    while( tmp != null)
                    {
                        System.out.println(tmp.getData());
                        tmp = tmp.getPrev();
                    }
                }
        }

        boolean isEmpty()
        {
            return this.first == null ? true : false;
        }
}
