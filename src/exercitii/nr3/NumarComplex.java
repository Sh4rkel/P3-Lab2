package exercitii.nr3;

/**
 * <h1>Suma a doua numere complexe</h1>
 * @author Daniel Filip
 * @since 10.13.2024 (mm/dd/yyyy)
 * Clasa NumarComplex reprezintă un număr complex.
 */
public class NumarComplex {
    double parteReala;
    double parteImaginara;

    /**
     * Constructor pentru crearea unui numar complex.
     *
     * @param parteReala      partea reala a numarului complex
     * @param parteImaginara  partea imaginara a numarului complex
     */
    public NumarComplex(double parteReala, double parteImaginara) {
        this.parteReala = parteReala;
        this.parteImaginara = parteImaginara;
    }

    /**
     * Metoda care returneaza modulul numarului complex.
     *
     * @return modulul numarului complex
     */
    public double modul() {
        return Math.sqrt(Math.pow(parteReala, 2) + Math.pow(parteImaginara, 2));
    }

    /**
     * Metoda care returneaza suma a doua numere complexe.
     * @param altNumarComplex numarul complex cu care se aduna
     * @return suma a doua numere complexe
     */
    public NumarComplex suma(NumarComplex altNumarComplex) {
        return new NumarComplex(this.parteReala + altNumarComplex.parteReala,
                this.parteImaginara + altNumarComplex.parteImaginara);
    }

    /**
     * Metoda care returneaza produsul a doua numere complexe.
     *
     * @param altNumarComplex numarul complex cu care se inmultește
     * @return produsul a doua numere complexe
     */
    public NumarComplex produs(NumarComplex altNumarComplex) {
        double parteRealaProdus = this.parteReala * altNumarComplex.parteReala
                - this.parteImaginara * altNumarComplex.parteImaginara;
        double parteImaginaraProdus = this.parteReala * altNumarComplex.parteImaginara
                + this.parteImaginara * altNumarComplex.parteReala;
        return new NumarComplex(parteRealaProdus, parteImaginaraProdus);
    }

    /**
     * Metoda pentru a afisa numarul complex sub forma de string.
     *
     * @return o reprezentare sub forma de string a numarului complex
     */
    @Override
    public String toString() {
        return parteReala + (parteImaginara >= 0 ? "+" : "") + parteImaginara + "i";
    }
}