package maratona.java.nojiraya.intermediario.concorrencia.domain;

public class Discount {
    public enum Disc {
        NONE(0), BASIL_FAZ_O_L(1), KEL_O_MAIS(5), AU_DAS_BREAYS(10), OH_HERO(25), MARI_MARI_SAVE(30), SU_SU_NNY(40), OMORI_O_CAT(50);
        private final int percentage;

        Disc(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
