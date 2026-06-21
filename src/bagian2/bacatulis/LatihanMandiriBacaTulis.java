package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LatihanMandiriBacaTulis {

    public static void main(String[] args) {

        //No 1
        System.out.println("=== SOAL 1: Tulis & Baca ===");
        String[] limaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            for (String h : limaHari) {
                penulis.println(h);
            }
            System.out.println("5 nama hari berhasil ditulis ke hari.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        //No 2
        System.out.println("\n=== SOAL 2: Append & Tampilkan Semua ===");

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("2 nama hari ditambahkan tanpa menghapus data lama.");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        //No 3
        System.out.println("\n=== SOAL 3: Hitung Jumlah Baris ===");
        int jumlah = 0;

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca.readLine() != null) {
                jumlah++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        System.out.println("Jumlah baris dalam hari.txt: " + jumlah);
    }
}