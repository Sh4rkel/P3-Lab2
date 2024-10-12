package tema2.ex1;

/**
 * @author Daniel Filip
 * <h1>Mobila</h1>
 *
 * Clasa Mobila reprezinta o piesa de mobilier cu diverse caracteristici
 */
public class Mobila {
    private String nume;
    private String descriere;
    private String material;
    private double lungime;
    private double latime;
    private double inaltime;
    private double pret;

    /**
     * Constructor pentru crearea unui obiect de tip Mobila
     * @param nume numele mobilei
     * @param descriere descrierea mobilei
     * @param material materialul din care este facuta mobila
     * @param lungime lungimea mobilei
     * @param latime latimea mobilei
     * @param inaltime inaltimea mobilei
     * @param pret pretul mobilei
     */
    public Mobila(String nume, String descriere, String material, double lungime, double latime, double inaltime, double pret) {
        this.nume = nume;
        this.descriere = descriere;
        this.material = material;
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
        this.pret = pret;
    }

    public double getPret() {
        return pret;
    }

    public String getDescriere() {
        return descriere;
    }
}