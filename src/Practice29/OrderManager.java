package Practice29;

import java.util.HashMap;

public class OrderManager {
    private HashMap<String, Order> Array;

    public OrderManager() {
        Array = new HashMap<>();
    }

    public void Add(String address, Order order) throws OrderAlreadyAddedException {
        if (Array.containsKey(address) == true) {
            throw new OrderAlreadyAddedException("Подобный адрес/столик уже существует");
        }
        Array.put(address, order);
    }

    public void GerOrder(String address) {
        Array.get(address);
    }

    public void Del(String address) {
        Array.remove(address);
    }

    public void AddPosition(String address, Item item) {
        Order buf = Array.get(address);
        buf.add(item);
        Array.replace(address, buf);
    }

    public Order[] GetOrdersArray() {
        Order[] bufOrder = new Order[Array.size()];
        int i = 0;
        for (String key : Array.keySet()) {
            bufOrder[i] = Array.get(key);
            ++i;
        }
        return bufOrder;
    }

    public int Sum() {
        int sum = 0;
        for (String key : Array.keySet()) {
            sum += Array.get(key).cost();
        }
        return sum;
    }

    public int Bludo(String name) {
        int sum = 0;
        for (String key : Array.keySet()) {
            sum += Array.get(key).search(name);
        }
        return sum;
    }
}