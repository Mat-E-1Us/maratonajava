package maratona.java.nojiraya.intermediario.concorrencia.domain;

public final class Quote {
        private final String name;
        private final double price;
        private final Discount.Disc discount;

    private Quote(String name, double price, Discount.Disc discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public static Quote newQuote(String value){
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Disc.valueOf(values[2]));
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Disc getDiscount() {
        return discount;
    }
}
