package hust.soict.dsai.aims.screen;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputMethodEvent;
import javafx.stage.Stage;

import java.io.IOException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class CartScreenController {
	
	private Cart cart;
	private ControllerScreen controllerScreen;
	
	@FXML
    private TableView<Media> tblMedia;
	
    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private Label totalCost;
    
    @FXML
    private TextField tfFilter;
    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;
    
    @FXML
    private Label playingMedia;
    
    @FXML
    private Button btnStop;
    
    @FXML
    private Button btnOrder;
    
    @FXML
    private RadioButton radioBtnFilterId;
    
    public CartScreenController(Cart cart , ControllerScreen controllerScreen) {
		super();
		this.cart = cart;
		System.out.println("test now");
		this.controllerScreen = controllerScreen;
	}
    

    void updateButtonBar(Media media) {
    	btnRemove.setVisible(true);
    	if (media instanceof Playable) {
    		btnPlay.setVisible(true);
    	}else {
    		btnPlay.setVisible(false);
    	}
    }
    void showFilterMedia(String searchString) {
    	if(radioBtnFilterId.isSelected()) {
    		tblMedia.setItems(new FilteredList<Media>(this.cart.getItemsOrdered(),item-> item.getId()==Integer.parseInt(searchString)));
    	}else
    	tblMedia.setItems(new FilteredList<Media>(this.cart.getItemsOrdered(),item-> item.getTitle().contains(searchString)));
    }
    
    @FXML
    private void initialize() {
    	colMediaTitle.setCellValueFactory(
    			new PropertyValueFactory<Media, String>("title"));
    
    	colMediaCategory.setCellValueFactory(
    			new PropertyValueFactory<Media, String>("category"));
    	colMediaCost.setCellValueFactory(
    			new PropertyValueFactory<Media, Float>("cost"));
    	tblMedia.setItems(this.cart.getItemsOrdered());
    	totalCost.setText(this.cart.totalCost()+"$");
    	btnPlay.setVisible(false);
    	btnRemove.setVisible(false);
    	playingMedia.setVisible(false);
    	btnStop.setVisible(false);
    	System.out.println(cart.getItemsOrdered().toString());
    	tfFilter.textProperty().addListener(new ChangeListener<String>() {
			
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue,
					String newValue) {
				
				showFilterMedia(newValue);
			}
		});
    	tblMedia.getSelectionModel().selectedItemProperty().addListener(
    			new ChangeListener<Media>() {
    				
    				@Override
    				public void changed(ObservableValue<? extends Media> observable, Media oldValue,
    									Media newValue) {
    					if(newValue != null) {
    						updateButtonBar(newValue);
    					}
    					totalCost.setText(cart.totalCost()+"$");
    				}
    			});
    }
    
    @FXML
    void btnRemovePressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	cart.removeMedia(media);
    	totalCost.setText(cart.totalCost()+"$");	
    	System.out.println(media instanceof Book);
    }
    
    @FXML
    void btnPlayPressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	playingMedia.setText("Playing "+media.getTitle()+"....");
    	playingMedia.setVisible(true);
    	btnStop.setVisible(true);
    }
    
    @FXML
    void btnStopPressed(ActionEvent event) {
    	playingMedia.setVisible(false);
    	btnStop.setVisible(false);
    }
    
    @FXML
    void btnOrderPressed(ActionEvent event) throws IOException {
    	btnOrder.setText("Success!!!");
    	btnOrder.setDisable(true);
    	
    	cart.getItemsOrdered().removeAll(cart.getItemsOrdered());
    	totalCost.setText("0.0$");	
    }
    
    @FXML
    void changeToStoreScreen(ActionEvent event) {
    	this.controllerScreen.showStoreScreen();
    }
    @FXML
    void changeToAddBookScreen(ActionEvent event) {
    	this.controllerScreen.showAddBookScreen();
    }

    @FXML
    void changeToAddCDScreen(ActionEvent event) {
    	this.controllerScreen.showAddCDCreen();
    }

    @FXML
    void changeToAddDVDScreen(ActionEvent event) {
    	this.controllerScreen.showAddDVDScreen();
    }

    @FXML
    void changeToCartScreen(ActionEvent event) {
    	this.controllerScreen.showCartScreen();
    }

    @FXML
    void updateFilter(InputMethodEvent event) {
    	System.out.println("sadddd");
    	System.out.println(event.toString());
    }
}