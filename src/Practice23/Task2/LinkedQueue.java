package Practice23.Task2;

import Practice23.AbstractQueue;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue{
    private LinkedList<Object> q = new LinkedList();

    public LinkedQueue() {
        this.head = this.tail = 0;
    }

    public Object dequeue() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Linked queue is empty!");
        } else {
            return this.q.remove(this.head);
        }
    }

    public Object element() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Linked queue is empty!");
        } else {
            return this.q.get(this.head);
        }
    }

    public void enqueue(Object o) {
        this.q.add(o);
        ++this.tail;
    }

    public boolean isEmpty() {
        return this.tail == this.head;
    }

    public boolean clear() {
        boolean r = !this.isEmpty();
        this.q.clear();
        this.head = this.tail = 0;
        return r;
    }
}
