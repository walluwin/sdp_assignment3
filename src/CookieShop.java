public abstract class CookieShop {
    protected CookieOperations operations;

    public CookieShop(CookieOperations operations) {
        this.operations = operations;
    }

    public abstract void prepare();
    public abstract void sell();
}