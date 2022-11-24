package pe.edu.upc.first.user;
import pe.edu.upc.first.history.WishList;
import pe.edu.upc.first.history.OrderHistory;
import pe.edu.upc.first.payment.Order;
import pe.edu.upc.first.business.Computer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Buyer extends Client{
    private WishList wishList;
    private OrderHistory orderHistory;
    private Order currentOrder;
    private Computer selectedComputer;
    private Scanner entrada;



    public Buyer(){
        super();
        this.wishList = new WishList();
        this.orderHistory = new OrderHistory();
        this.currentOrder = new Order();
        this.selectedComputer = new Computer();
        this.entrada = new Scanner(System.in);
    }

    public Buyer(int id, String name, String mail, String password, long phone) {
        super(id, name, mail, password, phone);
    }

    public Buyer(int id, String name, String mail, String password, long phone, WishList wishList, OrderHistory orderHistory, Order currentOrder, Computer selectedComputer) {
        super(id, name, mail, password, phone);
        this.wishList = wishList;
        this.orderHistory = orderHistory;
        this.currentOrder = currentOrder;
        this.selectedComputer = selectedComputer;
    }

    public void addOrder(){
        currentOrder.addComputer(currentOrder.getComputer());
    }
    public void editData() throws IOException {
        System.out.println("What u want to edit?");
        System.out.println("\nChoose an option.\n" +
                "1 - Edit Name \n" +
                "2 - Edit Mail \n" +
                "3 - Edit Password\n" +
                "4 - Edit Phone\n" +
                "5 - Exit");

        int option = 0;
        do{
            option = entrada.nextInt();
            switch (option){
                case 1:
                    addName();
                    break;
                case 2:
                    addMail();
                    break;
                case 3:
                    addPassword();
                    break;
                case 4:
                    addPhone();
                    break;
                case 5:
                    break;
            }


        }while(option != 5);
    }

    public void checkOrderStatus(){
        currentOrder.saveChange();
    }
    public void viewWishList(){
        wishList.viewWishList();
    }
    public void viewOrderHistory(){
        orderHistory.showOrderHistory();
    }

    @Override
    public String toString() {
        return "Buyer{" + super.toString() +
                "wishList=" + wishList +
                ", orderHistory=" + orderHistory +
                ", currentOrder=" + currentOrder +
                ", selectedComputer=" + selectedComputer +
                '}';
    }
}


