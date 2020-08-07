public class PrototypePatternDemo {
    public static void main(String[] args) {
        KursiCache.loadCache();

        Kursi clonedKursi = (Kursi) KursiCache.getKursi("1");
        System.out.println("Kursi : " + clonedKursi.getType());

        Kursi clonedKursi2 = (Kursi) KursiCache.getKursi("2");
        System.out.println("Kursi : " + clonedKursi2.getType());

        Kursi clonedKursi3 = (Kursi) KursiCache.getKursi("3");
        System.out.println("Kursi : " + clonedKursi3.getType());
    }
}