package ua.dp.levelup.list;

import java.util.Optional;

public abstract class AbstractList {
    protected int size = 0;

    public int size() {
        return size;
    }

    public abstract void addFirst(Node node);
    public abstract void addLast(Node node);
    public abstract void removeFirst();
    public abstract void removeLast();
    public abstract Optional<Node> getFirst();
    public abstract Optional<Node> getLast();
    public abstract Optional<Node> get(int index);
    public abstract boolean isEmpty();
    public abstract boolean isNotEmpty();

}
