package Tree;


public class Tree
{
    private Node root;

    public Node getRoot()
    {
        return root;
    }

    public Tree(int val)
    {
        this.root = new Node(val);
    }

    public Node find(int key)
    {
        if( root == null)
        {
            return null;
        }
            else
            {
                Node current = root;
                while(true)
                {
                    if(current == null)
                    {
                        return null;
                    }

                    if(key == current.getData())
                    {
                        return current;
                    }

                    if( key < current.getData())
                    {
                        current = current.getLeft();
                    }
                        else
                        {
                           current = current.getRight();
                        }
                }
            }
    }

    public void insert(int val)
    {
        Node newNode = new Node(val);
        Node current = root;
        Node parent = current;
        while(true)
        {
            parent = current;
            if(val > current.getData())
            {
                current = current.getRight();
                if(current == null)
                {
                    parent.setRight(newNode);
                    return;
                }
            }
                else
                {
                    current = current.getLeft();
                    if(current == null)
                    {
                        parent.setLeft(newNode);
                        return;
                    }
                }
        }
    }

    public static void displayTree(Node local)
    {
        if(local != null)
        {
            displayTree(local.getLeft());
            System.out.print(local.getData() + "--");
            displayTree(local.getRight());
        }
    }

    ///---Function for delete node with both nodes (Left & Right)
    private Node getSuccessor(Node delNode)
    {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.getRight();
        while(current != null)
        {
            successorParent = successor;
            successor = current;
            current = current.getLeft();
        }
        if(successor != delNode.getRight())
        {
            successorParent.setLeft(successor.getRight()); //merge successor right tree with ParenSuccessor
            successor.setRight(delNode.getRight());
            successor.setLeft(delNode.getLeft()); // my fix---
        }
        return  successor;
    }

    /*
    public boolean delete(int key)      //Дописать метод удаления узла с 2 листами
    {
        //Check the tree is empty?
        if( root == null)
        {
            return false;
        }
            else
            {
                Node current = root;
                Node parent = current;
                while( current != null)
                {
                    if(key == current.getData())
                    {
                        break;
                    }

                    parent = current;

                    if(key < current.getData())
                    {
                        current = current.getLeft();
                    }
                        else
                        {
                            current = current.getRight();
                        }
                }
                //If we find the deleted node at the tree, try to delete it
                if(current == null)
                {
                    return false;
                }
                    else    //---find the node with key
                    {
                        //---Delete current node without children
                        if(current.getLeft() == null && current.getRight() == null)
                        {
                            if(parent.getData() > current.getData())
                            {
                                parent.setLeft(null);
                            }
                                else
                                {
                                    parent.setRight(null);
                                }
                            return true;
                        }

                        //---Delete current node with one LEFT child
                            else if(current.getLeft() != null && current.getRight() == null)
                            {
                                if(parent.getRight() == current)
                                {
                                    parent.setRight(current.getLeft());
                                    return true;
                                }

                                if(parent.getLeft() == current)
                                {
                                    parent.setLeft(current.getLeft());
                                    return true;
                                }
                            }

                        //---Delete current node with one RIGHT child
                            else if(current.getRight() != null && current.getLeft() == null)
                            {
                                if(parent.getRight() == current)
                                {
                                    parent.setRight(current.getRight());
                                    return true;
                                }

                                if(parent.getLeft() == current)
                                {
                                    parent.setLeft(current.getRight());
                                    return true;
                                }
                            }

                        //---Delete current node with BOTH children
                            else if(current.getRight() != null && current.getLeft() != null)
                            {
                                //System.out.println(this.getSuccessor(current).getData());
                                Node successor  = this.getSuccessor(current);
                                if ( current.getRight() == successor)   //successor - right child del
                                {
                                    parent.setRight(successor);
                                    successor.setLeft(current.getLeft());
                                }
                                return true;
                            }
                        return false;
                    }
            }
    }
    */

    public boolean delete(int key)
    {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while(current.getData() != key)
        {
            parent = current;
            if(key < current.getData())
            {
                isLeftChild = true;
                current = current.getLeft();
            }
                else
                {
                    isLeftChild = false;
                    current = current.getRight();
                }
            if(current == null)
            {
                return false;
            }
        }

        //Case 0 : The del-node doesn't have children

        if(current.getLeft() == null && current.getRight() == null)
        {
            if(current == null)     //if the node is root
            {                       //clean the tree
                root = null;
            }
                else if(isLeftChild)
                {
                    parent.setLeft(null);
                }
                    else
                    {
                        parent.setRight(null);
                    }
        }

        //Case 1 : The del-node doesn't have right - child

        else if(current.getRight() == null)
        {
            if(current == root)
            {
                root = current.getLeft();
            }
                else if(isLeftChild)
                {
                    parent.setLeft(current.getLeft());
                }
                    else
                    {
                        parent.setRight(current.getLeft());
                    }
        }

        //Case 2 : The del-node doesn't have left child

        else if (current.getLeft() == null)
        {
            if(current == root)
            {
                root = current.getRight();
            }
                else if(isLeftChild)
                {
                    parent.setLeft(current.getRight());
                }
                    else
                    {
                        parent.setRight(current.getRight());
                    }
        }

        //Case 3 : The node has got both children

        else
        {
            Node successor = getSuccessor(current);
            if(current == root)
            {
                root = successor;
            }
                else if (isLeftChild)
                {
                    parent.setLeft(successor);
                }
                    else
                    {
                        parent.setRight(successor);
                    }
        }
        return true;
    }
}
