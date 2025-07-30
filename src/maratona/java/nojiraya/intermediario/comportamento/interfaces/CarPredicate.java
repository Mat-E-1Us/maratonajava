package maratona.java.nojiraya.intermediario.comportamento.interfaces;

import maratona.java.nojiraya.intermediario.comportamento.domain.Car;
@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
