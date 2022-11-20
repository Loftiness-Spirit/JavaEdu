package Practice20.Task4;

public class MinMax<T extends Number>{
    private T[] arr;

    public MinMax(T[] arr)
    {
        this.arr=arr;
    }

    public T Min()
    {
        T min = arr[0];
        for (T i : arr)
            if (i.doubleValue() < min.doubleValue())
                min = i;
        return min;
    }

    public T Max()
    {
        T max = arr[0];
        for (T i : arr)
            if (i.doubleValue() > max.doubleValue())
                max = i;
        return max;
    }
}
