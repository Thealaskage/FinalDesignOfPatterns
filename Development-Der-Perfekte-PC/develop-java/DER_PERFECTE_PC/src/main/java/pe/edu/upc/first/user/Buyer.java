package pe.edu.upc.first.user;
import pe.edu.upc.first.history.WishList;
import pe.edu.upc.first.history.OrderHistory;
import pe.edu.upc.first.payment.Order;
import pe.edu.upc.first.business.Computer;

public class Buyer extends Client{
    private WishList wishList;
    private OrderHistory orderHistory;
    private Order currentOrder;
    private Computer selectedComputer;

    public Buyer(){
        this.wishList = new WishList;
        this.orderHistory = new OrderHistory;
        this.currentOrder = new Order;
        this.selectedComputer = new Computer;
    }

    public Buyer(WishList wishList, OrderHistory orderHistory, Order currentOrder, Computer selectedComputer) {
        this.wishList = wishList;
        this.orderHistory = orderHistory;
        this.currentOrder = currentOrder;
        this.selectedComputer = selectedComputer;
    }

    public void addOrder(){}
    public void editData(){}
    public void checkOrderStatus(){}
    public void viewWishList(){}
    public void viewOrderHistory(){}

}


