import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Daftar buku
        String[] buku = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
        int[] harga = {350000, 450000, 500000, 95000};

        // Tampilkan daftar buku
        System.out.println("Daftar Buku:");
        for (int i = 0; i < buku.length; i++) {
            System.out.println((i+1) + ". " + buku[i] + " " + harga[i]);
        }

        // Tampung harga belanja user ke dalam ArrayList
        ArrayList<Integer> belanja = new ArrayList<>();
        while (true) {
            System.out.print("Masukan pilihan buku [1/2/3/4]:");
            int pilihan = input.nextInt();
            belanja.add(harga[pilihan-1]);
            System.out.print("Input lagi (Y/N)?:");
            String lagi = input.next();
            if (lagi.equalsIgnoreCase("N")) {
                break;
            }
        }

        // Hitung total harga buku yang dibeli
        int totalHarga = 0;
        for (int hargaBuku : belanja) {
            totalHarga += hargaBuku;
        }

        // Hitung voucher belanja
        int voucher = 0;
        if (totalHarga >= 200000 && totalHarga < 500000) {
            voucher = 50000;
        } else if (totalHarga >= 500000 && totalHarga < 750000) {
            voucher = 100000;
        } else if (totalHarga >= 750000 && totalHarga < 1000000) {
            voucher = 150000;
        } else if (totalHarga >= 1000000) {
            voucher = 200000;
        }

        // Tampilkan output
        System.out.println("Total voucher belanja = " + voucher);
        System.out.println("Total yang harus dibayar = " + (totalHarga - voucher));

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
