package Task1;

public interface StackAction<T> extends Iterable<T> {
    void push(T value);
    T pop();
    void print();
    void clear();
    int size();
}
