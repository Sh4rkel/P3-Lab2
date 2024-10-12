package tema2.ex1;

import java.util.Arrays;

public class Main {
    /**
     *  Aceasta functie are scopul de a crea cateva clase, subpunctul a) de la tema de la laboratorul 2,
     *  nimic important in rest
     * @param args
     */
    public static void main(String[] args) {
        Mobila mobila1 = new Mobila("Scaun", "Scaun din lemn de stejar", "Lemn", 50, 50, 100, 150);
        Mobila mobila2 = new Mobila("Masa", "Masa din sticla", "Sticla", 200, 100, 75, 300);
        Mobila mobila3 = new Mobila("Dulap", "Dulap din MDF", "MDF", 100, 50, 200, 400);

        MagazinMobilier magazin1 = new MagazinMobilier("Jysk", "Strada Libertatii", Arrays.asList(mobila1, mobila2));
        MagazinMobilier magazin2 = new MagazinMobilier("Dedeman", "Strada Independentei", Arrays.asList(mobila3));

        MagazinMobilier[] magazine = {magazin1, magazin2};
        System.out.println(MagazinMobilier.magazinCuCeleMaiIeftineMobile(magazine));
    }
}
