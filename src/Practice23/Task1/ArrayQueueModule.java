package Practice23.Task1;

import Practice23.AbstractQueue;

public class ArrayQueueModule extends AbstractQueue {
    private Object[] q = new Object[16];
    private static ArrayQueueModule instance;

    private ArrayQueueModule() {
        this.head = this.tail = 0;
    }

    public static ArrayQueueModule getInstance() {
        if (instance == null) {
            instance = new ArrayQueueModule();
        }

        return instance;
    }

    public Object dequeue() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty!");
        } else {
            Object r = this.q[this.head++];
            if (this.head == this.q.length) {
                this.head = 0;
            }

            if (Math.abs(this.head - this.tail) < this.q.length / 2) {
                this.resize(this.q.length / 2);
            }

            return r;
        }
    }

    public boolean isEmpty() {
        return this.head == this.tail;
    }

    public void enqueue(Object element) {
        this.q[this.tail++] = element;
        if (this.tail == this.q.length) {
            this.tail = 0;
        }

        if (this.tail == this.head) {
            this.resize(this.q.length * 2);
        }

    }

    private void resize(int nSize) {
        Object[] nq = new Object[nSize];
        System.arraycopy(this.q, this.head, nq, 0, Math.abs(this.head - this.tail));
        this.tail = Math.abs(this.head - this.tail);
        this.head = 0;
        this.q = nq;
    }

    public Object element() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty!");
        } else {
            return this.q[this.head];
        }
    }

    public boolean clear() {
        boolean r = !this.isEmpty();
        this.head = this.tail = 0;
        this.resize(16);
        return r;
    }
}
