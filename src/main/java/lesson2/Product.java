package lesson2;

public class Product {
    private long id;
    private String name;
    private double coast;


    public Product(){

    }
    public Product(long id, String name, double coast) {
        this.id = id;
        this.name = name;
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public long getId() {
        return id;
    }
}
