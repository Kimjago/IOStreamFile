package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiriStreamdanFile {

    // No 1 
    static void cekBerkas() {
        File berkas = new File("laporan.txt");
        if (berkas.exists()) {
            System.out.println("Berkas laporan.txt ada.");
            System.out.println("Ukuran: " + berkas.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }
    }

    // No 2
    static void buatFolder() {
        File folder = new File("arsip");
        if (folder.mkdir()) {
            System.out.println("Folder 'arsip' berhasil dibuat.");
        } else {
            System.out.println("Gagal membuat folder. Mungkin sudah ada sebelumnya.");
        }
    }

    // No. 3 
    static void buatLaluHapus() {
        File berkas = new File("sementara.txt");
        try {
            berkas.createNewFile();
            System.out.println("Sebelum dihapus, ada? " + berkas.exists());
            berkas.delete();
            System.out.println("Sesudah dihapus, ada? " + berkas.exists());
        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== No. 1: Cek Berkas ===");
        cekBerkas();

        System.out.println("\n=== No. 2: Buat Folder ===");
        buatFolder();

        System.out.println("\n=== No. 3: Buat & Hapus Berkas ===");
        buatLaluHapus();
    }
}