package org.example.seminar2.visitor;

// реализация интерфейса посетителя
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost = 0;
        //apply 5$ discount if book price is greater than 50
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else cost = book.getPrice();
        System.out.println("Книга ISBN:" + book.getIsbnNumber() + " цена =" + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " цена = " + cost);
        return cost;
    }

}
