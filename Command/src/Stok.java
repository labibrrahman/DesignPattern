public class Stok {

    private String barang = "Meja";
    private int jumlah = 10;

    public void buy(){
        System.out.println("Stok [ Nama Barang: "+barang+" Jumlah: " + jumlah +" ] Membeli");
    }
    public void sell(){
        System.out.println("Stok [ Nama Barang: "+barang+" Jumlah: " + jumlah +" ] Terjual");
    }
}
