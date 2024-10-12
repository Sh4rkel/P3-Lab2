package exercitii.nr3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Daniel Filip
 * @since 10.13.2024 (mm/dd/yyyy)
 * Clasa de teste pentru NumarComplex.
 */
public class tests {

    @Test
    public void testModul() {
        NumarComplex numar = new NumarComplex(3, 4);
        assertEquals(5.0, numar.modul(), 0.01);
    }

    @Test
    public void testSuma() {
        NumarComplex numar1 = new NumarComplex(3, 4);
        NumarComplex numar2 = new NumarComplex(1, -2);
        NumarComplex suma = numar1.suma(numar2);
        assertEquals(4.0, suma.parteReala, 0.01);
        assertEquals(2.0, suma.parteImaginara, 0.01);
    }

    @Test
    public void testProdus() {
        NumarComplex numar1 = new NumarComplex(3, 4);
        NumarComplex numar2 = new NumarComplex(1, -2);
        NumarComplex produs = numar1.produs(numar2);
        assertEquals(11.0, produs.parteReala, 0.01);
        assertEquals(-10.0, produs.parteImaginara, 0.01);
    }

    @Test
    public void testToString() {
        NumarComplex numar = new NumarComplex(3, 4);
        assertEquals("3.0+4.0i", numar.toString());
    }

    @Test
    public void testToStringCuParteaImaginaraNegativa() {
        NumarComplex numar = new NumarComplex(3, -4);
        assertEquals("3.0-4.0i", numar.toString());
    }
}
