package pe.edu.upc.first.user;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public abstract class Client {
    private int id;
    private String name;
    private String mail;
    private String password;
    private long phone;
    private Scanner entrada;
    private BufferedReader reader;
    private List<Client> listRegistered;

    public Client() {
        super();
        this.entrada = new Scanner(System.in);
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.listRegistered = new ArrayList<Client>();
    }

    public Client(int id, String name, String mail, String password, long phone, Scanner entrada, BufferedReader reader) {
        super();
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.phone = phone;
        this.entrada = entrada;
        this.reader = reader;

    }

    public Client(int id, String name, String mail, String password, long phone) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void addId() throws IOException {
        System.out.println("Enter ur id");
        id = Integer.parseInt(reader.readLine());
        setId(id);
    }
    public void addName() throws IOException {
        System.out.println("Enter ur name");
        name = reader.readLine();
        setName(name);
    }
    public void addMail() throws IOException {
        System.out.println("Enter ur mail");
        mail = reader.readLine();
        setMail(mail);
    }
    public void addPassword() throws IOException {
        System.out.println("Enter ur password");
        password = reader.readLine();
        setPassword(password);
    }
    public void addPhone() throws IOException {
        System.out.println("Enter ur phone");
        phone = Long.parseLong(reader.readLine());
        setPhone(Long.parseLong(String.valueOf(phone)));
    }
    public void checkIn() throws IOException {
        System.out.println("Enter ur id");
        id = Integer.parseInt(reader.readLine());
        setId(id);
        System.out.println("Enter ur name");
        name = reader.readLine();
        setName(name);
        System.out.println("Enter ur mail");
        mail = reader.readLine();
        setMail(mail);
        System.out.println("Enter ur password");
        password = reader.readLine();
        setPassword(password);
        System.out.println("Enter ur phone");
        phone = Long.parseLong(reader.readLine());
        setPhone(Long.parseLong(String.valueOf(phone)));
        System.out.println("U are registered, welcome" + getName());
    }
    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                '}';
    }
}