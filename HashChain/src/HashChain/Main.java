package HashChain;

public class Main {

    public static void main(String[] args)
    {
        HashTable table = new HashTable(31);
        table.insert(new Link(44));
        table.insert(new Link(44));
        table.insert(new Link(12));
        table.displayHashTable();
    }
}
