package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Object media) {
        if (media instanceof Media) {
            Media newMedia = (Media) media;
            itemsInStore.add(newMedia);
            System.out.println("Add media successfully");
        } else {
            System.out.println("Can't add media");
        }
    }

    public void removeMedia(Object media) {
        if (media instanceof Media) {
            Media newMedia = (Media) media;
            itemsInStore.remove(newMedia);
            System.out.println("Remove media successfully");
        } else {
            System.out.println("Can't remove media");
        }
    }

    public void print() {
        if (itemsInStore.isEmpty()) {
            System.out.println("Store is empty!");
        } else {
            for (Media dvd : itemsInStore) {
                System.out.println(dvd.toString());
            }
        }
    }
}