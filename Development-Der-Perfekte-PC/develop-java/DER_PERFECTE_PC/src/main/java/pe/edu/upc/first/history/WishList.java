package pe.edu.upc.first.history;
import pe.edu.upc.first.component.Entity;
import pe.edu.upc.first.business.Computer;

import java.util.ArrayList;
import java.util.List;
//import java.util.Collections;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class WishList {
    private Computer computer;
    List<Computer> listComputer;
    private Entity product;
    List<Entity> listProduct;

    //Builder
    public WishList() {
        this.computer = new Computer();
        this.listComputer = new ArrayList<>();
        this.product = new Entity();
        this.listProduct = new ArrayList<>();
    }

    public WishList(Computer computer, List<Computer> listComputer, Entity product, List<Entity> listProduct) {
        this.computer = computer;
        this.listComputer = listComputer;
        this.product = product;
        this.listProduct = listProduct;
    }


    public void viewWishList() {
        System.out.println("WISHLIST\n");
        System.out.println("Computers\n");
        System.out.println(listComputer.toString());
        System.out.println("Components\n");
        System.out.println(listProduct.toString());
    }

    public List<Computer> searchByIdComputer(int id) {
        List<Computer> result = new ArrayList<Computer>();
        id = product.getId();
        for(Computer computer : listComputer){
            if(listComputer.contains(id)){//Si contiene
                result.add(computer);//Que lo copie a la nueva lista
            }else{
                System.out.println("Date not found");
            }
        }
        return result;//Y la muestre
    }
    public List<Entity> searchByIdComponent(int id) {
        List<Entity> result = new ArrayList<Entity>();
        id = product.getId();
        for(Entity component : listProduct){
            if(listComputer.contains(id)){//Si contiene
                result.add(component);//Que lo copie a la nueva lista
            }else{
                System.out.println("Date not found");
            }
        }
        return result;//Y la muestre
    }
    public void addComputer(Computer computer){
        listComputer.add(computer);
    }
    public void addComponent(Entity product){
        listProduct.add(product);
    }
    public void deleteComputer(Computer computer){
        listComputer.remove(computer);
    }
    public void deleteComponent(Entity product){
        listProduct.remove(product);
    }
    public void deleteLastComputer(){
        listComputer.remove(listComputer.size() - 1);
    }
    public void deleteLastComponent(){
        listProduct.remove(listProduct.size() - 1);
    }

    @Override
    public String toString() {
        return "WishList{" +
                ", listComputer=" + listComputer +
                ", listProduct=" + listProduct +
                '}';
    }
}