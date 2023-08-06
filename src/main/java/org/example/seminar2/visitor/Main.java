package org.example.seminar2.visitor;


public class Main {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(20, "1234"),new Book(100, "5678"),
                new Fruit(10, 2, "Банан"), new Fruit(5, 5, "Яблоко")};

        int total = calculatePrice(items);
        System.out.println("Общая стоимость = "+total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(ItemElement item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}
