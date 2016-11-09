package Graph;

/**
 * Created by Дмитрий on 30.10.2016.
 */
public class StackX
{
    private final int SIZE = 20;
    private int[] st;
    private int top;

    public StackX()
    {
        st = new int [SIZE];
        top = -1;
    }

    public void push(int j)
    {
        st[++top] = j;
    }

    public int pop()
    {
        return st[top--];
    }

    public int peek()
    {
        return st[top];
    }

    public boolean isEmpty()
    {
        if (top == -1)
        {
            return true;
        }
            else
            {
                return false;
            }
    }
}
