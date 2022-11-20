
package pe.edu.upc.first.user;

public abstract class Client {
    private int id;
    private String name;
    private String mail;
    private String password;
    private double phone;

    public Client() {
        super();
    }

    public Client(int id, String name, String mail, String password, double phone) {
        super();
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.phone = phone;
    }

    public void addId(){}
    public void addName(){}
    public void addMail(){}
    public void addPassword(){}
    public void addPhone(){}

}