package pe.edu.upc.first.business;
import pe.edu.upc.first.component.Processor;
import pe.edu.upc.first.component.Ram;
import pe.edu.upc.first.component.Storage;
import pe.edu.upc.first.component.MotherBoard;
import pe.edu.upc.first.component.Case;
import pe.edu.upc.first.component.PowerSupply;
import pe.edu.upc.first.component.GraphicsCard;
import pe.edu.upc.first.component.Entity;
import pe.edu.upc.first.payment.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Computer {
    private Processor processor;
    private Ram ram;
    private Storage storage;
    private MotherBoard motherboard;
    private GraphicsCard gpu;
    private Case _case;
    private PowerSupply powerSupply;
    private List<Entity> listProduct;
    private Entity entity;
    private Order order;
    private Scanner entrada;

    public Computer(){
        this.processor = new Processor();
        this.ram = new Ram();
        this.storage = new Storage();
        this.motherboard = new MotherBoard();
        this.gpu = new GraphicsCard();
        this._case = new Case();
        this.powerSupply = new PowerSupply();
        this.listProduct = new ArrayList<Entity>();
        this.entity = new Entity();
        this.order = new Order();
        this.entrada = new Scanner(System.in);
    }
    public Computer(Processor processor, Ram ram, Storage storage, MotherBoard motherboard, GraphicsCard gpu, Case _case, PowerSupply powerSupply) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.motherboard = motherboard;
        this.gpu = gpu;
        this._case = _case;
        this.powerSupply = powerSupply;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public MotherBoard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(MotherBoard motherboard) {
        this.motherboard = motherboard;
    }

    public GraphicsCard getGpu() {
        return gpu;
    }

    public void setGpu(GraphicsCard gpu) {
        this.gpu = gpu;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Case get_case() {
        return _case;
    }

    public List<Entity> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Entity> listProduct) {
        this.listProduct = listProduct;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void addProcessor(){
        listProduct.add(processor);
    }
    public void addRam(){
        listProduct.add(ram);
    }
    public void addStorage(){
        listProduct.add(storage);
    }
    public void addMotherboard(){
        listProduct.add(motherboard);
    }
    public void addGpu(){
        listProduct.add(gpu);
    }
    public void addCase(){
        listProduct.add(_case);
    }
    public void addPowerSupply(){
        listProduct.add(powerSupply);
    }
    public void editComponent(Entity componentToAdd, Entity componentToDelete){
        System.out.println("\nChoose an option.\n" +
                "1 - Add Component\n" +
                "2 - Delete Component\n" +
                "3 - Exit");

        int option = 0;

        do{
            option = entrada.nextInt();
            switch (option){
                case 1:
                    addComponent(componentToAdd);
                    break;
                case 2:
                    deleteComponent(componentToDelete);
                case 3:
                    break;

            }

        }while(option != 3);

    }
    public void showDetailComponents(){//Us08
            for(Entity pr : listProduct){
                System.out.println(pr.toString());
            }
        }
    public void addComponent(Entity entity){
        listProduct.add(entity);
    }
    public void chooseProduct(){
        System.out.println("\nChoose an option to buy.\n" +
                "1 - Add processor \n" +
                "2 - Add ram\n" +
                "3 - Add storage\n" +
                "4 - Add motherboard\n" +
                "5 - Add gpu\n" +
                "6 - Add case\n" +
                "7 - Add power supply\n" +
                "8- Delete Component");
        int option = 0;
        do{
            option = entrada.nextInt();
            switch (option){
                case 1:
                    addProcessor();
                    break;
                case 2:
                    addRam();
                    break;
                case 3:
                    addStorage();
                    break;
                case 4:
                    addMotherboard();
                    break;
                case 5:
                    addGpu();
                    break;
                case 6:
                    addCase();
                    break;
                case 7:
                    addPowerSupply();
                    break;
                case 8:
                    break;
            }


        }while(option != 8);
    }
    public void deleteComponent(Entity entity){
        listProduct.remove(entity);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", storage=" + storage +
                ", motherboard=" + motherboard +
                ", gpu=" + gpu +
                ", _case=" + _case +
                ", powerSupply=" + powerSupply +
                ", listProduct=" + listProduct +
                '}';
    }
    public void showListProduct(){
        System.out.println(listProduct.toString());
    }
}