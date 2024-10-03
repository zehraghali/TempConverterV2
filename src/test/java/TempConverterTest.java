import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TempConverterTest {

    TempConverter tempConverter = new TempConverter();

    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(80.51, tempConverter.kelvinToFahrenheit(300.1), 0.1); // Oikea odotusarvo
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, tempConverter.fahrenheitToCelsius(32), 0.1);
        assertEquals(100.0, tempConverter.fahrenheitToCelsius(212), 0.1);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, tempConverter.celsiusToFahrenheit(0), 0.1);
        assertEquals(212.0, tempConverter.celsiusToFahrenheit(100), 0.1);
    }

    @Test
    public void testIsExtremeTemperature() {
        assertTrue(tempConverter.isExtremeTemperature(-50));
        assertFalse(tempConverter.isExtremeTemperature(20));
        assertTrue(tempConverter.isExtremeTemperature(51));
    }
}
