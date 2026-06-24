package data;

public class Kategori {

    private String id;
    private String nama;

   public Kategori(String id, String nama) {
    this.id = id;
    this.nama = nama;
}

    public String getNama() {
        return nama;
    }
}