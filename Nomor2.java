import java.util.ArrayList;
import java.util.Scanner;
public class Nomor2 {

    // Prosedur untuk menghitung total harga buku
    public static int calculateTotal(ArrayList<Integer> prices) {
        int total = 0;
        for (int price : prices) {
            total += price;
        }
        return total;
    }

    // Prosedur untuk menghitung voucher belanja
    public static int calculateVoucher(int total) {
        if (total < 200000) {
            return 0;
        } else if (total <= 500000) {
            return 50000;
        } else if (total <= 750000) {
            return 100000;
        } else if (total <= 1000000) {
            return 150000;
        } else {
            return 200000;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar harga buku
        String[] bookNames = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
        int[] bookPrices = {350000, 450000, 500000, 95000};

         // Tampilkan daftar buku
         System.out.println("Daftar Buku:");
         for (int i = 0; i < bookNames.length; i++) {
             System.out.println((i + 1) + ". " + bookNames[i] + " - " + bookPrices[i]);
         }
 
         ArrayList<Integer> chosenBooks = new ArrayList<>();
 
         // Pekerjaan anda mulai dari sini
         while (true) {
             System.out.print("Masukan pilihan buku [1/2/3/4]: ");
             int choice = input.nextInt();
 
             if (choice >= 1 && choice <= 4) {
                 chosenBooks.add(bookPrices[choice - 1]);
             } else {
                 System.out.println("Pilihan tidak valid, coba lagi.");
                 continue;
             }
 
             System.out.print("Input lagi (Y/N)?: ");
             char more = input.next().charAt(0);
             if (more == 'N' || more == 'n') {
                 break;
             }
         }
 
         // Hitung total harga dan voucher
         int total = calculateTotal(chosenBooks);
         int voucher = calculateVoucher(total);
 
         // Tampilkan hasil
         System.out.println("Total voucher belanja : " + voucher);
         System.out.println("Total yang harus dibayar : " + total);
         // Pekerjaan anda berakhir sini

         System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
