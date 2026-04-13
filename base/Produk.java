package base;

public class Produk {
    // Atribut produk
    public String nama;
    public String kategori;
    public double harga;
    public int stok;

    // Konstruktor
    public Produk(String nama, double harga, int stok, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Stok : " + stok);
        System.out.println("Kategori : " + kategori);
        System.out.println("-----------");
    }
}
