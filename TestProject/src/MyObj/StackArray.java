package MyObj;


public class StackArray
{
    private
        char [] arr;
        int maxSize;
        int top;
    public
        StackArray(int size)
        {
            arr = new char[size];
            maxSize = size;
            top = -1;
        }

        void push(char val)
        {
            arr[++top] = val;
        }

        int pop()
        {
            return arr[top--];
        }

        char peek()  //Read a top value without pop
        {
            return arr[top];
        }

        boolean isEmpty()
        {
            return top == -1 ? true : false;
        }

        int size()
        {
            return top+1;
        }

        void displayStack()
        {
            for(int i = top; i > -1; i--)
            {
                System.out.println(arr[i]);
            }
        }
}
