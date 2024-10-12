package tema2.ex1;

import java.util.Arrays;
import java.util.List;

/**
 * @author Daniel Filip
 * <h1>Magazin de Mobila</h1>
 * Clasa MagazinMobilier reprezinta un magazin care vinde mobila
 */
public class MagazinMobilier {
    private String nume;
    private String adresa;
    private List<Mobila> mobile;

    public MagazinMobilier() {}

    /**
     * Constructor pentru crearea unui obiect de tip MagazinMobilier
     * @param nume numele magazinului
     * @param adresa adresa magazinului
     * @param mobile lista de mobile disponibile în magazin
     */
    public MagazinMobilier(String nume, String adresa, List<Mobila> mobile) {
        this.nume = nume;
        this.adresa = adresa;
        this.mobile = mobile;
    }

    public String getNume() {
        return nume;
    }

    /**
     * Metoda care returneaza pretul celei mai ieftine mobile din magazin
     * @return pretul celei mai ieftine mobile
     */
    public double getCeaMaiIeftinaMobila() {
        return mobile.stream().mapToDouble(Mobila::getPret).min().orElse(Double.MAX_VALUE);
    }

    /**
     * Metoda care numara cate mobile din magazin contin toate cuvintele din lista de cautare in descriere
     * @param cuvinteCautare lista de cuvinte de cautare
     * @return numarul de mobile care contin toate cuvintele din descriere
     */
    public int NumaraObiecteDeMobilierCuDescriere(List<String> cuvinteCautare) {
        int count = 0;
        for (Mobila mobila : mobile) {
            boolean toateCuvinteleGasite = cuvinteCautare.stream().allMatch(cuvant -> mobila.getDescriere().toLowerCase().contains(cuvant.toLowerCase()));
            if (toateCuvinteleGasite) {
                count++;
            }
        }
        return count;
    }

    /**
     * Metoda care întoarce numele magazinului care contine cele mai ieftine mobile,
     * aceasta metoda este ceruta la subpunctul b)
     * @param magazine un tablou de MagazineMobilier
     * @return numele magazinului cu cele mai ieftine mobile
     */
    public static String testMagazinCuCeleMaiIeftinMobilier(MagazinMobilier[] magazine) {
        String numeMagazin = null;
        double celMaiMicPret = Double.MAX_VALUE;

        for (MagazinMobilier magazin : magazine) {
            double pretMinimMagazin = magazin.getCeaMaiIeftinaMobila();
            if (pretMinimMagazin < celMaiMicPret) {
                celMaiMicPret = pretMinimMagazin;
                numeMagazin = magazin.getNume();
            }
        }
        return numeMagazin;
    }
}