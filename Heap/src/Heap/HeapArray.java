package Heap;

/**
 * Created by Дмитрий on 29.10.2016.
 */
public class HeapArray
{
    private Node[] heapArray;
    private int maxSize;            // The size of array
    private int currentSize;        //A current array's size

    public HeapArray(int maxSize)
    {
        this.maxSize = maxSize;
        this.currentSize = 0;
        heapArray = new Node [this.maxSize];
    }

    public boolean isEmpty()
    {
        if(currentSize == 0)
        {
            return true;
        }
            else
            {
                return false;
            }
    }

    public boolean insert(int key)
    {
        if(currentSize == maxSize)
        {
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize);
        currentSize++;  // increase the size of elements at the array
        return true;
    }

    public void trickleUp(int index)    //Find a position for a new Element at the array
    {
        int parent = (index-1)/2;
        Node bottom = heapArray[index];

        while(index > 0 && heapArray[parent].getData() < bottom.getData())
        {
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent-1)/2;
        }
        heapArray[index] = bottom;
    }

    public Node remove()    //Remove the element with max key
    {
        if(currentSize == 0)
        {
            return null;
        }
        Node root  = heapArray[0];      //The element with a max key to return
        heapArray[0] = heapArray[--currentSize];    //The root is the last node
        trickleDown(0);     //Check the root key and drop int down
        return root;
    }

    public void trickleDown(int index)
    {
        int largerChild;
        Node top = heapArray[index];    //Save the root at the container
        while(index < currentSize/2)
        {
            int leftChild = 2*index + 1;
            int rightChild = leftChild + 1;

            if(rightChild < currentSize && heapArray[leftChild].getData() <
                                           heapArray[rightChild].getData())
            {
                largerChild = rightChild;
            }
                else
                {
                    largerChild = leftChild;
                }

            if(top.getData() >= heapArray[largerChild].getData())
            {
                break;
            }

            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }

    public boolean change(int index, int newValue)  //Change the priority of element
    {
        if(index < 0 || index >= currentSize)
        {
            return false;
        }
        int oldValue = heapArray[index].getData();
        heapArray[index].setData(newValue);

        if(oldValue < newValue)
        {
            trickleUp(index);
        }
            else
            {
                trickleDown(index);
            }
        return true;
    }
}
