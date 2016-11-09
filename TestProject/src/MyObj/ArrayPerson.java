package MyObj;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public class ArrayPerson
{
    private
        Person [] arr;
        int nElems;
    public
        ArrayPerson(int size)
        {
            arr = new Person[size];
            nElems = 0;
        }

        void insert(String name, String surname, int age)
        {
            if( nElems <= arr.length)
            {
                arr[nElems] = new Person(name, surname, age);
                nElems++;
            }
                else
                {
                    System.out.println("overload array");
                    return;
                }

        }

        void display()
        {
            for( int i = 0; i < nElems; i++)
            {
                arr[i].display();
            }
        }

        void selectSort()
        {
            int i;
            int j;
            int min;
            for( j = 0; j < nElems -1 ; j++)
            {
                min = j;
                for(i=j+1; i < nElems; i++)
                {
                    if((arr[i].getName().compareTo(arr[min].getName()) < 0))
                    {
                        min = i;
                    }
                }
                Person tmp = arr[j];
                arr[j] = arr[min];
                arr[min] = tmp;
            }
        }

}
