import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, Colour.RED_COLOUR);
        Food appleGreen = new Apple(8, 60, Colour.GREEN_COLOUR);

        Food[] foods = {meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров в корзине без скидки: "
                + shoppingCart.getSumWithoutDiscount());
        System.out.println("Общая сумма товаров в корзине со скидкой: "
                + shoppingCart.getSumWithDiscount());
        System.out.println("Общая сумма всех вегетарианских продуктов в корзине без скидки: "
                + shoppingCart.getSumVegetarianFood());
    }
}
