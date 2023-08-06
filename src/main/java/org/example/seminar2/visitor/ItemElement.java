package org.example.seminar2.visitor;

// интерфейс для различных типов элементов
public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}
