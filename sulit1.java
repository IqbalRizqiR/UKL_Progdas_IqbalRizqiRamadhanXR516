
import java.util.Scanner;

public class sulit1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxFrek = 0;
        int frekuensi = 0;
        int indks = 0;

        System.out.println("Selamat datang di aplikasi rekap absen");
        int[] hadirSiswa;
        int jumlahSiswa = 0;
        double totalHadir = 0.0;
        double rataRata = 0.0;

        System.out.println("Masukkan jumlah siswa : ");
        jumlahSiswa = input.nextInt();

        hadirSiswa = new int[jumlahSiswa];

        for (int i = 0; i < hadirSiswa.length; i++) {
            System.out.println("Masukkan jumlah hadir siswa ke-" + (i + 1) + " : ");
            hadirSiswa[i] = input.nextInt();
            totalHadir += hadirSiswa[i];
        }

        System.out.println("Rekap kehadiran siswa selama 1 bulan (..hari kerja) : ");
        for (int j = 0; j < hadirSiswa.length; j++) {
            System.out.println("Siswa ke-" + (j + 1) + " : " + hadirSiswa[j] + " hari hadir");
        }
        rataRata = totalHadir / jumlahSiswa;
        System.out.println("Rata Rata kehadiran siswa : " + rataRata);

        System.out.println("Kesimpulan : ");
        System.out.println("- Siswa yang kehadirannya di bawah rata rata: ");
        for (int i = 0; i < hadirSiswa.length; i++) {
            for (int j = 0; j < hadirSiswa.length; j++) {
                if (hadirSiswa[i] == hadirSiswa[j]) {
                    frekuensi++;
                }
            }

            if (frekuensi > maxFrek) {
                maxFrek = frekuensi;
                indks = i;
            }

        }
        System.out.println("    - Siswa ke-" + (indks + 1) + " : " + hadirSiswa[indks] + " hari hadir");
    }
}
