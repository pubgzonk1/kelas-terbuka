package com.tutorial;

class Barang {
    String kdbarang;
    String nmbarang;
    String tglmasuk;
    int jumlah;
    int harga;
    
    Barang (String inputkdbarang,String inputnmbarang, String inputtglmasuk, int inputjumlah, int inputharga ){
        kdbarang = inputkdbarang;
        nmbarang = inputnmbarang;
        tglmasuk = inputtglmasuk;
        jumlah = inputjumlah;
        harga = inputharga;

        System.out.println(kdbarang);
        System.out.println(nmbarang);
        System.out.println(tglmasuk);
        System.out.println(jumlah);
        System.out.println(inputharga);
    }
}
    
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Barang barang1 = new Barang("K001", "Chockelat Keju", "12-10-2022", 8,25000);
        Barang barang2 = new Barang("K002", "Martabak Keju", "12-10-2022", 8,28000);
        Barang barang3 = new Barang("K003", "Pisang Keju", "12-10-2022", 8,29000);
    }
    
}