package Practice31;

public class TableOrder implements Order {
    private int size;
    private MenuItem[] items;

    public TableOrder(){
        size = 16;
        items = new MenuItem[size];
    }
    @Override
    public boolean add(MenuItem item) {
        for(int i = 0; i < size; i++){
            if(items[i]==null){
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] itemsNames() {
        String[] string = new String[itemsQuantity()];
        int count = 0;
        for(int i = 0; i < size; i++){
            if(items[i]!=null){
                string[count]=items[i].getName()+"\n";
                count++;
            }
        }
        return string;
    }

    @Override
    public int itemsQuantity() {
        int count = 0;
        for(int i = 0; i < size; i++){
            if(items[i]!=null){
                count++;
            }
        }
        return count;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        for(int i = 0; i < size; i++){
            if(items[i]!=null&&items[i].getName().equals(itemName)){
                count++;
            }
        }
        return count;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        int count = 0;
        for(int i = 0; i < size; i++){
            if(items[i]!=null&&items[i].equals(itemName)){
                count++;
            }
        }
        return count;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] menuItems = new MenuItem[itemsQuantity()];
        int count = 0;
        for(int i = 0; i < size; i++){
            if(items[i]!=null){
                menuItems[count]=items[i];
                count++;
            }
        }
        return menuItems;
    }

    @Override
    public boolean remove(String itemName) {
        for(int i = 0; i < size; i++){
            if(items[i].getName().equals(itemName)){
                items[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        for(int i = 0; i < size; i++){
            if(items[i].equals(item)){
                items[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for(int i = 0; i < size; i++){
            if(items[i].getName().equals(itemName)){
                items[i] = null;
                count++;
            }
        }
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        int count = 0;
        for(int i = 0; i < size; i++){
            if(items[i].equals(item)){
                items[i] = null;
                count++;
            }
        }
        return count;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] menuItems = getItems();
        for(int i = 0; i < menuItems.length-1; i++){
            MenuItem temp;
            if(menuItems[i].getCost()>menuItems[i+1].getCost()){
                temp = menuItems[i];
                menuItems[i] = menuItems[i+1];
                menuItems[i+1] = menuItems[i];
            }
        }
        return menuItems;
    }

    @Override
    public int costTotal() {
        MenuItem[] menuItems = getItems();
        int result = 0;
        for(int i = 0; i < menuItems.length;i++){
            result+=menuItems[i].getCost();
        }
        return result;
    }

    @Override
    public String toString() {
        MenuItem[] menuItems = getItems();
        String string = "";
        for(int i = 0; i < menuItems.length;i++){
            string+=menuItems[i].toString()+"\n##########\n";
        }
        return string;
    }
}
