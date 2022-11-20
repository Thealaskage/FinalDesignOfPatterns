package pe.edu.upc.first.business;
import pe.edu.upc.first.component.Entity;

public class Product {

    private Entity typeProduct;

    public Product(Entity typeProduct) {
        this.typeProduct = typeProduct;
    }
    public Product(){
        this.typeProduct = new Entity;
    }

    public Entity getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(Entity typeProduct) {
        this.typeProduct = typeProduct;
    }

    public void chooseProduct(int typeProduct){

    }

}