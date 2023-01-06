package hust.soict.dsai.aims.screen;

import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CartScreen extends JFrame{
	
	private Cart cart;
	private ControllerScreen controllerScreen;
	public CartScreen(Cart cart,ControllerScreen c) {
		super();
		
		this.cart = cart;
		this.controllerScreen=c;
		Book dvd1 = new Book( "The Lion King","Animation", 19.95f);
		cart.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
		"Animation", 18.99f);
		cart.addMedia(dvd3);
		
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		
		this.setTitle("Cart");
		this.setVisible(true);
		this.setPreferredSize(new Dimension(1024, 768));
		pack();
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass()
							.getResource("/hust/soict/dsai/aims/screen/cart.fxml"));
					CartScreenController controller = new CartScreenController(cart,c);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root,1024,768));
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		});
	}
	
	public static void main(String[] args) {
		Cart cart = new Cart();
	}

}