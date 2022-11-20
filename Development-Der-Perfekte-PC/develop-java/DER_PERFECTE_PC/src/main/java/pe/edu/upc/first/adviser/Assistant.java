
package pe.edu.upc.first.adviser;
import pe.edu.upc.first.user.Buyer;

public class Assistant {
    private Buyer buyer;
    private ComponentFinder componentFinder;
    private ChatBot chatBot;

    public Assistant(Buyer buyer, ComponentFinder componentFinder, ChatBot chatBot) {
        this.buyer = buyer;
        this.componentFinder = componentFinder;
        this.chatBot = chatBot;
    }

    public Assistant() {
        this.buyer = new Buyer();
        this.componentFinder = new ComponentFinder();
        this.chatBot = new ChatBot();
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

    public void run(){}
    public void meetIdealComputer(){

    }
    public void saveConfiguration(){}
    public void deleteConfiguration(){}
    public void addToWishList(){}
    public void buyAll(){}
    public void startComponentFinder(){}
    public void exitAssistant(){}
    public void getClientData(){}
}