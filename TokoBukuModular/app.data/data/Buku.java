package data;

public class Buku {

    private String id;
    private String judul;
    private double harga;
    private int stok;
    private Kategori kategori;

    public Buku(
            String id,
            String judul,
            double harga,
            int stok,
            Kategori kategori) {

        this.id = id;
        this.judul = judul;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public Kategori getKategori() {
        return kategori;
    }
}