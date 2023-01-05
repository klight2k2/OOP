package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();

	public Book(String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
	}

	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println("Author has been added!");
		} else {
			authors.add(getCategory());
			System.out.println("Add successfully!");

		}
	}

	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Author has been removed!");
		} else {
			System.out.println("Can't remove author not exist!");
		}
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book) obj;
			System.out.println("Book"+book.getTitle());
			return this.getTitle().equals(book.getTitle()) && this.getCategory().equals(book.getCategory()) 
				&& this.getCost() == book.getCost();
		}
		return false;
}
}