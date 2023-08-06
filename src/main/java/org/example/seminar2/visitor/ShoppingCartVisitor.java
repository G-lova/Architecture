package org.example.seminar2.visitor;

// интерфейс посетителя с разной логикой расчета стоимости по каждому товара

public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);
}
