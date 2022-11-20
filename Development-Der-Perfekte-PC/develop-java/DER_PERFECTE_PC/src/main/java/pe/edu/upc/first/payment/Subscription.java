package pe.edu.upc.first.payment;
import pe.edu.upc.first.user.Provider;

public class Subscription{
    private Card card;
    private Provider provider;

    public Subscription(){
        this.card = new Card;
        this.provider = new Provider;
    }

    public Subscription(Card card, Provider provider) {
        this.card = card;
        this.provider = provider;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    //Methods
    public void toSubscribe(){

    }
    public void cancelSubscription(){}
    public void changePaymentMethod(){}
}