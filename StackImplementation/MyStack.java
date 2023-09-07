
public class MyStack<T> {
    private int size;
    private StackItem<T> topItem;

    public MyStack() {
        this.size = 0;
        this.topItem = null;
    }

    public T peek() {
        return this.topItem.data;
    }

    public T pop() {
        StackItem<T> temp = new StackItem<T>();

        return temp.data;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void push(T item) {
        StackItem<T> temp = new StackItem<T>(item);
        temp.prev = this.topItem;
        this.topItem = temp;

    }

    public int search() {
        return 0;
    }

    public int size() {
        return this.size;
    }

}
