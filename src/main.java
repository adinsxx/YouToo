import java.time.LocalDate;
import java.time.Period;

public class main {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        LocalDate joshuaTreeReleaseDate = LocalDate.of(1987, 3, 9);

        Period periodBetweenJoshuaTreeReleaseDateAndToday = Period.between(d1, joshuaTreeReleaseDate);
        System.out.println(periodBetweenJoshuaTreeReleaseDateAndToday);

        LocalDate rattleHumReleaseDate = LocalDate.of(1988, 10, 10);
        Period periodBetweenJoshuaTreeAndRattleHum = Period.between(joshuaTreeReleaseDate, rattleHumReleaseDate);
        System.out.println(periodBetweenJoshuaTreeAndRattleHum);

        LocalDate albumReleasedAfterRattleHum = rattleHumReleaseDate.plus(periodBetweenJoshuaTreeAndRattleHum);
        System.out.println(albumReleasedAfterRattleHum);
    }


}
