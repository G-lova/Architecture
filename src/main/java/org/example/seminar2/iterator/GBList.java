package org.example.seminar2.iterator;

public interface GBList<T> extends Iterable<T> {
    void addFirst(T t);

    void addLast(T t);

    GBNode<T> remove(int index);

    GBNode<T> get(int index);

    int size();
}
