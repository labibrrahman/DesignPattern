import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Pemesanan> pemesananList = new ArrayList<Pemesanan>();

    public void ambilPesanan(Pemesanan pemesanan){
        pemesananList.add(pemesanan);
    }

    public void menempatkanPesanan(){

        for (Pemesanan pemesanan : pemesananList) {
            pemesanan.execute();
        }
        pemesananList.clear();
    }
}
