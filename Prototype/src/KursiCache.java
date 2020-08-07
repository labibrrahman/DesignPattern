import java.util.Hashtable;

public class KursiCache {

    private static Hashtable<String, Kursi> kursiMap  = new Hashtable<String, Kursi>();

    public static Kursi getKursi(String kursiId) {
        Kursi cachedKursi = kursiMap.get(kursiId);
        return (Kursi) cachedKursi.clone();
    }

    public static void loadCache() {
        KursiMakan kursiMakan = new KursiMakan();
        kursiMakan.setId("1");
        kursiMap.put(kursiMakan.getId(), kursiMakan);

        Sofa sofa = new Sofa();
        sofa.setId("2");
        kursiMap.put(sofa.getId(), sofa);

        KursiKerja kursiKerja = new KursiKerja();
        kursiKerja.setId("3");
        kursiMap.put(kursiKerja.getId(), kursiKerja);
    }
}