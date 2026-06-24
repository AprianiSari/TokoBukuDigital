package logic;

import data.Buku;
import data.Database;

import java.util.ArrayList;
import java.util.List;

public class TransaksiService {

    public List<BukuDTO> getSemuaBuku() {

        List<BukuDTO> hasil =
                new ArrayList<>();

        for(Buku buku :
                Database.getDaftarBuku()) {

            hasil.add(
                    new BukuDTO(
                            buku.getId(),
                            buku.getJudul(),
                            buku.getHarga(),
                            buku.getStok(),
                            buku.getKategori()
                                    .getNama()));
        }

        return hasil;
    }

    public boolean cekStok(
        String id,
        int jumlah) {

    Buku buku =
            Database.cariBuku(id);

    return buku != null &&
            buku.getStok() >= jumlah;
}

    public double beliBuku(
        String id,
        int jumlah) {

        Buku buku =
                Database.cariBuku(id);

        if(buku == null)
            return 0;

        double total =
                buku.getHarga() * jumlah;

        if(total > 100000){
            total *= 0.9;
        }

        buku.setStok(
                buku.getStok() - jumlah);

        return total;
    }
}