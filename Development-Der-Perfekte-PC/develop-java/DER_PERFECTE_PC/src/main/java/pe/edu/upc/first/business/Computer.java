package pe.edu.upc.first.business;
import pe.edu.upc.first.component.Processor;
import pe.edu.upc.first.component.Ram;
import pe.edu.upc.first.component.Storage;
import pe.edu.upc.first.component.MotherBoard;
import pe.edu.upc.first.component.Case;
import pe.edu.upc.first.component.PowerSupply;
import pe.edu.upc.first.component.GraphicsCard;
import java.util.ArrayList;
import java.util.List;



public class Computer {
    private Product processor;
    private Ram ram;
    private Storage storage;
    private MotherBoard motherboard;
    private GraphicsCard gpu;
    private Case _case;
    private PowerSupply powerSupply;
    private List<Entity> listProduct;
    private Entity entity;

    public Computer(){
        this.processor = new Processor;
        this.ram = new Ram;
        this.storage = new Storage;
        this.motherboard = new Motherboard;
        this.gpu = new Gpu;
        this._case = new Case;
        this.powerSupply = new PowerSupply;
        this.listProduct = new ArrayList<>();
        this.entity = new Entity;
    }
    public Computer(Product processor, Ram ram, Storage storage, MotherBoard motherboard, GraphicsCard gpu, Case _case, PowerSupply powerSupply, List<Entity> listProduct, Entity entity) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.motherboard = motherboard;
        this.gpu = gpu;
        this._case = _case;
        this.powerSupply = powerSupply;
        this.listProduct = listProduct;
        this.entity = new Entity;
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

    public Case get_case() {
        return _case;
    }

    public void set_case(Case _case) {
        this._case = _case;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }




    public void addProcessor(Processor processor){
        listProduct.add(processor);
    }
    public void addRam(Ram ram){
        listProduct.add(ram);
    }
    public void addStorage(Storage storage){
        listProduct.add(storage);
    }
    public void addMotherboard(Motherboard motherboard){
        listProduct.add(motherboard)
    }
    public void addGpu(GraphicsCard gpu){
        listProduct.add(gpu);
    }
    public void addCase(Case _case){
        listProduct.add(_case);
    }
    public void addPowerSupply(PowerSupply powerSupply){
        listProduct.add(powerSupply);
    }
    public void editComponent(Entity entity){}
    public void deleteComponent(Entity entity){}
    public void show(){}
}