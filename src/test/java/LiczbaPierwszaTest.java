import static org.junit.Assert.*;
import org.junit.Test;

public class LiczbaPierwszaTest {

    @Test
    public void czy5JestLiczbąPierwszą() {
        LiczbaPierwsza liczbaPierwsza = new LiczbaPierwsza();
        assertTrue(liczbaPierwsza.czyJestToLiczbaPierwsza(5));
    }

    @Test
    public void czy1JestLiczbąPierwszą() {
        LiczbaPierwsza liczbaPierwsza = new LiczbaPierwsza();
        assertFalse(liczbaPierwsza.czyJestToLiczbaPierwsza(1));
    }

    @Test
    public void czy2JestLiczbąPierwszą() {
        LiczbaPierwsza liczbaPierwsza = new LiczbaPierwsza();
        assertTrue(liczbaPierwsza.czyJestToLiczbaPierwsza(2));
    }

    @Test
    public void czy10JestLiczbąPierwszą() {
        LiczbaPierwsza liczbaPierwsza = new LiczbaPierwsza();
        assertFalse(liczbaPierwsza.czyJestToLiczbaPierwsza(10));
    }
}
