package pe.edu.upc.first.adviser;
import java.util.Scanner;
import pe.edu.upc.first.user.Buyer;

public class ChatBot {
    private String message;
    private String question;
    private Scanner entrada;
    private Buyer buyer;


    public ChatBot(String message, String question, Scanner entrada, Buyer buyer) {
        this.message = message;
        this.question = question;
        this.entrada = entrada;
        this.buyer = buyer;
    }

    public ChatBot() {
        this.entrada =  new Scanner(System.in);
        this.buyer = new Buyer();
    }

    //Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void run() {
        System.out.println("\nWelcome" + buyer.getName() + " my name is JuanBot, please choose a option\n" +
                "1 - Make a question\n" +
                "2 - Send a message\n" +
                "3 - Exit chatbot");
        int option = 0;
        do{
            option = entrada.nextInt();
            switch (option){
                case 1:
                    askBot();
                    showResponse();
                    break;
                case 2:
                    sendMessageBot();
                    break;
                case 3:
                    break;
            }
        }while(option != 3);
    }

    public String sendMessageBot() {
        System.out.println("Send ur message");
        message = entrada.nextLine();
        return message;
    }

    public String askBot() {
        System.out.println("Make ur question");
        question = entrada.nextLine();
        return question;
    }

    public void showResponse() {
        System.out.println("Bot Response");
    }
    public void meetIdealComputer(){
        System.out.println("What is ur amount for the PC");
        message = entrada.nextLine();
        System.out.println("What kind of computer do you want");
        message = entrada.nextLine();
        System.out.println("Do you want an affordable or expensive graphics card?");
        message = entrada.nextLine();
        System.out.println("Do you want an affordable or expensive processor?");
        message = entrada.nextLine();
        System.out.println("Do you want an affordable or expensive ram?");
        message = entrada.nextLine();
        System.out.println("Do you want an affordable or expensive motherboard?");
        message = entrada.nextLine();
        System.out.println("Do you want an affordable or expensive case?");
        message = entrada.nextLine();
        System.out.println("Do you want an affordable or expensive power supply?");
        message = entrada.nextLine();
        System.out.println("Do you want a lot or a little storage?");
        message = entrada.nextLine();

        showResponse();

    }

}