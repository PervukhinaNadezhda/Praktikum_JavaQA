package service;

import model.Food;

public class ShoppingCart {
    private final Food[] shoppingCart;

    public ShoppingCart(Food[] shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public double getSumWithoutDiscount() {
        double sumWithoutDiscount = 0;
        for (int i = 0; i < shoppingCart.length; i++) {
            sumWithoutDiscount += (shoppingCart[i].getAmount() * shoppingCart[i].getPrice());
        }
        return sumWithoutDiscount;
    }

    public double getSumWithDiscount() {
        double sumWithDiscount = 0;
        for (int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i].getDiscount() == 0) {
                sumWithDiscount += (shoppingCart[i].getAmount() * shoppingCart[i].getPrice());
            } else {
                sumWithDiscount +=
                        (shoppingCart[i].getAmount() * shoppingCart[i].getPrice() * (1-shoppingCart[i].getDiscount()));
            }
        }
        return sumWithDiscount;
    }

    public double getSumVegetarianFood() {
        double sumVegetarianFood = 0;
        for (int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i].isVegetarian()) {
                sumVegetarianFood += (shoppingCart[i].getAmount() * shoppingCart[i].getPrice());
            }
        }
        return sumVegetarianFood;
    }

}
