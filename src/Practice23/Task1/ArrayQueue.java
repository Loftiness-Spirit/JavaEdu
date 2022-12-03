package Practice23.Task1;

public class ArrayQueue {
    private ArrayQueueModule queue = ArrayQueueModule.getInstance();

    public ArrayQueue() {
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
