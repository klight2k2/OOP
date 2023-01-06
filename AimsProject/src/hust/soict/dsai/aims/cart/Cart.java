package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.List;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ObservableList<Media> itemsOrdered =  FXCollections.observableArrayList();

	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	
	public float totalCost() {
		int size = itemsOrdered.size();
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += itemsOrdered.get(i).getCost();
		}
		return sum;
	}

	public void addMedia(Object media) throws  LimitExceededException {
		if(itemsOrdered.size()< MAX_NUMBERS_ORDERED) {
			
		if (media instanceof Media) {
			Media newMedia = (Media) media;
			itemsOrdered.add(newMedia);
			System.out.println("Add media successfully");
		} else {
			System.out.println("Can't add media");
		}
		}else {
			throw new LimitExceededException("Error: number of media  has reached its limit");
		}
	}

	public void removeMedia(Object media) {
		if (media instanceof Media) {
			Media newMedia = (Media) media;
			itemsOrdered.remove(newMedia);
			System.out.println("Remove media successfully");
		} else {
			System.out.println("Can't remove media");
		}
	}

	public void print() {
		int size = itemsOrdered.size();
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < size; i++) {
			System.out.println(itemsOrdered.get(i).toString());

		}
		System.out.println("Total cost:" + totalCost() + "$");
	}

	public void search(int id) {
		boolean hasResults = false;
		int size = itemsOrdered.size();
		for (int i = 0; i < size; i++) {
			if (itemsOrdered.get(i).getId() == id) {
				System.out.println(itemsOrdered.get(i));
				hasResults = true;
			}
		}
		if (!hasResults) {
			System.out.println("No match is found");
		}
	}

	public void search(String title) {
		boolean hasResults = false;
		int size = itemsOrdered.size();

		for (int i = 0; i < size; i++) {
			if (itemsOrdered.get(i).getTitle().equals(title)) {
				System.out.println(itemsOrdered.get(i).toString());
				hasResults = true;
			}
		}
		if (!hasResults) {
			System.out.println("No match is found");
		}
	}
}
