package Practice21.Task2.Task3.Task4;

public class Storage <T>{
    private T[] arr;

    public Storage(T[] arr){
        this.arr = arr;
    }
    public int getLength()
    {
        return arr.length;
    }
    public T getElement(int n)
    {
        if (n < getLength())
        {
            return arr[n];
        }
        else
        {
            return null;
        }
    }
    public T[] getArr()
    {
        if (getLength() < 5)
        {
            for (T i : arr)
            {
                System.out.println(i);
            }
        }
        else
        {
            for (int i = 0; i < 5; i++)
            {
                System.out.println(arr[i]);
            }
        }
        return arr;
    }
}
