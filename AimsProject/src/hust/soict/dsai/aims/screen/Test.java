package hust.soict.dsai.aims.screen;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Test {
	  @FXML
	    private GridPane listItem;
	  
	  @FXML
	  private void initialize() {
		  Label lblTitle = new Label("title");
		  lblTitle.setFont(Font.font(24.0));
		  Label demo = new Label("demo");
		  demo.setFont(Font.font(24.0));
		  lblTitle.setAlignment(Pos.CENTER);
		  Label lblCost = new Label("cost");
		  lblCost.setAlignment(Pos.CENTER);
		  VBox connVBox = new VBox(10);
		  connVBox.setSpacing( 4.0d );
		  connVBox.setAlignment(Pos.CENTER);
		  HBox hbox = new HBox(10);
		  hbox.setSpacing( 4.0d );
		  hbox.setAlignment(Pos.CENTER);
		  Button playBtn= new Button("Play");
		  Button addToCartBtn= new Button("Add to cart");
		  hbox.getChildren().addAll(playBtn,addToCartBtn);
		  BackgroundFill background_fill = new BackgroundFill(Color.PINK, 
                  CornerRadii.EMPTY, Insets.EMPTY);

// create Background
		  	Background background = new Background(background_fill);

// set background
		connVBox.setBackground(background);
		connVBox.getChildren().addAll(lblTitle,lblCost);
		connVBox.getChildren().add(hbox);
		  listItem.add(connVBox,0,0);
	  }
}