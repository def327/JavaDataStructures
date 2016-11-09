package MyObj;


import java.nio.file.StandardWatchEventKinds;


public class Main
{
    public static void main(String[] args)
    {
        int [] a = new int [100 000 000];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = a.length - i;
            //System.out.print(a[i] + " ");
        }
        qSort(a);
        System.out.println("len = " + a.length);

        for (int i = 0; i < a.length; i++)
        {
            //System.out.print(a[i] + " ");
        }


    }

public static  void qSort(int [] arr)
{
    QuickSort(arr,0,arr.length-1);
}



public static  void QuickSort(int[] arr,int left, int right)
{
    int i;
    int j;
    int x;
    int y;

    i = left;
    j = right;

    x = arr[left+(right - left)/2];

    do
    {
       while(arr[i] < x && i < right )
       {
           i++;
       }
       while(arr[j] > x && j > left)
       {
           j--;
       }

       if(i<=j)
       {
           y = arr[i];
           arr[i] = arr[j];
           arr[j] = y;
       }
        i++;
        j--;
    }while(i <= j);

    if(left <  j )
    {
        QuickSort(arr,left,j);
    }

    if(i < right)
    {
        QuickSort(arr,i,right);
    }
}


}
