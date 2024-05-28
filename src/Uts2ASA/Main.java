package Uts2ASA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kapasitas perpustakaan: ");
        int kapasitas = scanner.nextInt();
        scanner.nextLine();

        Perpustakaan perpustakaan = new Perpustakaan(kapasitas);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n========== Menu ==========");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Tampilkan Daftar Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("\n========== Tambah Buku ==========");
                        System.out.print("ID Buku: ");
                        int idBuku = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Judul Buku: ");
                        String judulBuku = scanner.nextLine();
                        System.out.print("Pengarang: ");
                        String pengarang = scanner.nextLine();
                        System.out.print("Tahun Terbit: ");
                        int tahunTerbit = scanner.nextInt();
                        scanner.nextLine();

                        Buku buku = new Buku(idBuku, judulBuku, pengarang, tahunTerbit);
                        perpustakaan.tambahBuku(buku);
                        break;
                    case 2:
                        System.out.println("\n========== Hapus Buku ==========");
                        System.out.print("ID Buku: ");
                        int idBukuHapus = scanner.nextInt();
                        scanner.nextLine();
                        boolean result = perpustakaan.hapusBuku(idBukuHapus);
                        if (result) {
                            System.out.println("Buku berhasil dihapus.");
                        } else {
                            System.out.println("Buku dengan ID tersebut tidak ditemukan.");
                        }
                        break;
                    case 3:
                        System.out.println("\n========== Cari Buku ==========");
                        System.out.print("Judul Buku: ");
                        String judul = scanner.nextLine();
                        perpustakaan.cariBuku(judul);
                        break;
                    case 4:
                        System.out.println("\n========== Daftar Buku ==========");
                        if (!perpustakaan.isEmpty()) {
                            perpustakaan.cetakDaftarBuku();
                        } else {
                            System.out.println("Daftar buku kosong.");
                        }
                        break;
                    case 0:
                        isRunning = false;
                        System.out.println("\n========== Terima kasih ==========");
                        break;
                    default:
                        System.out.println("Pilihan menu tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
