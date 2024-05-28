package Uts2ASA;

public class Buku implements Comparable {
    private int id;
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(int id, String judul, String pengarang, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    @Override
    public String toString() {
        return "ID: " + id +", Judul: " + judul +", Pengarang: " + pengarang +", Tahun Terbit: " + tahunTerbit;
    }

    @Override
    public int compareTo(Object o) {
        if (this.judul.equals(((Buku) o).judul)) {
            return 0;
        } else {
            return 1;
        }
    }
}
