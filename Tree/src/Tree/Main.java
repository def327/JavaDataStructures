package Tree;

public class Main
{

    public static void main(String[] args)
    {
	    Tree tr = new Tree(1);
        //tr.insert(5);
        //tr.insert(4);
        //tr.insert(3);
        //tr.insert(2);
        tr.insert(20);
        tr.insert(14);
        tr.insert(13);
        tr.insert(15);
        tr.insert(25);
        tr.insert(24);
        tr.insert(27);
        tr.insert(26);
        System.out.println(tr.delete(20));
        Tree.displayTree(tr.getRoot());
    }
}
