package hust.soict.dsai.aims.screen;

import java.awt.Dimension;

import javax.swing.JFrame;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;

public class ControllerScreen {
	public static JFrame storeSreen;
	public static JFrame cartSceen;
	private Cart cart;
	private Store store;
	public ControllerScreen() {
		cart= new Cart();
		store=new Store();
		new AddItemToStoreScreen(store, cart, this);
//		storeSreen= new StoreScreen(store,cart,this);
//		cartSceen= new CartScreen(cart,this);
//		showStoreScreen();
	}
	public static void main(String args[]) {
		new ControllerScreen();
	}
	public void showStoreScreen() {
		System.out.println("helloooo");
		storeSreen.setVisible(true);
		cartSceen.setVisible(false);
	}
	public void showCartScreen() {
		storeSreen.setVisible(false);
		cartSceen.setVisible(true);
	}
}
