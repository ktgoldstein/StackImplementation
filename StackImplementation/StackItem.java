
public class StackItem<T> {
    protected T data;
    protected StackItem<T> prev;

    public StackItem() {
        this.data = null;
        this.prev = null;
    }

    public StackItem(T data) {
        this.data = data;
        this.prev = null;
    }

    public StackItem(T data, StackItem<T> prev) {
        this.data = data;
        this.prev = prev;
    }

}
