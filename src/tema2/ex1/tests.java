package tema2.ex1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class tests {

    @Test
    public void testMagazinCuCeleMaiIeftineMobile() {
        Mobila mobila1 = new Mobila("Scaun", "Scaun din lemn de stejar", "Lemn", 50, 50, 100, 150);
        Mobila mobila2 = new Mobila("Masa", "Masa din sticla", "Sticla", 200, 100, 75, 300);
        Mobila mobila3 = new Mobila("Dulap", "Dulap din MDF", "MDF", 100, 50, 200, 400);

        MagazinMobilier magazin1 = new MagazinMobilier("Jysk", "Strada Libertatii", Arrays.asList(mobila1, mobila2));
        MagazinMobilier magazin2 = new MagazinMobilier("Dedeman", "Strada Independentei", Arrays.asList(mobila3));

        MagazinMobilier[] magazine = {magazin1, magazin2};

        String numeMagazinIeftin = MagazinMobilier.magazinCuCeleMaiIeftineMobile(magazine);
        assertEquals("Jysk", numeMagazinIeftin);
    }

    @Test
    public void testNumaraMobileCuDescriere() {
        Mobila mobila1 = new Mobila("Scaun", "Scaun din lemn de stejar", "Lemn", 50, 50, 100, 150);
        Mobila mobila2 = new Mobila("Masa", "Masa din sticla", "Sticla", 200, 100, 75, 300);

        MagazinMobilier magazin = new MagazinMobilier("Jysk", "Strada Libertatii", Arrays.asList(mobila1, mobila2));
        List<String> cuvinteCautare = Arrays.asList("lemn", "stejar");

        int numarMobile = magazin.numaraMobileCuDescriere(cuvinteCautare);
        assertEquals(1, numarMobile);
    }
}

