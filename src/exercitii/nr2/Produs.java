package exercitii.nr2;

import java.util.Arrays;

/**
 * @author Daniel Filip
 * @since 10.13.2024 (mm/dd/yyyy)
 * Clasa Produs reprezintă un produs cu nume, preț și cantitate.
 */
public class Produs {
    private String nume;
    private double pret;
    private int cantitate;

    /**
     * Constructor pentru clasa Produs.
     *
     * @param nume      Numele produsului.
     * @param pret      Prețul produsului.
     * @param cantitate Cantitatea produsului.
     */
    public Produs(String nume, double pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    // Getters și setters pentru atributele clasei Produs
    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    /**
     * Afiseaza detaliile despre produs.
     */
    public void afisareProdus() {
        System.out.println("Produs: " + nume + ", Pret: " + pret + ", Cantitate: " + cantitate);
    }
}
