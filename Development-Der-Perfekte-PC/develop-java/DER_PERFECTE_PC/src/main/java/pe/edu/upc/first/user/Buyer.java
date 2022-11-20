package pe.edu.upc.first.user;
import pe.edu.upc.first.history.WishList;
import pe.edu.upc.first.history.OrderHistory;
import pe.edu.upc.first.payment.Order;
import pe.edu.upc.first.business.Computer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Buyer extends Client{
    private WishList wishList;
    private OrderHistory orderHistory;
    private Order currentOrder;
    private Computer selectedComputer;



    public Buyer(){
        super();
        this.wishList = new WishList();
        this.orderHistory = new OrderHistory();
        this.currentOrder = new Order();
        this.selectedComputer = new Computer();
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
    public void editData(){
        System.out.println("What u want to edit?");

    }
    public void checkOrderStatus(String message){
        currentOrder.saveChange(message);
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


