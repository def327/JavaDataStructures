package Queue;

/**
 * Created by Дмитрий on 19.10.2016.
 */
public class Queue
{
    private FirstLastList lst;
    public
        Queue()
        {
            lst = new FirstLastList();
        }

        void insertFirst(int val)
        {
            lst.insertFirst(val);
        }

        void insertLast(int val)
        {
            lst.insertLast(val);
        }

        void deleteFirst()
        {
            Link tmp = lst.deleteFirst();
            if (tmp == null)
            {
                System.out.println("The Queue is EMPTY");
            }
                else
                {
                    System.out.println(tmp.getData());
                }

        }

        void displayQueue()
        {
            if (lst.isEmpty() == true)
            {
                System.out.println("The Queue is EMPTY");
            }
            lst.displayFirstList();
        }

        /*---Merge-----------------------
        static void mergeQueues(Queue obj1, Queue obj2)
        {
            obj1.lst.getLast().setNext(obj2.lst.getFirst());
            obj1.lst.setLast(obj2.lst.getLast());
        }
        */
}
