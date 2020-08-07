public class Sofa extends Kursi {

    public Sofa(){
        type = "Sofa";
    }

    @Override
    public void draw() {
        System.out.println("Inside Sofa::draw() method.");
    }
}