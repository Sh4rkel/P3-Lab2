package exercitii.nr2;

/**
 * Clasa Container reprezintă un container care conține un tablou de produse și un identificator.
 */
public class Container {
    private Produs[] produse;
    private String identificator;
    private int numarProduse;

    /**
     * Constructor pentru clasa Container.
     *
     * @param identificator Identificatorul containerului.
     * @param dimensiune    Dimensiunea maximă a containerului.
     */
    public Container(String identificator, int dimensiune) {
        this.identificator = identificator;
        this.produse = new Produs[dimensiune];
        this.numarProduse = 0;
    }

    /**
     * Adauga un produs în container.
     *
     * @param produs Produsul care trebuie adaugat.
     */
    public void adaugaProdus(Produs produs) {
        if (numarProduse < produse.length) {
            produse[numarProduse++] = produs;
        } else {
            System.out.println("Containerul este plin.");
        }
    }

    /**
     * Elimina un produs din container pe baza numelui.
     *
     * @param nume Numele produsului care trebuie eliminat.
     */
    public void eliminaProdus(String nume) {
        for (int i = 0; i < numarProduse; i++) {
            if (produse[i].getNume().equals(nume)) {
                produse[i] = produse[numarProduse - 1];
                produse[numarProduse - 1] = null;
                numarProduse--;
                return;
            }
        }
        System.out.println("Produsul nu a fost gasit.");
    }

    /**
     * Metoda statica care modifica cantitatea unui produs pe baza numelui.
     *
     * @param container Containerul care conține produsele.
     * @param nume      Numele produsului.
     * @param cantitate Noua cantitate.
     */
    public static void modificaCantitateaProdus(Container container, String nume, int cantitate) {
        for (int i = 0; i < container.numarProduse; i++) {
            if (container.produse[i].getNume().equals(nume)) {
                container.produse[i].setCantitate(cantitate);
                return;
            }
        }
        System.out.println("Produsul nu a fost gasit.");
    }

    /**
     * Metoda care calculeaza pretul total al produselor din container.
     *
     * @return Pretul total.
     */
    public double calculeazaPretTotal() {
        double pretTotal = 0;
        for (int i = 0; i < numarProduse; i++) {
            pretTotal += produse[i].getPret() * produse[i].getCantitate();
        }
        return pretTotal;
    }

    /**
     * Afiseaza toate produsele din container.
     */
    public void afisareProduse() {
        for (int i = 0; i < numarProduse; i++) {
            produse[i].afisareProdus();
        }
    }

    public String getIdentificator() {
        return identificator;
    }

    public int getNumarProduse() {
        return numarProduse;
    }

    public Produs[] getProduse() {
        return produse;
    }
}
