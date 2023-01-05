package hust.soict.dsai.aims.screen;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApp extends Application {

    private Parent createContent() {
        return new StackPane(new Text("Hello World"));
    }

    @Override
    public void start(Stage stage) throws Exception {
//        stage.setScene(CartScreen);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}