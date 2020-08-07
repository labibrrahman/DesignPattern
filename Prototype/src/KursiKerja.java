public class KursiKerja extends Kursi {

    public KursiKerja(){
        type = "KursiKerja";
    }

    @Override
    public void draw() {
        System.out.println("Inside KursiKerja::draw() method.");
    }
}