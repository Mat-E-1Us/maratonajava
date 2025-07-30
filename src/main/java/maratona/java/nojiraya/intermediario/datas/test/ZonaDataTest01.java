package maratona.java.nojiraya.intermediario.datas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZonaDataTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneIto = ZoneId.of("Asia/Tokyo");
        LocalDateTime now = LocalDateTime.now();

        ZonedDateTime zonedDateTime = now.atZone(zoneIto);
        System.out.println(zonedDateTime);

        Instant instant = Instant.now();

        ZonedDateTime zonedDateTime1 = instant.atZone(zoneIto);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime off = now.atOffset(offSetManaus);
        System.out.println(off);
//        OffsetDateTime mana = now.atOffset(offSetManaus);
//        System.out.println(mana);


        OffsetDateTime data = OffsetDateTime.of(now, offSetManaus);
        OffsetDateTime offsetDateTime = data.minusHours(2);
        System.out.println(offsetDateTime);
        System.out.println(data);

        OffsetDateTime offsetDateTimeInstant = instant.atOffset(offSetManaus);
        System.out.println(offsetDateTimeInstant);
    }
}
