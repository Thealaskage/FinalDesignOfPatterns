package pe.edu.upc.first.adviser;
import pe.edu.upc.first.component.Entity;
import pe.edu.upc.first.business.Computer;
import pe.edu.upc.first.history.WishList;
import pe.edu.upc.first.payment.Order;

public class ComponentFinder {
    private Entity product;
    private Computer computer;
    private WishList wishList;
    private Order order;

    public ComponentFinder(Entity product, Computer computer) {
        this.product = product;
        this.computer = computer;
    }


    public ComponentFinder(){
        this.product = new Entity();
        this.computer = new Computer();
        this.wishList = new WishList();
        this.order = new Order();
    }

    public Entity getProduct() {
        return product;
    }

    public void setProduct(Entity product) {
        this.product = product;
    }

    public void search(){
        computer.chooseProduct();
    }
    public void saveProduct(Entity product){
        wishList.addComponent(product);
    }
    public void saveComputer(Computer computer){
        wishList.addComputer(computer);
    }

    public void addProductToCart(Computer computer){
        order.addComputer(computer);
    }
}