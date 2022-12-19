package Practice30;


public class InternetOrder implements Order{

    private int size;
    private ListNode head;
    private ListNode tail;

    private Address address;

    public InternetOrder(Address address){
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean add(MenuItem item) {
        ListNode new_node = new ListNode(item);
        if(head == null) {
            head = new_node;
        }
        else {
            tail = head;
            while (tail.next != null){
                tail = tail.next;
            }
            tail.next = new_node;
        }
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[itemsQuantity()];
        int i = 0;
        ListNode currNode = head;
        while (currNode != null){
            names[i] = currNode.value.getName();
            currNode=currNode.next;
            i++;
        }
        return names;
    }

    @Override
    public int itemsQuantity() {
        ListNode currNode = head;
        int j = 0;
        while (currNode != null){
            currNode=currNode.next;
            j++;
        }
        return j;
    }

    @Override
    public int itemQuantity(String itemName) {
        ListNode currNode = head;
        int j = 0;
        while (currNode != null){
            if(itemName.equals(currNode.value.getName())){
                currNode=currNode.next;
                j++;
            }
        }
        return j;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        ListNode currNode = head;
        int j = 0;
        while (currNode != null){
            if(itemName.equals(currNode.value)){
                currNode=currNode.next;
                j++;
            }
        }
        return j;
    }

    @Override
    public String toString() {
        ListNode currNode = head;
        String string = "";
        while (currNode != null){
            string += currNode.toString();
            currNode=currNode.next;
        }
        return string;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[itemsQuantity()];
        int i = 0;
        ListNode currNode = head;
        while (currNode != null){
            items[i] = currNode.value;
            currNode=currNode.next;
            i++;
        }
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode currNode = head, prev = null;

        if (currNode != null && currNode.value.getName().equals(itemName)){
            head = currNode.next;
            return true;
        }
        while (currNode != null && !currNode.value.getName().equals(itemName)){
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null){
            prev.next = currNode.next;
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        ListNode currNode = head, prev = null;

        if (currNode != null && currNode.value.equals(item)){
            head = currNode.next;
            return true;
        }
        while (currNode != null && !currNode.value.equals(item)){
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null){
            prev.next = currNode.next;
            return true;
        }
        else
            return false;
    }

    @Override
    public int removeAll(String itemName) {
        ListNode currNode = head, prev = null;
        int j = 0;
        if (currNode != null && currNode.value.getName().equals(itemName)){
            head = currNode.next;
            j++;
        }
        while (currNode != null){
            prev = currNode;
            currNode = currNode.next;
            if(currNode.value.getName().equals(itemName)){
                prev.next = currNode.next;
                j++;
            }
        }
        return j;
    }

    @Override
    public int removeAll(MenuItem item) {
        ListNode currNode = head, prev = null;
        int j = 0;
        if (currNode != null && currNode.value.equals(item)){
            head = currNode.next;
            j++;
        }
        while (currNode != null){
            prev = currNode;
            currNode = currNode.next;
            if(currNode.value.equals(item)){
                prev.next = currNode.next;
                j++;
            }
        }
        return j;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = getItems();
        for(int i = 0; i < items.length-1; i++){
            MenuItem temp;
            if(items[i].getCost()>items[i+1].getCost()){
                temp = items[i];
                items[i] = items[i+1];
                items[i+1] = items[i];
            }
        }
        return items;
    }

    @Override
    public int costTotal() {
        ListNode currNode = head;
        int total = 0;
        while (currNode != null){
            total+=currNode.value.getCost();
            currNode=currNode.next;
        }
        return total;
    }


    class ListNode{
        private ListNode next;
        private MenuItem value;

        ListNode (MenuItem value){
            this.value = value  ;
            next = null;
        }

        @Override
        public String toString() {
            return value.toString()+"\n##########\n";
        }
    }

}
