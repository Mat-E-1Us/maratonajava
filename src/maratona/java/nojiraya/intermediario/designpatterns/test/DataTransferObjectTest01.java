package maratona.java.nojiraya.intermediario.designpatterns.test;

import maratona.java.nojiraya.intermediario.designpatterns.domain.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        AircraftSingletonEager aircraft = new AircraftSingletonEager("999");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.personBuilder()
                .firstName("Sunny")
                .lastName("Omori")
                .build();

        ReportDto reportDtoBuild = ReportDto.ReportDtoBuilder.aReportDto()
                .airCraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDtoBuild);
    }
}
