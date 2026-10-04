public class BakeryKitchen implements CookieOperations {
    @Override
    public void prepareCookie(String type) {
        System.out.println("Preparing " + type + " cookie in the bakery kitchen.");
    }
    @Override
    public void sellCookie(String type) {
        System.out.println("Selling " + type + " cookie from the bakery kitchen.");
    }
}