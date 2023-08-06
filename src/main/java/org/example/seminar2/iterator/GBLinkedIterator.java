package org.example.seminar2.iterator;

import java.util.Iterator;

public class GBLinkedIterator<T> implements Iterator<T> {
    private GBNode<T> element;


    public GBLinkedIterator(GBNode<T> element) {
        this.element = element;
    }

    // проверка существования следующего элемента списка
    @Override
    public boolean hasNext() {
        return element != null;
    }

    // переход к следующему элементу списка
    @Override
    public T next() {
        T out = element.item;
        element = element.next;
        return out;
    }
}
