package com.example;

public class RemoveItemFromBasket implements ItemOperation {

    private final Item item;

    public RemoveItemFromBasket(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        item.removeFromBasket();
    }
}
