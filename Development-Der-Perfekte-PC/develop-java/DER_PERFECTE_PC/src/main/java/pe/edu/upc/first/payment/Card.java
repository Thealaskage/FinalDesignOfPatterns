package pe.edu.upc.first.payment;
import java.util.Scanner
public class Card {
    private String ownerName;
    private  long cardNumber;
    private String cardExDate;
    private int cardCVV;
    private Scanner entrada;

    public Card() {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.cardExDate = cardExDate;
        this.cardCVV = cardCVV;
        this.entrada = new Scanner(System.in);
    }

    public Card(String ownerName, long cardNumber, String cardExDate, int cardCVV, Scanner entrada) {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.cardExDate = cardExDate;
        this.cardCVV = cardCVV;
        this.entrada = entrada;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExDate() {
        return cardExDate;
    }

    public void setCardExDate(String cardExDate) {
        this.cardExDate = cardExDate;
    }

    public int getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(int cardCVV) {
        this.cardCVV = cardCVV;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public void addOwnerName(){
        System.out.println("Owner Name: ");
        ownerName = entrada.nextInt();
    }
    public void addCardNumber(){
        System.out.println("Card Number: ");
        cardNumber = entrada.nextInt();
    }
    public void addCardExDate(){
        System.out.println("Expiration Date: ");
        cardExDate = entrada.nextInt();
    }
    public void addCardCVV(){
        System.out.println("CardCVV: ");
        cardCVV = entrada.nextInt();
    }
}