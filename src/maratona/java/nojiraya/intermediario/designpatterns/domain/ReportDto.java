package maratona.java.nojiraya.intermediario.designpatterns.domain;

public class ReportDto {
    private String airCraftName;
    private Country country;
    private Currency currency;
    private String personName;

    public static final class ReportDtoBuilder {
        private String airCraftName;
        private Country country;
        private Currency currency;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder aReportDto() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder airCraftName(String airCraftName) {
            this.airCraftName = airCraftName;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.country = this.country;
            reportDto.currency = this.currency;
            reportDto.personName = this.personName;
            reportDto.airCraftName = this.airCraftName;
            return reportDto;
        }
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "airCraftName='" + airCraftName + '\'' +
                ", country=" + country +
                ", currency=" + currency.getSymbol() +
                ", personName='" + personName + '\'' +
                '}';
    }
}
