package maratona.java.nojiraya.intermediario.designpatterns.test;

import maratona.java.nojiraya.intermediario.designpatterns.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .personBuilder()
                .firstName("Sunny")
                .lastName("Ori")
                .username("brotopeira")
                .email("sunny_in_af@gmail.com")
                .build();
        System.out.println(build);
    }
}
