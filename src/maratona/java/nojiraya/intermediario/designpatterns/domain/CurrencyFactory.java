package maratona.java.nojiraya.intermediario.designpatterns.domain;

public class CurrencyFactory {
    public static Currency newCurrency(Country country){
        return switch (country) {
            case USA -> new Dollar();
            case BRAZIL -> new Real();
            default -> throw new IllegalArgumentException("No currency found for this country");
        };
    }
}
