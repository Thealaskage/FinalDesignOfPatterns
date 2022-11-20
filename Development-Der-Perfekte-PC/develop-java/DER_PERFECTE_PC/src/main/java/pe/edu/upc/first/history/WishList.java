package pe.edu.upc.first.history;
import pe.edu.upc.first.business.Computer;
import pe.edu.upc.first.business.Product;
import java.util.ArrayList;
import java.util.List;
//import java.util.Collections;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class WishList {
    private Computer computer;
    List<Computer> listComputer;
    private Product product;
    List<Product> listProduct;

    //Builder
    public WishList() {
        this.computer = new Computer;
        this.listComputer = new ArrayList<>();
        this.product = Product;
        this.listProduct = new ArrayList<>();
    }

    public WishList(Computer computer, List<Computer> listComputer, Product product, List<Product> listProduct) {
        this.computer = computer;
        this.listComputer = listComputer;
        this.product = product;
        this.listProduct = listProduct;
    }


    public void viewWishList() {
    }

    public void searchByMonth() {
    }

    public void deleteOrderHistory(){

    }
}