package exercitii.nr2;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Clasa de teste pentru clasa Container.
 */
public class tests {

    private Container container;

    @Before
    public void setUp() {
        // Cream un nou container inainte de fiecare test
        container = new Container("Test Container", 5);
    }

    @Test
    public void testAdaugaProdus() {
        Produs produs = new Produs("Laptop", 3000, 5);
        container.adaugaProdus(produs);
        assertEquals(1, container.getNumarProduse());
        assertEquals("Laptop", container.getProduse()[0].getNume());
    }

    @Test
    public void testEliminaProdus() {
        Produs produs = new Produs("Laptop", 3000, 5);
        container.adaugaProdus(produs);
        container.eliminaProdus("Laptop");
        assertEquals(0, container.getNumarProduse());
    }

    @Test
    public void testEliminaProdusInexistent() {
        Produs produs = new Produs("Laptop", 3000, 5);
        container.adaugaProdus(produs);
        container.eliminaProdus("Telefon"); // Produs inexistent
        assertEquals(1, container.getNumarProduse()); // Verificam faptul ca numarul de produse nu s-a schimbat
    }

    @Test
    public void testModificaCantitateaProdus() {
        Produs produs = new Produs("Laptop", 3000, 5);
        container.adaugaProdus(produs);
        Container.modificaCantitateaProdus(container, "Laptop", 10);
        assertEquals(10, container.getProduse()[0].getCantitate());
    }

    @Test
    public void testModificaCantitateProdusInexistent() {
        Produs produs = new Produs("Laptop", 3000, 5);
        container.adaugaProdus(produs);
        Container.modificaCantitateaProdus(container, "Telefon", 10); // Produs inexistent
        assertEquals(5, container.getProduse()[0].getCantitate()); // Verificam daca acum cantitatea ramane aceeasi
    }

    @Test
    public void testCalculeazaPretTotal() {
        Produs produs1 = new Produs("Laptop", 3000, 5);
        Produs produs2 = new Produs("Telefon", 1000, 10);
        container.adaugaProdus(produs1);
        container.adaugaProdus(produs2);
        double expectedTotal = (3000 * 5) + (1000 * 10);
        assertEquals(expectedTotal, container.calculeazaPretTotal(), 0.01);
    }

    @Test
    public void testCalculeazaPretTotalFaraProduse() {
        // Verificam pretul total fara produse
        assertEquals(0.0, container.calculeazaPretTotal(), 0.01);
    }

    @Test
    public void testAdaugaProdusPlin() {
        // Umplem containerul la capacitate maxima
        for (int i = 0; i < 5; i++) {
            container.adaugaProdus(new Produs("Produs " + i, 100, 1));
        }
        assertEquals(5, container.getNumarProduse());
        // Incercam sa adaugam un produs in plus
        container.adaugaProdus(new Produs("Produs 5", 100, 1)); // Containerul este plin
        assertEquals(5, container.getNumarProduse()); // Numărul de produse nu ar trebui să se schimbe
    }

    @Test
    public void testAfisareProduse() {
        // Adaugam produse si verificam ca sunt afisate corect
        Produs produs1 = new Produs("Laptop", 3000, 5);
        Produs produs2 = new Produs("Telefon", 1000, 10);
        container.adaugaProdus(produs1);
        container.adaugaProdus(produs2);

        // Capturam iesirea
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        container.afisareProduse(); // Afisam produsele

        String expectedOutput = "Produs: Laptop, Pret: 3000.0, Cantitate: 5\n"
                + "Produs: Telefon, Pret: 1000.0, Cantitate: 10\n";
        assertEquals(expectedOutput, outContent.toString()); // Verificam iesirea
        System.setOut(System.out); // Resetam iesirea
    }
}

