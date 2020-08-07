public class CommandPatternDemo {
    public static void main(String[] args) {
        Stok stokMeja = new Stok();

        Pembelian pembelian = new Pembelian(stokMeja);
        Penjualan penjualan = new Penjualan(stokMeja);

        Broker broker = new Broker();
        broker.ambilPesanan(pembelian);
        broker.ambilPesanan(penjualan);

        broker.menempatkanPesanan();
    }
}