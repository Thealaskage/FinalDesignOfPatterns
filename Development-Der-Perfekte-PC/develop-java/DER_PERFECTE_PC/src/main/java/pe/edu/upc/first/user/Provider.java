package pe.edu.upc.first.user;
import pe.edu.upc.first.business.Store;
import pe.edu.upc.first.business.Product;

public class Provider {
    private Store assignedStore;
    private Product product;


    public Provider(){
        this.assignedStore = new Store;
        this.product = new Product;
    }

    public Provider(Store assignedStore, Product product) {
        this.assignedStore = assignedStore;
        this.product = product;
    }

    public Store getAssignedStore() {
        return assignedStore;
    }

    public void setAssignedStore(Store assignedStore) {
        this.assignedStore = assignedStore;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void storeOptions(){}
    public void editName(){}
    public void setPrice(){}
    public void editCategory(){}
    public void editDescription(){}
    public void storageOptions(){}

}
