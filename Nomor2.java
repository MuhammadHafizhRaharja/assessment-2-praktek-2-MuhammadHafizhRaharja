import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> belanja = new ArrayList<>();
        int[] hargaBuku = {350000, 450000, 500000, 95000};
        String[] daftarBuku = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};

        System.out.println("Daftar Buku:");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println((i + 1) + ". " + daftarBuku[i] + " " + hargaBuku[i]);
        }

        char lagi;
        do {
            System.out.print("Masukan pilihan buku [1/2/3/4]: ");
            int pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                belanja.add(hargaBuku[pilihan - 1]);
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Input lagi (Y/N)?: ");
            lagi = input.next().charAt(0);
        } while (lagi == 'Y' || lagi == 'y');

        int totalHarga = hitungTotalHarga(belanja);
        int voucher = hitungVoucher(totalHarga);

        System.out.println("Total voucher belanja = " + voucher);
        System.out.println("Total yang harus dibayar = " + totalHarga);
    }

    public static int hitungTotalHarga(ArrayList<Integer> belanja) {
        int total = 0;
        for (int harga : belanja) {
            total += harga;
        }
        return total;
    }

    public static int hitungVoucher(int totalHarga) {
        if (totalHarga < 200000) {
            return 0;
        } else if (totalHarga <= 500000) {
            return 50000;
        } else if (totalHarga <= 750000) {
            return 100000;
        } else if (totalHarga <= 1000000) {
            return 150000;
        } else {
            return 200000;
        }
    }
}
