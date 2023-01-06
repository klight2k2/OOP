package hust.soict.dsai.test.cart;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        try {
			cart.addMedia(dvd1);
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // test print method
        cart.print();
        // to do: test the search methods here
        System.out.println("Search:");
        // search by id
        cart.search(3);
        cart.search(4);
        // search by title
        cart.search("The Lion King");
        cart.search("Hello");
    }
        
}
