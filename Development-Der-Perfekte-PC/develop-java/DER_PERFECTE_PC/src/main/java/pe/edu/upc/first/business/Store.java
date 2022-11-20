package pe.edu.upc.first.business;
public class Store {

    private Computer computer;
    private String storeName;
    private String storeDirection;
    private String storeUrl;
    private long storeNumber;



    public Store(Computer computer, String storeName, String storeDirection, String storeUrl, long storeNumber) {
        this.computer = computer;
        this.storeName = storeName;
        this.storeDirection = storeDirection;
        this.storeUrl = storeUrl;
        this.storeNumber = storeNumber;
    }

    public Store(){
        this.computer = new Computer;
        this.storeName = storeName;
        this.storeDirection = storeDirection;
        this.storeUrl = storeUrl;
        this.storeNumber = storeNumber;
    }
    public void setStoreName(){}
    public void setStoreDirection(){}
    public void setStoreUrl(){}
    public void setStoreNumber(){}
    public void addProduct(){}
    public void deleteProduct(){}
    public String getStoreData(){}
}