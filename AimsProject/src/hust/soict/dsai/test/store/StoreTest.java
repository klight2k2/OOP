package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Jujutsu no kaisen", "light novel", "Kyou jouu", 107, 27.95f);
        store.addDVD(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Jitsu ryouku no kyoushitsu", "manga", "Klight", 1200, 18.99f);
        store.addDVD(dvd3);
        // print store
        store.print();

        store.removeDVD(dvd1);
        store.print();
    }
}
