package pe.edu.upc.first.adviser;
import pe.edu.upc.first.business.Product;

public class ComponentFinder {
    private Product product;

    public ComponentFinder(Product product) {
        this.product = product;
    }


    public ComponentFinder(){
        this.product = new Product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void search(){

    }
    public void saveProduct(){}
    public void addProductSelection(){}
}