// package: berbeda, bukan subclass - class Main

import base.Produk; //import class Produk dari package elektronik

public class Main {
    public static void main(String[] args) {
        Produk P = new Produk("Indomie Goreng", 3500, 100, "Makanan");


        System.out.println(P.stok); //public - boleh
        System.out.println(P.harga); // ERROR - protected, bukan subclass
        System.out.println(P.kategori); //ERROR - default, beda package
        System.out.println(P.nama); //ERROR - private

        P.tampilkanInfo();
    }
}
