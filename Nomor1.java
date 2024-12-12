import java.util.Scanner;

// Nomor 1: FizzBuzz
public class Nomor1 {

    // Prosedur untuk mencetak deret FizzBuzz
    public static void printFizzBuzz(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Pindah baris setelah mencetak deret
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt(); // Menerima input dari pengguna

        // Panggil prosedur printFizzBuzz untuk menampilkan deret
        printFizzBuzz(N);

        input.close(); // Menutup scanner setelah selesai
    }
}
