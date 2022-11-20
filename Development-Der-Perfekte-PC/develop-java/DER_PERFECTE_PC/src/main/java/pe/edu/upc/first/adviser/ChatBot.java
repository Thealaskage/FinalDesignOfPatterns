package pe.edu.upc.first.adviser;
import java.util.Scanner
public class ChatBot{
    private String message;
    private String question;
    private Scanner entrada;


    public ChatBot(String message, String question, Scanner entrada) {
        this.message = message;
        this.question = question;
        this.entrada = entrada;
    }

    public ChatBot() {
        this.message = message;
        this.question = question;
        this.entrada = new Scanner(System.in);
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

    public void run(){}
    public void sendMessageBot(){
        System.out.println("Message");
    }
    public void askBot(){
        System.out.println("Make ur question");
        question = entrada.nextInt();
    }
    public void showResponse(){
        System.out.println("Response");
    }
    public boolean exitChatBot(){
        if(message = entrada.nextInt() == "EXIT"){
            return 1;
        }
    }
}