package Practice23.Task1;

import Practice23.Task2.LinkedQueue;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ArrayQueueModule aqm = ArrayQueueModule.getInstance();
        aqm.enqueue("First Element");
        aqm.enqueue("Second Element");
        aqm.enqueue("Third Element");
        System.out.println(aqm.dequeue());
        ArrayQueueADT adt = new ArrayQueueADT(aqm);
        System.out.println(adt.dequeue());
        ArrayQueue aq = new ArrayQueue();
        System.out.println(aq.dequeue());
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue("First Element");
        linkedQueue.enqueue("Second Element");
        linkedQueue.enqueue("Third Element");
        System.out.println(linkedQueue.dequeue());
        linkedQueue.clear();
        System.out.println(linkedQueue.element());
    }
}
