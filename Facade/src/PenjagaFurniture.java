public class PenjagaFurniture {
    private MubleShop kursi;
    private MubleShop meja;
    private MubleShop lemari;

    public PenjagaFurniture(){
        kursi= new Kursi();
        meja=new Meja();
        lemari=new Lemari();
    }
    public void KursiSale(){
        kursi.jenis();
        kursi.harga();
    }
    public void MejaSale(){
        meja.jenis();
        meja.harga();
    }
    public void LemariSale(){
        lemari.jenis();
        lemari.harga();
    }
}
