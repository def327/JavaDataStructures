package Stack;

/**
 * Created by Дмитрий on 18.10.2016.
 */
public class Stack
{
    private LinkList lst;

    public Stack()
    {
        lst = new LinkList();
    }

    public void push(int n )
    {
        lst.insertFirst(n);
    }

    public void pop()
    {
        Link tmp = lst.deleteFirst();
        if(tmp != null)
        {
            System.out.println(tmp.getData());
        }
            else
            {
                System.out.println("STACK is EMPTY!");
            }
    }

    public boolean StackIsEmpty()
    {
        return lst.isEmpty();
    }

    public void findKey(int n)
    {
        if (lst.Find(n) != null)
        {
            System.out.println(true);
        }
            else
            {
                System.out.println(false);
            }
    }

    public void showStack()
    {
        if(lst.isEmpty() == true)
        {
            System.out.println("STACK is EMPTY!");
            return;
        }
        lst.displayLinkList();
    }
}
