package MyObj;

/**
 * Created by Дмитрий on 17.10.2016.
 */
public class InToPost
{
    private
        StackArray stack;
        String input;
        String output;
    public
        InToPost(String n)
        {
            input = n;
            stack = new StackArray(n.length());
        }

}
