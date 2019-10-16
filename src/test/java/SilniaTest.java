import static org.junit.Assert.*;
import org.junit.Test;

public class SilniaTest {

    @Test
    public void czySilniaZ5To120(){
        Silnia silnia = new Silnia();
        assertEquals(silnia.silnia(5), 120);
        assertEquals(silnia.silniaRekurencja(5), 120);
    }
}
