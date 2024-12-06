
import java.text.NumberFormat;
import java.util.Scanner;

public class mudah1 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Selamat datang di aplikasi toko online");
        System.out.println("Masukkan total belanja yang kamu lakukan (dalam rupiah) : ");
        int totalBelanja = i.nextInt();
        int diskon = 0;

        int totalHarga = 0;

        if (totalBelanja >= 100000) { // jika pengguna melakukan transaksi antara 100-200k maka diskon 10%
            totalHarga += totalBelanja; // Set harga ke totalBelanja pengguna
            diskon += totalHarga * 0.1; // Menghitung diskon
            totalHarga -= diskon; // Mengurangi harga dengan diskon
        } else if (totalBelanja > 200000) { // jika pengguna melakukan transaksi diatas 200k maka diskon 20%
            totalHarga += totalBelanja; // Set harga ke totalBelanja pengguna
            diskon += totalHarga * 0.2; // Menghitung diskon
            totalHarga -= diskon; // Mengurangi harga dengan diskon
        } else {
            totalHarga += totalBelanja; // Set harga ke totalBelanja pengguna
        }

        NumberFormat formatKurensi = NumberFormat.getNumberInstance();
        // System.out.printf("Harga : %s %n", formatKurensi.format(totalHarga));

        System.out.println("Total belanja kamu adalah : " + totalBelanja);
        System.out.println("Total belanja yang harus kamu bayarkan adalah : " + formatKurensi.format(totalHarga) + " Dengan diskon : " + diskon);
    }
}
