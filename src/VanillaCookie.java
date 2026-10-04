public class VanillaCookie extends CookieShop {
    public VanillaCookie(CookieOperations operations) {
        super(operations);
    }

    @Override
    public void prepare() {
        operations.prepareCookie("Vanilla");
    }
    @Override
    public void sell() {
        operations.sellCookie("Vanilla");
    }
}