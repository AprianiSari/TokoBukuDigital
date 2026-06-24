package logic;

public class BukuDTO {

    private String id;
    private String judul;
    private double harga;
    private int stok;
    private String kategori;

    public BukuDTO(
            String id,
            String judul,
            double harga,
            int stok,
            String kategori) {

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

    public String getKategori() {
        return kategori;
    }
}