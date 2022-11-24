package pe.edu.upc.first.payment;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Card {
    private String ownerName;
    private long cardNumber;
    private String cardExDate;
    private int cardCVV;
    private Scanner entrada;
    private BufferedReader reader;
    private String cardBrand;

    public Card() {
        this.entrada = new Scanner(System.in);
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public Card(String ownerName, long cardNumber, String cardExDate, int cardCVV, String cardBrand) {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.cardExDate = cardExDate;
        this.cardCVV = cardCVV;
        this.cardBrand = cardBrand;
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

    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    public void addOwnerName() throws IOException {
        System.out.println("Enter card ownerName");
        ownerName = reader.readLine();
        setOwnerName(ownerName);
    }
    public void addCardNumber() throws IOException {
        System.out.println("Enter card number");
        cardNumber = Long.valueOf(reader.readLine());
        setCardNumber(cardNumber);
    }
    public void addCardExDate() throws IOException {
        System.out.println("Enter card expiration day");
        cardExDate = reader.readLine();
        setCardExDate(cardExDate);
    }
    public void addCardCVV() throws IOException {
        System.out.println("Enter card number");
        cardCVV = Integer.parseInt(reader.readLine());
        setCardCVV(cardCVV);
    }
    public void addCardBrand() throws IOException {
        System.out.println("Enter card number");
        cardBrand = reader.readLine();
        setCardBrand(cardBrand);
    }

    @Override
    public String toString() {
        return "Card{" +
                "ownerName='" + ownerName + '\'' +
                ", cardNumber=" + cardNumber +
                ", cardExDate='" + cardExDate + '\'' +
                ", cardCVV=" + cardCVV +
                ", cardBrand='" + cardBrand + '\'' +
                '}';
    }
}