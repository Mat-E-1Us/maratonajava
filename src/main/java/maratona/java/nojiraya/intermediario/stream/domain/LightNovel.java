package maratona.java.nojiraya.intermediario.stream.domain;

public class LightNovel {
    private String name;
    private double price;
    private Category category;

    public LightNovel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public LightNovel(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
