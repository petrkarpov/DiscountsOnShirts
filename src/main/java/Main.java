public class Main {
    public static void main(String[] args) {
        final int PRICE_ONE_SHIRT = 2999;
        final int SELECTED_SHIRT = 2;
        final int NUMBER_SHIRT_FOR_DISCOUNT = 6;

        final int NOT_ENOUGH_SHIRTS_FOR_DISCOUNT = NUMBER_SHIRT_FOR_DISCOUNT - SELECTED_SHIRT;
        final int SELECTED_SHIRTS_WITHOUT_DISCOUNT = SELECTED_SHIRT * PRICE_ONE_SHIRT;
        final int PRICE_SHIRTS_THAT_NEED_PURCHASED = NOT_ENOUGH_SHIRTS_FOR_DISCOUNT * PRICE_ONE_SHIRT;

        final double PERCENT_DISCOUNT = 0.30;

        final double ALL_PRICE_DISCOUNT = (NUMBER_SHIRT_FOR_DISCOUNT * PRICE_ONE_SHIRT) - (NUMBER_SHIRT_FOR_DISCOUNT * PRICE_ONE_SHIRT * PERCENT_DISCOUNT);
        final double PRICE_ONE_SHIRT_DISCOUNT = PRICE_ONE_SHIRT - (PRICE_ONE_SHIRT * PERCENT_DISCOUNT);
        final double MONEY_SAVED = (PRICE_ONE_SHIRT * NUMBER_SHIRT_FOR_DISCOUNT) - ALL_PRICE_DISCOUNT;
        final double FREE_SHIRT = MONEY_SAVED / PRICE_ONE_SHIRT;

        System.out.println("Рубашек, которые надо добавить к купленным для получения скидки: " + NOT_ENOUGH_SHIRTS_FOR_DISCOUNT);
        System.out.println("Цена выбранных рубашек без скидки = " + SELECTED_SHIRTS_WITHOUT_DISCOUNT);
        System.out.println("Цена рубашек, нужных для скидки = " + PRICE_SHIRTS_THAT_NEED_PURCHASED);
        System.out.println("Цена рубашек со скидкой = " + ALL_PRICE_DISCOUNT);
        System.out.println("Цена одной рубашки со скидкой = " + PRICE_ONE_SHIRT_DISCOUNT);
        System.out.println("Сэкономленные деньги после покупки со скидкой = " + MONEY_SAVED);
        System.out.println("Рубашки, полученный нахаляву = " + FREE_SHIRT);
    }
}