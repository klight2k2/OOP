package aims;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private int qtyOrdered = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			System.out.println("The disc has been added");
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			System.out.println("The dvd1 has been added");
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is almost full");
			} else {
				System.out.println("The dvd2 has been added");
				itemsOrdered[qtyOrdered] = dvd2;
				qtyOrdered++;
			}
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			for (DigitalVideoDisc disc : dvdList) {
				itemsOrdered[qtyOrdered] = disc;
				System.out.println("The disc has been added");
				qtyOrdered++;
				if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
					System.out.println("The cart is almost full");
					break;
				}
			}
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered <= 0)
			System.out.println("Haven't no disc");
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; j < qtyOrdered; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				itemsOrdered[qtyOrdered] = null;
				qtyOrdered--;
				break;
			}
		}

	}

	public float totalCost() {
		if (qtyOrdered == 0)
			return 0;
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}

	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(i + 1 + ".DVD-" + itemsOrdered[i].toString());

		}
		System.out.println("Total cost:" + totalCost() + "$");
	}

	public void search(int id) {
		boolean hasResults = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMatch(id)) {
				System.out
						.println(i + 1 + ".DVD-" + itemsOrdered[i].getTitle() + ":" + itemsOrdered[i].getCost() + "$");
				hasResults = true;
			}
		}
		if (!hasResults) {
			System.out.println("No match is found");
		}
	}

	public void search(String title) {
		boolean hasResults = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMatch(title)) {
				System.out.println("DVD-" + itemsOrdered[i].toString());
				hasResults = true;
			}
		}
		if (!hasResults) {
			System.out.println("No match is found");
		}
	}
}
