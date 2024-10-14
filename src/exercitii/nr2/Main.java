package exercitii.nr2;

/**
 * @author Daniel Filip
 * @since 10.13.2024 (mm/dd/yyyy)
 */

public class Main {

    /**
     *  Metoda pentru a crea și afisa un tablou de containere.
     *  Asta se cere la subpunctul e) din cerinte.
     */

    public static void main(String[] args) {
        // a) Creare obiect de tip container
        Produs produs1 = new Produs("Laptop", 3000, 5);
        Produs produs2 = new Produs("Telefon", 1000, 10);
        Produs produs3 = new Produs("Monitor", 700, 8);

        Container container1 = new Container("Container 1", 10);
        container1.adaugaProdus(produs1);
        container1.adaugaProdus(produs2);

        Container container2 = new Container("Container 2", 10);
        container2.adaugaProdus(produs3);

        // f) Creare si afisare tabloului de containere
        Container[] containere = {container1, container2};

        // Afisam toate produsele din fiecare container
        for (Container container : containere) {
            System.out.println("Produsele din " + container.getIdentificator() + ":");
            container.afisareProduse();
        }

        // c) Modificam cantitatea unui produs pe baza numelui (exemplu)
        Container.modificaCantitateaProdus(container1, "Laptop", 3);
        System.out.println("Cantitatea de Laptop după modificare:");
        container1.afisareProduse();

        // d) Calculam si afisam pretul total al produselor din container1
        System.out.println("Prețul total al produselor din " + container1.getIdentificator() + ": " + container1.calculeazaPretTotal());
    }
}
