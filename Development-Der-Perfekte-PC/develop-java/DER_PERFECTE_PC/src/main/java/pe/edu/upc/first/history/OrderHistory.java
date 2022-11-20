package pe.edu.upc.first.history;
import pe.edu.upc.first.payment.Order;
import pe.edu.upc.first.business.Computer;
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class OrderHistory {
    private Order order;
    private List<Computer> shoppingList;
    private List<Order> orderHistory;
    private int number;

    //Builder


    public OrderHistory() {
        this.order = order;
        this.shoppingList = new Arraylist<>();
        this.orderHistory = new Arraylist<>(shoppingList);
        this.number = number;
    }

    public OrderHistory(Order order, List<Computer> shoppingList, List<Computer> orderHistory, int number) {
        this.order = order;
        this.shoppingList = shoppingList;
        this.orderHistory = orderHistory;
        this.number = number;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<Computer> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Computer> orderHistory) {
        this.orderHistory = orderHistory;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //Methods
    public void viewPurchaseHistory() {
        for(Order c : orderHistory){
            System.out.println(c);
        }
    }

    public void viewDetails() {
        for(Order c : orderHistory){
            System.out.println(c.getTrackingNumber());
            System.out.println(c.getDatePurchase());

    }

    public void searchByMonth(string month) {
        if(orderHistory.equals(month)){
            return orderHistory;
        }else{
            System.out.println("Month not found");
        }
    }

    public void deleteOrderHistoryByNumber(int number){
        orderHistory.remove(number);
    }
    public void deleteAll(){
        orderHistory.clear();
    }
}