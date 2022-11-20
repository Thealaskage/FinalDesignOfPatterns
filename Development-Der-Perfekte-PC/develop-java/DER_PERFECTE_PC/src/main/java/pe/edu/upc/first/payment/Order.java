package pe.edu.upc.first.payment;
import pe.edu.upc.first.business.Computer;
import pe.edu.upc.first.component.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;


public class Order {
    private int trackingNumber;
    private Computer computer;
    private List<Computer> listOrder;

    private List<Computer> shoppingList;
    private long datePurchase;
    private Scanner entrada;


    public Order(){
        this.trackingNumber = trackingNumber;
        this.computer = new Computer;
        this.listOrder = new ArrayList<>();
        this.shoppingList = new ArrayList<>();
        this.datePurchase = datePurchase;
        this.entrada = new Scanner(System.in);
    }

    public Order(int trackingNumber, Computer computer, List<Computer> listOrder, List<Computer> shoppingList, long datePurchase, Scanner entrada) {
        this.trackingNumber = trackingNumber;
        this.computer = computer;
        this.listOrder = listOrder;
        this.shoppingList = shoppingList;
        this.datePurchase = datePurchase;
        this.entrada = entrada;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public long getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(long datePurchase) {
        this.datePurchase = datePurchase;
    }

    public void addComputer(Computer computer){
        listOrder.add(computer);
    }
    public void deleteComputer(){//Delete last
        if(!listOrder.isEmpty()){
            listOrder.remove(listOrder.size() - 1);
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    public void confirmOrder(){
        String message;
        System.out.println("Confirm or Cancel");
        if(message = entrada.nextInt() == "Confirm"){
            shoppingList.add(computer);
        }
    }
    public void cancelOrder(){
        String message;
        System.out.println("Confirm or Cancel");
        if(message = entrada.nextInt() == "Cancel"){
            shoppingList.remove(shoppingList.size() - 1);
        }
    }
    public void saveChange(){
        String message;
        if(message = entrada.nextInt() == "Confirm"){
            System.out.println("Purchase made");
        }else if(message = entrada.nextInt() == "Cancel"){
            System.out.println("Pucharse canceled");
    }
    }
    public void calcTotal(){
        for(Computer c : shoppingList){

        }
    }
}
