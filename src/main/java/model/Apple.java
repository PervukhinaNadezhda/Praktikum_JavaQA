package model;

import static model.constants.Colour.RED_COLOUR;
import static model.constants.Discount.DISCOUNT_RED_APPLE;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        isVegetarian = true;
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(RED_COLOUR)) {
           return DISCOUNT_RED_APPLE;
        }
        return 0;
    }
}
