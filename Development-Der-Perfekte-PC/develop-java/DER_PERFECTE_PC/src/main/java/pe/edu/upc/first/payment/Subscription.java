package pe.edu.upc.first.payment;
import pe.edu.upc.first.user.Provider;

public class Subscription{
    private Card card = new Card();
    private Provider provider = new Provider();
    //Builder
    public Subscription(){}
    //Methods
    public void toSubscribe(){}
    public void cancelSubscription(){}
    public void changePaymentMethod(){}
}