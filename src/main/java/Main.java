public class Main {
    public static void main(String[] args) {
        final int priceOneShirt = 2999;
        final int selectedShirt = 2;
        final int numberShirtForDiscount = 6;

        final int notEnoughShirtsForDiscount = numberShirtForDiscount - selectedShirt;
        final int selectedShirtsWithoutDiscount = selectedShirt * priceOneShirt;
        final int priceShirtsThatNeedPurchased = notEnoughShirtsForDiscount * priceOneShirt;

        final double percentDiscount = 0.30;

        final double allPriceDiscount = (numberShirtForDiscount * priceOneShirt) - (numberShirtForDiscount * priceOneShirt * percentDiscount);
        final double priceOneShirtDiscount = priceOneShirt - (priceOneShirt * percentDiscount);
        final double moneySaved = (priceOneShirt * numberShirtForDiscount) - allPriceDiscount;
        final double freeShirt = moneySaved / priceOneShirt;

        System.out.println("Рубашек, которые надо добавить к купленным для получения скидки: " + notEnoughShirtsForDiscount);
        System.out.println("Цена выбранных рубашек без скидки = " + selectedShirtsWithoutDiscount);
        System.out.println("Цена рубашек, нужных для скидки = " + priceShirtsThatNeedPurchased);
        System.out.println("Цена рубашек со скидкой = " + allPriceDiscount);
        System.out.println("Цена одной рубашки со скидкой = " + priceOneShirtDiscount);
        System.out.println("Сэкономленные деньги после покупки со скидкой = " + moneySaved);
        System.out.println("Рубашки, полученный нахаляву = " + freeShirt);
    }
}