
import java.util.Random;
import java.util.Scanner;

public class sedang3 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Random rand = new Random();
        boolean lanjut = true;
        int hasil = 0;

        System.out.println("Selamat Datang di Kuis Matematika");
        while (lanjut) {
            int num1 = rand.nextInt(100) + 1;  // Bilangan pertama kalkulator acak (1 - 100)
            int num2 = rand.nextInt(99) + 1; // Bilangan kedua kalkulator acak (1 - 99)
            int operators = rand.nextInt(3) + 1; // operator
            String operator = "";

            switch (operators) {
                case 1: // jika bilangan acak yang diberikan operators adalah satu, maka menggunakan operator kali
                    operator = "*";
                    hasil = num1 * num2;
                    break;
                case 2: // jika bilangan acak yang diberikan operators adalah dua, maka menggunakan operator bagi
                    operator = "/";
                    hasil = num1 / num2;
                    break;
                case 3: // jika bilangan acak yang diberikan operators adalah tiga, maka menggunakan operator modulus
                    operator = "%";
                    hasil = num1 % num2;
                    break;
                default:
                    break;
            }
            System.out.println("Soal :  " + num1 + " " + operator + " " + num2 + " = ?");
            System.out.println("Masukkan Jawaban : ");
            int userAnswer = i.nextInt();
            if (userAnswer == hasil) {
                System.out.println("Jawaban Benar");
            } else {
                System.out.println("Jawaban Salah, Jawaban benar adalah " + hasil);
            }
            lanjut = false;
            System.out.println("Apakah anda ingin melanjutkan quiz ? (y/n) ");
            String lanjuts = i.next();
            if (lanjuts.equals("y")) {
                lanjut = true;
            }
        }
        System.out.println("Terimakasih telah mengikuti Quiz");

    }
}
