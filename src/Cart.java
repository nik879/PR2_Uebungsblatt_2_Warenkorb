import java.util.Objects;

public class Cart implements Comparable<Cart> {
    private String username;
    private int numArticles;
    private int totalitems;
    private double totalamount;

    public Cart(String username, int numArticles, int totalitems, double totalamount) {
        this.username = username;
        this.numArticles = numArticles;
        this.totalitems = totalitems;
        this.totalamount = totalamount;
    }

    public String getUsername() {
        return username;
    }

    public int getNumArticles() {
        return numArticles;
    }

    public int getTotalitems() {
        return totalitems;
    }

    public double getTotalamount() {
        return totalamount;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNumArticles(int numArticles) {
        this.numArticles = numArticles;
    }

    public void setTotalitems(int totalitems) {
        this.totalitems = totalitems;
    }

    public void setTotalamount(double totalamount) {
        this.totalamount = totalamount;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "username='" + username + '\'' +
                ", numArticles=" + numArticles +
                ", totalitems=" + totalitems +
                ", totalamount=" + totalamount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return numArticles == cart.numArticles && totalitems == cart.totalitems && Double.compare(cart.totalamount, totalamount) == 0 && Objects.equals(username, cart.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, numArticles, totalitems, totalamount);
    }

    @Override
    public int compareTo(Cart o) {
        return Double.compare(o.totalamount, this.totalamount);
    }
}
