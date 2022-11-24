package pe.edu.upc.first.adviser;
import pe.edu.upc.first.user.Buyer;
import pe.edu.upc.first.user.Provider;
import pe.edu.upc.first.business.Computer;
import pe.edu.upc.first.business.Store;
import pe.edu.upc.first.payment.Order;
import pe.edu.upc.first.payment.Subscription;
import pe.edu.upc.first.history.WishList;
import pe.edu.upc.first.history.OrderHistory;


import pe.edu.upc.first.component.Entity;

import java.io.IOException;
import java.util.Scanner;

public class Assistant {
    private Buyer buyer;
    private ComponentFinder componentFinder;
    private ChatBot chatBot;

    private Computer computer;
    private Order order;
    private Scanner entrada;
    private WishList wihslist;
    private Entity product;
    private Provider provider;
    private Subscription subscription;
    private OrderHistory orderHistory;
    private Store store;


    public Assistant(Buyer buyer, ComponentFinder componentFinder, ChatBot chatBot, Computer computer) {
        this.buyer = buyer;
        this.componentFinder = componentFinder;
        this.chatBot = chatBot;
        this.computer = computer;
    }

    public Assistant() {
        this.buyer = new Buyer();
        this.componentFinder = new ComponentFinder();
        this.chatBot = new ChatBot();
        this.computer = new Computer();
        this.order = new Order();
        this.entrada = new Scanner(System.in);
        this.wihslist = new WishList();
        this.product = new Entity();
        this.provider = new Provider();
        this.subscription = new Subscription();
        this.orderHistory = new OrderHistory();
        this.store = new Store();
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public ComponentFinder getComponentFinder() {
        return componentFinder;
    }

    public void setComponentFinder(ComponentFinder componentFinder) {
        this.componentFinder = componentFinder;
    }

    public ChatBot getChatBot() {
        return chatBot;
    }

    public void setChatBot(ChatBot chatBot) {
        this.chatBot = chatBot;
    }

    public void run() throws IOException {
        System.out.println("Welcome to DerPerfektePc\n");
        System.out.println("\nChoose an option.\n" +
                "1 - Meet ur ideal computer \n" +
                "2 - ChatBot \n" +
                "3 - Component Finder\n" +
                "4 - See ur WishList\n" +
                "5 - Add to WishList\n" +
                "6 - Add to Shopping Cart\n" +
                "7 - See ur Shopping Cart\n" +
                "8 - Check in \n" +
                "9 - Be a supplier\n" +
                "10 - See ur OrderHistory\n" +
                "11 - Show Store\n" +
                "12 - Exit");

        int option = 0;
        do{
            option = entrada.nextInt();
            switch (option){
                case 1:
                    chatBot.meetIdealComputer();
                    break;
                case 2:
                    chatBot.run();
                    break;
                case 3:
                    startComponentFinder();
                    break;
                case 4:
                    wihslist.viewWishList();
                    break;
                case 5:
                    wihslist.addComputer(computer);
                    wihslist.addComponent(product);
                    break;
                case 6:
                    order.addComputer(computer);
                    break;
                case 7:
                    order.showListOrder();
                    break;
                case 8:
                    buyer.checkIn();
                    break;
                case 9:
                    subscription.toSubscribe();
                    break;
                case 10:
                    orderHistory.showOrderHistory();
                    break;
                case 11:
                    store.getStoreData();
                    break;
                case 12:
                    break;
            }


        }while(option != 12);
    }
    public void buyAll(){
        computer.addStorage();
        computer.addRam();
        computer.addCase();
        computer.addGpu();
        computer.addMotherboard();
        order.confirmOrder();
    }
    public void startComponentFinder(){
        componentFinder.search();
    }

    public void getClientData(){}
}