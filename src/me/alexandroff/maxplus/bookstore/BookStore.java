package me.alexandroff.maxplus.bookstore;

public class BookStore {

    private String storeName;
    private String storeAddress;
    private ArrayBook storage;

    public BookStore(String storeName, String storeAddress) {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
    }

    public String toString() {
        return "Bookstore: " + this.storeName
                + ", Address: " + this.storeAddress;
    }

    public BookStore(ArrayBook storage) {
        this.storage = storage;
    }




    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public ArrayBook getStorage() {
        return storage;
    }

    public void setStorage(ArrayBook storage) {
        this.storage = storage;
    }
}
