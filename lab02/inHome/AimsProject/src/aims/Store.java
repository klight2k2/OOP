package aims;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("The dvd has been added!");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (dvd != null) {
            itemsInStore.remove(dvd);
            System.out.println("The dvd has been removed!");
        } else {
            System.out.println("Something error!");
        }
    }

    public void print() {
        if (itemsInStore.isEmpty()) {
            System.out.println("Store is empty!");
        } else {
            for (DigitalVideoDisc dvd : itemsInStore) {
                System.out.println(dvd.toString());
            }
        }
    }
}