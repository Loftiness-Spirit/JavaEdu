package Practice29;

public class TableOrdersManager {
    private Order[] orders;

    public void add(Order order, int tableNumber){
        orders[tableNumber] = order;
    }
}
