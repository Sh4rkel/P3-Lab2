package exercitii.nr3;

/**
 * @author Daniel Filip
 * @since 10.13.2024 (mm/dd/yyyy)
 * Clasa Test demonstreaza funcționalitatile clasei NumarComplex.
 */

public class Test {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        NumarComplex numar1 = new NumarComplex(3, 4);
        NumarComplex numar2 = new NumarComplex(1, -2);

        // Afisarea numerelor complexe
        System.out.println("Numarul 1: " + numar1);
        System.out.println("Numarul 2: " + numar2);

        // Calculul modulului
        System.out.println("Modulul numarului 1: " + numar1.modul());
        System.out.println("Modulul numarului 2: " + numar2.modul());

        // Calculul sumei
        NumarComplex suma = numar1.suma(numar2);
        System.out.println("Suma: " + suma);

        // Calculul produsului
        NumarComplex produs = numar1.produs(numar2);
        System.out.println("Produsul: " + produs);
    }
}

