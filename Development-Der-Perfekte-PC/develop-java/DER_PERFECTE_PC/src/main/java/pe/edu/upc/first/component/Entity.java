package pe.edu.upc.first.component;

public class Entity{
    private double price;
    private String name;
    private String brand;
    private String description;
    private int id;
    private Entity category;

    public Entity() {
        super();
        this.category = new Entity();
    }

    public Entity(double price, String name, String brand, String description, int id) {
        super();
        this.price = price;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Entity getCategory() {
        return category;
    }

    public void setCategory(Entity category) {
        this.category = category;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return  "price=" + price +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }
}