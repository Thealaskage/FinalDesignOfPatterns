package pe.edu.upc.first.business;
import pe.edu.upc.first.user.Provider;
public class Store {

    private Computer computer;
    private String storeName;
    private String storeDirection;
    private String storeUrl;
    private long storeNumber;
    private Provider provider;



    public Store(Computer computer, String storeName, String storeDirection, String storeUrl, long storeNumber) {
        this.computer = computer;
        this.storeName = storeName;
        this.storeDirection = storeDirection;
        this.storeUrl = storeUrl;
        this.storeNumber = storeNumber;
    }

    public Store(){
        this.computer = new Computer();
        this.storeName = storeName;
        this.storeDirection = storeDirection;
        this.storeUrl = storeUrl;
        this.storeNumber = storeNumber;
        this.provider = new Provider();
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDirection() {
        return storeDirection;
    }

    public void setStoreDirection(String storeDirection) {
        this.storeDirection = storeDirection;
    }

    public String getStoreUrl() {
        return storeUrl;
    }

    public void setStoreUrl(String storeUrl) {
        this.storeUrl = storeUrl;
    }

    public long getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(long storeNumber) {
        this.storeNumber = storeNumber;
    }

    public void addProduct(){
        provider.addProduct(provider.getProduct());
    }
    public void deleteProduct(){
        provider.deleteLastProduct();
    }
    public void getStoreData(){
        provider.showListToStore();
    }
}