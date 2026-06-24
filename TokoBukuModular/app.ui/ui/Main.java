package ui;

import logic.BukuDTO;
import logic.TransaksiService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input =
                new Scanner(System.in);

        TransaksiService service =
                new TransaksiService();

        int pilih;

        do {

            System.out.println();
            System.out.println("================================");
            System.out.println("      TOKO BUKU DIGITAL");
            System.out.println("================================");
            System.out.println("1. Lihat Buku");
            System.out.println("2. Beli Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");

            pilih = input.nextInt();

            switch (pilih){

                case 1:

                    List<BukuDTO> daftar =
                            service.getSemuaBuku();

                    System.out.println();
                    System.out.println("DAFTAR BUKU");

                    for(BukuDTO buku :
                            daftar){

                        System.out.println(
                                buku.getId()
                                + " | "
                                + buku.getJudul()
                                + " | Rp"
                                + buku.getHarga()
                                + " | Stok "
                                + buku.getStok()
                                + " | "
                                + buku.getKategori());
                    }

                    break;

                case 2:

                    System.out.print(
                            "ID Buku : ");

                    String id =
                            input.next();

                    System.out.print(
                            "Jumlah : ");

                    int jumlah =
                            input.nextInt();

                    if(service.cekStok(
                            id,
                            jumlah)) {

                        double total =
                                service.beliBuku(
                                        id,
                                        jumlah);

                        System.out.println(
                                "Pembelian Berhasil");

                        System.out.println(
                                "Total Bayar : Rp"
                                        + total);

                    } else {

                        System.out.println(
                                "Stok Tidak Cukup");
                    }

                    break;

                case 3:

                    System.out.println(
                            "Terima Kasih");
                    break;

                default:

                    System.out.println(
                            "Menu Tidak Ada");
            }

        } while (pilih != 3);

        input.close();
    }
}