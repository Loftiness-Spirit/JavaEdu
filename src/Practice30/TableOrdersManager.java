package Practice30;

public class TableOrdersManager implements OrdersManager{
    private Order[] orders;

    public TableOrdersManager(int tablesQuantity){
        orders = new Order[tablesQuantity];
    }
    public void add(Order order, int tableNumber){
        orders[tableNumber] = order;
    }
    public void addItem(MenuItem item, int tableNumber){
        orders[tableNumber].add(item);
    }
    public int freeTableNumber(){
        int count = 0;
        for(int i = 0; i < orders.length; i++){
            if (orders[i] == null){
                count++;
            }
        }
        return count;
    }
    public int[] freeTablesNumbers(){
        int[] tables = new int[freeTableNumber()];
        int j = 0;
        for(int i = 0; i < orders.length; i++){
            if (orders[i] == null){
                tables[j] = i;
                j++;
            }
        }
        return tables;
    }
    public Order getOrder(int tableNumber){
        return orders[tableNumber];
    }
    public void remove(int tableNumber){
        orders[tableNumber] = null;
    }
    public int remove(Order order){
        for (int i = 0; i < orders.length; i++){
            if(order.equals(orders[i])){
                orders[i] = null;
                return i;
            }
        }
        return -1;
    }
    public int removeAll(Order order){
        int count = 0;
        for (int i = 0; i < orders.length; i++){
            if(order.equals(orders[i])){
                orders[i] = null;
                count++;
            }
        }
        return count;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int j = 0;
        for(int i = 0; i < orders.length; i++){
            if(orders[i]!=null){
                j += orders[i].itemQuantity(itemName);
            }
        }
        return j;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int j = 0;
        for(int i = 0; i < orders.length; i++){
            if(orders[i]!=null){
                j += orders[i].itemQuantity(item);
            }
        }
        return j;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders1= new Order[ordersQuantity()];
        int count = 0;
        for (int i = 0; i < orders1.length; i++){
            if(orders[i]!=null){
                orders1[count]=orders[i];
                count++;
            }
        }
        return orders1;
    }

    @Override
    public int ordersCostSummary() {
        int j = 0;
        for(int i = 0; i < orders.length; i++){
            if(orders[i]!=null){
                j += orders[i].costTotal();
            }
        }
        return j;
    }

    @Override
    public int ordersQuantity() {
        int j = 0;
        for(int i = 0; i < orders.length; i++){
            if(orders[i]!=null){
                j++;
            }
        }
        return j;
    }

    @Override
    public String toString() {
        String string = "";
        for(int i = 0; i < orders.length; i++){
            if(orders[i]!=null){
                string+="Столик №"+(i+1)+"\n"+orders[i];
            }
        }
        return string;
    }
}
