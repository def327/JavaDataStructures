package Tree;

/**
 * Created by Дмитрий on 23.10.2016.
 */
public class Node
{
    private int data;
    private Node right;
    private Node left;

    public Node(int val)
    {
        this.right = null;
        this.left = null;
        this.data = val;
    }

    void setData(int val)
    {
        this.data = val;
    }

    int getData()
    {
        return this.data;
    }

    void setRight(Node right)
    {
        this.right = right;
    }

    void setLeft(Node left)
    {
        this.left = left;
    }

    Node getRight()
    {
        return this.right;
    }

    Node getLeft()
    {
        return this.left;
    }


}
