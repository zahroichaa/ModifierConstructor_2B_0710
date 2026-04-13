package toko;

import base.Produk; //import class Produk dari package base

//package : elektronik (berbeda) - subclass dari Produk
class Pemasukan extends Produk {
    protected double totalPemasukan;

    public Pemasukan(String nama, double harga, int stok, String kategori) {
        super(nama, harga, stok, kategori);
        this.totalPemasukan = 0;
    }

    void tambahPemasukan(int jumlah) {
        if (jumlah <= stok) {
            totalPemasukan += jumlah * harga; //protected - boleh, karena Pemasukan adalah subclass dari Produk
            stok -= jumlah; // Update stok setelah penjualan
        } else {
            System.out.println("Stok tidak cukup!");
        }
    }
}