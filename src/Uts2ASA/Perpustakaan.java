package Uts2ASA;

public class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku berhasil ditambahkan.");
        } else {
            System.out.println("Kapasitas perpustakaan penuh. Tidak dapat menambahkan buku.");
        }
    }

    public boolean hapusBuku(int idBuku) {
        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarBuku[i].getId() == idBuku) {
                for (int j = i; j < jumlahBuku - 1; j++) {
                    daftarBuku[j] = daftarBuku[j + 1];
                }
                jumlahBuku--;
                return true;
            }
        }
        return false;
    }

    public void cariBuku(String judul) {
        boolean found = false;
        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarBuku[i].getJudul().equalsIgnoreCase(judul)) {
                System.out.println("Buku ditemukan:");
                System.out.println(daftarBuku[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    public void cetakDaftarBuku() {
        System.out.println("Daftar Buku:");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println(daftarBuku[i]);
        }
    }

    public int jumlahBuku() {
        return jumlahBuku;
    }

    public boolean isEmpty() {
        return jumlahBuku == 0;
    }
}
