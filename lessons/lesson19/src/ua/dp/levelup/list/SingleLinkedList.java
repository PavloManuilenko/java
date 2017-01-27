package ua.dp.levelup.list;

import java.util.Optional;

public class SingleLinkedList extends AbstractList{

    private Node root = null;

    public void addNode(Node n) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addFirst(Node node) {
        if (null == root) {
            root = node;
        }
        else {
            node.setNext(root);
            root = node;
        }
        size++;
    }

    @Override
    public void addLast(Node node) {
        if (null == root) {
            root = node;
        }
        else {
            Node tmp = root;
            while (tmp.next() !=null ) {
                tmp = tmp.next();
            }
            tmp.setNext(node);
        }
        size++;
    }

    @Override
    public void removeFirst() {
        Node first = root;
        if (null == first) return;
        if (first.next() != null) {
            root = first.next();
            first.setNext(null);
            size--;
        }
        else {
            root = null;
        }
        size--;
    }

    @Override
    public void removeLast() {
        Node first = root;
        if (null == first) return;
        if (null == first.next()) {
            root = null;
        }
        else {
            Node tmp = first.next();
            Node prev = tmp;
            while (null != tmp.next()) {
                prev = tmp;
                tmp = tmp.next();
            }
            prev.setNext(null);
        }
        size--;
    }

    @Override
    public Optional<Node> getFirst() {
        return Optional.ofNullable(root);
    }

    @Override
    public Optional<Node> getLast() {
        if (null == root) {
            return Optional.empty();
        }
        else {
            Node tmp = root;
            while (tmp.next() !=null ) {
                tmp = tmp.next();
            }
            return  Optional.of(tmp);
        }
    }

    @Override
    public Optional<Node> get(int index) {
        if (index < 0 || index >= size) return Optional.empty();
        Node res = root;
        for (int i = 0; i < size; i++){
            if (i == index) break;
            res = res.next();
        }
        return Optional.of(res);
    }

    @Override
    public boolean isEmpty() {
        return null == root;
    }

    @Override
    public boolean isNotEmpty() {
        return !isEmpty();
    }
}
