package pe.edu.upc.first.history;
import pe.edu.upc.first.payment.Order;
import pe.edu.upc.first.business.Computer;
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class OrderHistory {
    private Order order;
    private List<Computer> orderHistory;
    private int number;

    //Builder


    public OrderHistory() {
        this.order = new Order();
        this.orderHistory = new ArrayList<Computer>(order.getShoppingList());
        this.number = number;
    }

    public OrderHistory(Order order, List<Computer> shoppingList, List<Computer> orderHistory, int number) {
        this.order = order;
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


    public void viewDetails() {
            for(Computer c : orderHistory){
                System.out.println(c.getOrder().getDatePurchase());
                System.out.println(c.getOrder().getTrackingNumber());
            }
        }


    public List<Computer> searchByDatePurchase(Long datePurchase) {
        List<Computer> result = new ArrayList<Computer>();
        datePurchase = order.getDatePurchase();
       for(Computer c : orderHistory){
           if(orderHistory.contains(datePurchase)){//Si contiene
               result.add(c);//Que lo copie a la nueva lista
           }else{
               System.out.println("Date not found");
           }
       }
        return result;//Y la muestre
    }

    public void deleteLast(){
        orderHistory.remove(orderHistory.size()-1);
    }
    public void deleteAll(){
        orderHistory.clear();
    }

    @Override
    public String toString() {
        return "OrderHistory{" +
                "orderHistory=" + orderHistory +
                '}';
    }
    public void showOrderHistory() {
        System.out.println(orderHistory.toString());
    }

}