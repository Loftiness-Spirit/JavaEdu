package Practice29;


public class RestaurantOrder implements Order {
    private List list;

    public RestaurantOrder()
    {
        list = new List();
    }

    @Override
    public boolean add(Item item) {
        list.add(item);
        return true;
    }

    @Override
    public boolean del(String Name) {
        if (list.delete(Name) == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int delAll(String Name) {
        int buf = 0;
        for (int i = 0; i < list.traverseKolVo(); ++i)
        {
            if (del(Name) == true)
            {
                ++buf;
            }
        }
        return buf;
    }

    @Override
    public int searchAll() {
        return list.traverseKolVo();
    }

    @Override
    public List Array() {
        return list;
    }

    @Override
    public int cost() {
        return list.traverseCost();
    }

    @Override
    public int search(String Name) {
        return list.SearchInt(Name);
    }

    @Override
    public String[] arrayString() {
        int bufInt = list.traverseKolVo();
        String[] buf = new String[bufInt];
        for (int i = 0; i < bufInt; ++i)
        {
            buf[i] = list.SearchInt(i);
        }

        boolean[] bufExc = new boolean[bufInt];
        for (int i = 0; i < bufExc.length; ++i)
        {
            bufExc[i] = false;
        }

        for (int i = 0; i < buf.length; ++i)
        {
            for (int j = 0; j < buf.length; ++j)
            {
                if (i == j || bufExc[j] == true || bufExc[i] == true || buf[i].equals(buf[j]) == false) {}
                else if (buf[i].equals(buf[j]) == true)
                {
                    bufExc[j] = true;
                }
            }
        }

        int intBool = 0;
        for (int i = 0; i < bufExc.length; ++i)
        {
            if (bufExc[i] == false)
            {
                ++intBool;
            }
        }

        String[] bufArray = new String[intBool];
        int j = 0;
        for (int i = 0; i < buf.length; ++i)
        {
            if (bufExc[i] == false)
            {
                bufArray[j] = buf[i];
                ++j;
            }
        }

        return bufArray;
    }

    @Override
    public List arrayCost() {
        int bufLen = list.traverseKolVo();
        Item[] bufItem = new Item[bufLen];
        for (int i = 0; i < bufLen; ++i)
        {
            bufItem[i] = list.SearchItem(i);
        }
        bufItem = sort(bufItem);
        List newList = new List();
        for (int i = 0; i < bufLen; ++i)
        {
            newList.add(bufItem[i]);
        }
        return newList;
    }

    private Item[] swap(Item[] array, int ind1, int ind2) {
        Item tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
        return array;
    }

    private Item[] sort(Item[] array)
    {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i].getPrice() < array[i - 1].getPrice()) {
                    array = swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }
        return array;
    }
}
