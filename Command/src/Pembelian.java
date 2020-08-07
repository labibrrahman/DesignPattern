public class Pembelian implements Pemesanan{
    private Stok stokMeja;

    public Pembelian(Stok stokMeja){
        this.stokMeja = stokMeja;
    }

    public void execute() {
        stokMeja.buy();
    }
}
