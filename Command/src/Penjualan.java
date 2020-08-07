public class Penjualan implements Pemesanan{
    private Stok stokMeja;

    public Penjualan(Stok stokMeja){
        this.stokMeja = stokMeja;
    }

    public void execute() {
        stokMeja.sell();
    }
}
