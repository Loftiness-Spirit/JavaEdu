package Practice23;

import Practice23.Task2.Queue;

public abstract class AbstractQueue implements Queue {
    protected int head;
    protected int tail;
    protected static final int START_CAPACITY = 16;

    public AbstractQueue() {
    }
}
