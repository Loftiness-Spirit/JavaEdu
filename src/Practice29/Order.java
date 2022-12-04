package Practice29;


import java.util.HashMap;

public class Order {
    private int size;
    private Item[] items;

    public Order(int size){
        this.size = size;
    }
    public Order(int size, Item[] items) {
        this.size = size;
        this.items = items;
    }

    public boolean add(Item item){
        for (int i = 0; i<this.size; i++){
            if(this.items[i]==null){
                items[i] = item;
                return true;
            }
        }
        return false;
    }
    public boolean remove(String name){
        for (int i = 0; i<items.length; i++){
            if(this.items[i].getName() == name){
                items[i] = null;
                return true;
            }
        }
        return false;
    }
    public int removeAll(String name){
        int c = 0;
        for (int i = 0; i<items.length; i++){
            if(this.items[i].getName() == name){
                items[i] = null;
                c++;
            }
        }
        return c;
    }
    public int itemQuantity(){
        return items.length;
    }
    public int itemQuantity(String name){
        int c = 0;
        for (Item item : items)
            if (item.getName()==name)
                c++;
        return c;
    }

    public Item[] getItems() {
        return items;
    }
    public double priceTotal(){
        double total = 0;
        for(Item item : items){
            total+=item.getPrice();
        }
        return total;
    }
    public String[] itemsNames(){
        HashMap<String, Double> map = new HashMap<>();
        int c = 0;
        for(int i = 0; i<this.size; i++){
                if(!map.containsKey(items[i].getName())) {
                    map.put(items[i].getName(), items[i].getPrice());
                    c++;
                }
        }
        String[] string = new String[c];
        int j = 0;
        for (String key : map.keySet()){
            string[j] = key;
            j++;
        }
        return string;
    }
    public Item[] sortedItemsByPriceDesc(){
        Item[] sorted = items;
        for(int i = 0; i < sorted.length-1; i++){
            Item temp;
            if(sorted[i].getPrice()>sorted[i+1].getPrice()){
                temp = sorted[i];
                sorted[i] = sorted[i+1];
                sorted[i+1] = sorted[i];
            }
        }
        return sorted;
    }
}
