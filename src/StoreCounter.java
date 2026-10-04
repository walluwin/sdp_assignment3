public class StoreCounter implements CookieOperations {
    @Override
    public void prepareCookie(String type) {
        System.out.println("Preparing " + type + " cookie at the store.");
    }
    @Override
    public void sellCookie(String type) {
        System.out.println("Selling " + type + " cookie at the store counter.");
    }
}