package bagian3.kontak;

public class LatihanMandiriMultiClass {
    public static void main(String[] args) {

        BukuKontak buku = new BukuKontak("kontak.txt");

        // SOAL 2: constructor sekarang 3 parameter (nama, nomor, email)
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@email.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@email.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@email.com"));
        buku.tampilkanSemua();
        buku.simpanKeBerkas();

        System.out.println();

        // SOAL 1: uji cariKontak
        System.out.println("=== Cari Kontak ===");
        buku.cariKontak("Budi");
        buku.cariKontak("Dodi"); // tidak ada

        System.out.println();

        // SOAL 3: uji hapusKontak
        System.out.println("=== Hapus Kontak ===");
        buku.hapusKontak("Andi");

        System.out.println();

        // Muat ulang dari berkas untuk membuktikan data tersimpan
        System.out.println("=== Muat Ulang dari Berkas ===");
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
    }
}