package pe.edu.upc.first.user;
import pe.edu.upc.first.business.Store;
import pe.edu.upc.first.component.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Provider extends Client {
    private Store assignedStore;
    private Entity product;
    private List<Entity> listProductToStore;
    private Scanner entrada;


    public Provider(){
        super();
        this.listProductToStore = new ArrayList<Entity>();
        this.entrada = new Scanner(System.in);
    }

    public Provider(int id, String name, String mail, String password, long phone) {
        super(id, name, mail, password, phone);
        this.assignedStore = new Store();
        this.product = new Entity();
    }

    public Provider(int id, String name, String mail, String password, long phone, Store assignedStore, Entity product, List<Entity> listProductToStore) {
        super(id, name, mail, password, phone);
        this.assignedStore = assignedStore;
        this.product = product;
        this.listProductToStore = listProductToStore;
    }

    public Store getAssignedStore() {
        return assignedStore;
    }

    public void setAssignedStore(Store assignedStore) {
        this.assignedStore = assignedStore;
    }

    public Entity getProduct() {
        return product;
    }

    public void setProduct(Entity product) {
        this.product = product;
    }

    public List<Entity> getListProductToAdd() {
        return listProductToStore;
    }

    public void setListProductToStore(List<Entity> listProductToStore) {
        this.listProductToStore = listProductToStore;
    }
    public void addProduct(Entity productToAdd){
        listProductToStore.add(product);
    }
    public void deleteLastProduct(){
        listProductToStore.remove(listProductToStore.size() - 1);
    }
    public void storeOptions(String name, double price, Entity category, String description, Entity productToAdd){
        System.out.println("\nChoose an option.\n" +
                "1 - Add product \n" +
                "2 - Delete last product \n" +
                "3 - Edit product name \n" +
                "4 - Set price\n" +
                "5 - Edit category\n" +
                "6 - Edit description\n" +
                "7 - Exit");
        int option = 0;
        do{
            option = entrada.nextInt();
            switch (option){
                case 1:
                    addProduct(productToAdd);
                    break;
                case 2:
                    deleteLastProduct();
                    break;
                case 3:
                    editProductName(name);
                    break;
                case 4:
                    setPrice(price);
                    break;
                case 5:
                    editCategory(category);
                    break;
                case 6:
                    editDescription(description);
                    break;
                case 7:
                    break;
            }


        }while(option != 7);
    }


    public void editProductName(String name){
        product.setName(name);
    }
    public void setPrice(double price){
        product.setPrice(price);
    }
    public void editCategory(Entity category){
        product.setCategory(category);
    }
    public void editDescription(String description){
        product.setDescription(description);
    }

    @Override
    public String toString() {
        return "Provider{" + super.toString() +
                "assignedStore=" + assignedStore +
                ", product=" + product +
                '}';
    }
    public void showListToStore(){
        System.out.println(listProductToStore.toString());
    }
}
