package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class AppLauncher extends Application {
	@Override
	public void start(Stage stage) throws Exception{
		Cart cart =new Cart();
		Book dvd1 = new Book( "Animation","The Lion King", 19.95f);
		cart.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
		"Animation", 18.99f);
		cart.addMedia(dvd3);
//		 BorderPane root = new BorderPane();
//		 root.heightProperty(724);
//		 root.wi;

		FXMLLoader loader = new FXMLLoader(getClass()
				.getResource("/hust/soict/dsai/aims/screen/cart.fxml"));
		CartScreenController controller = new CartScreenController(cart);
		loader.setController(controller);
		Parent root = loader.load();
		Scene scene = new Scene(root,1024,768);
		stage.setTitle("Painter");
		stage.setScene(scene);
		stage.show();	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
