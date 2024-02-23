package dailyquiz.Feb14;

public interface Storage<T> {
    void add(T item, int index);

    T get(int index);
}
