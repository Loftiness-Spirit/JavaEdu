package Practice31;

public class InternetOrdersManager implements OrdersManager {
    QueueNode head;
    QueueNode tail;
    QueueNode size;
    @Override
    public int itemsQuantity(String itemName) {
        QueueNode currNode = head;
        int j = 0;
        while (currNode != null){
            j+=currNode.value.itemQuantity(itemName);
            currNode=currNode.next;
        }
        return j;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        QueueNode currNode = head;
        int j = 0;
        while (currNode != null){
            j+=currNode.value.itemQuantity(item);
            currNode=currNode.next;
        }
        return j;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[ordersQuantity()];
        int i = 0;
        QueueNode currNode = head;
        while (currNode != null){
            orders[i] = currNode.value;
            currNode=currNode.next;
            i++;
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        QueueNode currNode = head;
        int total = 0;
        while (currNode != null){
            total+= currNode.value.costTotal();
            currNode = currNode.next;
        }
        return total;
    }

    @Override
    public int ordersQuantity() {
        QueueNode currNode = head;
        int j = 0;
        while (currNode != null){
            currNode=currNode.next;
            j++;
        }
        return j;
    }

    class QueueNode{
        private QueueNode next;
        private QueueNode prev;
        private Order value;
        public QueueNode(Order value){
            this.value = value;
            next = null;
            prev = null;
        }

        @Override
        public String toString() {
            return value.toString()+"-----------\n";
        }
    }

    public boolean add(Order order){
        QueueNode new_node = new QueueNode(order);
        if(head == null) {
            head = new_node;
        }
        else {
            tail = head;
            while (tail.next != null){
                tail = tail.next;
            }
            tail.next = new_node;
            new_node.prev = tail;
        }
        return true;
    }
    public Order remove(){
        if(head == null) {
            return null;
        }
        else if (head.next == null){
            head = null;
            return null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        return head.value;

    }
    public Order order(){
        if(head == null) {
            return null;
        }
        else {
            return head.value;
        }
    }

    @Override
    public String toString() {
        QueueNode currNode = head;
        String string = "";
        while (currNode != null){
            string += currNode.toString();
            currNode=currNode.next;
        }
        return string;
    }
}
