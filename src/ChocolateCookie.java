public class ChocolateCookie extends CookieShop {
    public ChocolateCookie(CookieOperations operations) {
        super(operations);
    }

    @Override
    public void prepare() {
        operations.prepareCookie("Chocolate");
    }
    @Override
    public void sell() {
        operations.sellCookie("Chocolate");
    }
}