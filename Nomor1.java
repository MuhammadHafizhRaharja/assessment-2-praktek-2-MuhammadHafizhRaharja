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
        int N = input.nextInt();

        // Pekerjaan anda mulai dari sini
        printFizzBuzz(N);
        // Pekerjaan anda berakhir sini

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
}
