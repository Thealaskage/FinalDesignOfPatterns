package pe.edu.upc.first;
import pe.edu.upc.first.user.Provider;

public class Main {
    public static void main(String[] args){
        Provider pr = new Provider(1, "Pepe", "pepe777@gmail.com", "pepe123", 981827312);
        System.out.println(pr.toString());
    }
}
