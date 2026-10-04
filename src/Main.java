public class Main {
    public static void main(String[] args) {

        CookieOperations bakery = new BakeryKitchen();
        CookieOperations store = new StoreCounter();

        CookieShop chocolateCookie = new ChocolateCookie(bakery);
        CookieShop vanillaCookie = new VanillaCookie(store);

        chocolateCookie.prepare();
        chocolateCookie.sell();

        System.out.println();

        vanillaCookie.prepare();
        vanillaCookie.sell();

        System.out.println();
    }
}