package Practice23.Task1;

public class ArrayQueueADT {
    private ArrayQueueModule queue;

    public ArrayQueueADT(ArrayQueueModule queue) {
        this.queue = queue;
    }

    public Object dequeue() {
        return this.queue.dequeue();
    }

    public Object element() {
        return this.queue.element();
    }

    public void enqueue(Object o) {
        this.queue.enqueue(o);
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public boolean clear() {
        return this.queue.clear();
    }
}
