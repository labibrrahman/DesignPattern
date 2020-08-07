public class KursiMakan extends Kursi {

    public KursiMakan(){
        type = "KursiMakan";
    }

    @Override
    public void draw() {
        System.out.println("Inside KursiMakan::draw() method.");
    }
}