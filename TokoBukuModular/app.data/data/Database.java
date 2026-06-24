package data;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static final List<Buku> daftarBuku =
            new ArrayList<>();

    static {

        Kategori novel =
                new Kategori("N001", "Novel");

        Kategori teknologi =
                new Kategori("BT001", "Teknologi");

        Kategori pendidikan =
                new Kategori("BT002", "Pendidikan");

        daftarBuku.add(
                new Buku(
                        "N001",
                        "Laskar Pelangi",
                        85000,
                        10,
                        novel));

        daftarBuku.add(
                new Buku(
                        "BT001",
                        "Java Programming",
                        120000,
                        13,
                        teknologi));

        daftarBuku.add(
                new Buku(
                        "BT002",
                        "Bahasa Inggris",
                        95000,
                        9,
                        pendidikan));
    }

    public static List<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public static Buku cariBuku(String id) {

        for (Buku buku : daftarBuku) {

            if (buku.getId().equalsIgnoreCase(id)) {
                return buku;
            }
        }

        return null;
    }
}