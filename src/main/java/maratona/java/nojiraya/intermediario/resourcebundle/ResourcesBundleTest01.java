package maratona.java.nojiraya.intermediario.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        Locale br = Locale.of("pt", "BR");
        Locale jp = Locale.of("ja", "JP");
        ResourceBundle bundle = ResourceBundle.getBundle("message.mess",br);
        ResourceBundle bundle2 = ResourceBundle.getBundle("message.mess", jp);

        System.out.println(bundle.getString("texto"));
        System.out.println(bundle2.getString("texto"));
    }
}
