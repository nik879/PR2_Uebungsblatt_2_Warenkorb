import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Cart> cartlist = new ArrayList<>();
        cartlist.add(new Cart("Banane", 3, 50, 100));
        cartlist.add(new Cart("Haus", 2, 10, 30));
        cartlist.add(new Cart("test", 5, 60, 50));
        System.out.println(cartlist);
        Collections.sort(cartlist);
        System.out.println(cartlist);
    }

}
