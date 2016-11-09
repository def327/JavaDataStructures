package HashChain;

/**
 * Created by Дмитрий on 27.10.2016.
 */
public class HashTable
{
    private  SortedList [] hashArray;
    private  int arrSize;

    public HashTable(int size)
    {
        this.arrSize = size;
        hashArray = new SortedList[arrSize];
        for(int i = 0; i < arrSize; i++)
        {
            hashArray[i] = new SortedList();
        }
    }

     public void displayHashTable()
     {
         for(int i = 0; i < arrSize; i++)
         {
             System.out.print(i + ". ");
             hashArray[i].display();
         }
     }

     public int hashFunc(int key)
     {
         return key % arrSize;
     }    // Calculate Hash for new data-Link

     public void insert(Link newLink)   //Insert new data-Link in HashTable
     {
         int HashVal = this.hashFunc(newLink.getData());
         hashArray[HashVal].insertList(newLink);
     }

     public void delete(int key)
     {
         int hashVal = this.hashFunc(key);
         boolean isDelete = hashArray[hashVal].delete(key);
         System.out.print("Link with key" + key + " delete " + isDelete);
     }

     public Link find(int key)
     {
         int hashVal = this.hashFunc(key);
         Link tmp = hashArray[hashVal].find(key);
         return tmp;
     }
}
