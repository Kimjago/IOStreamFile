// Nama  : Muhammad Adit Syahputra
// NPM   : 2410010122

package tugas;

public class MainTugas {
    public static void main(String[] args) {

        
        String[] kategori = {"Elektronik", "Makanan & Minuman", "Peralatan Rumah"};
        System.out.println("=== Kategori Barang ===");
        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        
        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("Laptop",     8500000, 10));
        gudang.tambahBarang(new Barang("Mouse",       150000, 25));
        gudang.tambahBarang(new Barang("Mie Instan",    3500, 100));
        gudang.tambahBarang(new Barang("Sapu",          25000, 15));
        gudang.tambahBarang(new Barang("Keyboard",    350000, 20));

        
        gudang.tampilkanSemua();
        gudang.simpanKeBerkas();

        System.out.println();

        
        System.out.println("=== Muat Ulang dari Berkas ===");
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();

        System.out.println();
        System.out.println("Total Nilai Persediaan: Rp" + gudangBaru.totalNilai());
    }
}