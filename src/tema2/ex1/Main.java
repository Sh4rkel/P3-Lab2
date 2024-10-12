package tema2.ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     *  Aceasta functie are scopul de a crea cateva clase, subpunctul a) de la tema de la laboratorul 2,
     *  nimic important in rest
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Am creat niste magazine si obiecte de mobilier oarecare, nimic iesit din comun sau prea creativ de aceasta data
         */
        Mobila mobila1 = new Mobila("Scaun", "Scaun din lemn de stejar", "Lemn", 50, 50, 100, 150);
        Mobila mobila2 = new Mobila("Masa", "Masa din sticla", "Sticla", 200, 100, 75, 300);
        Mobila mobila3 = new Mobila("Dulap", "Dulap din MDF", "MDF", 100, 50, 200, 400);

        MagazinMobilier magazin1 = new MagazinMobilier("Jysk", "Strada Libertatii", Arrays.asList(mobila1, mobila2));
        MagazinMobilier magazin2 = new MagazinMobilier("Dedeman", "Strada Independentei", Arrays.asList(mobila3));

        MagazinMobilier[] magazine = {magazin1, magazin2};

        /**
         * Gasim magazinul cu cele mai ieftine obiecte de mobilier folosindu-ne de functia magazinCuCeleMaiIeftineMobile din clasa MagazinMobilier,
         * am dat nume foarte specifice claselor si functiilor pentru o intelegere mult mai usoara a codului
         */
        String numeMagazinIeftin = MagazinMobilier.testMagazinCuCeleMaiIeftinMobilier(magazine);
        System.out.println("Magazinul cu cele mai ieftine obiecte de mobilier este: " + numeMagazinIeftin);

        /**
         * Definim o lista de cuvinte pentru cautare în descrierile obiectelor de mobilier, am ales sa folosesc si structura de date List
         * doar pentru a ma familiariza cu ea, puteam folosi lejer si un simplu Array
         */
        List<String> cuvinteCautare = Arrays.asList("lemn", "sticla");

        /**
         * Cautam cate obiecte de mobilier din fiecare magazin contin toate cuvintele din lista de cautare
         * Am folosit doar de test cuvintele lemn si sticla, exact ca in testele unitare, in mod normal acestea sunt cerute utilizatorului,
         * dar merge pentru o simpla exemplificare :)
         */
        for (MagazinMobilier magazin : magazine) {
            int numarMobile = magazin.NumaraObiecteDeMobilierCuDescriere(cuvinteCautare);
            System.out.println("Magazinul " + magazin.getNume() + " are " + numarMobile +
                    " obiecte de mobilier care contin toate cuvintele 'lemn' si 'sticla' în descriere.");
        }
    }
}
