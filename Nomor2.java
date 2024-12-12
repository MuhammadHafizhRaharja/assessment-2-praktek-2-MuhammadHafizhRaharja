import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] hargaBuku = {350000, 450000, 500000, 95000};
        ArrayList<Integer> hargaBelanja = new ArrayList<>();

        System.out.println("Daftar Buku:");
        for (int i = 0; i < hargaBuku.length; i++) {
            System.out.println((i + 1) + ". " + getNamaBuku(i) + " " + hargaBuku[i]);
        }

        while (true) {
            System.out.print("Masukan pilihan buku [1/2/3/4]:");
            int pilihan = input.nextInt();
            if (pilihan < 1 || pilihan > 4) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                continue;
            }
            hargaBelanja.add(hargaBuku[pilihan - 1]);
            System.out.print("Input lagi (Y/N)?:");
            String jawaban = input.next();
            if (jawaban.equalsIgnoreCase("N")) {
                break;
            }
        }

        int totalHarga = hitungTotalHarga(hargaBelanja);
        int voucherBelanja = hitungVoucherBelanja(totalHarga);

        System.out.println("Total voucher belanja = " + voucherBelanja);
        System.out.println("Total yang harus dibayar = " + (totalHarga - voucherBelanja));
    }

    public static String getNamaBuku(int index) {
        String[] namaBuku = {"Sherlock Holmes", "Arsene Lupin", "Game Of Throne", "Psychology Of Money"};
        return namaBuku[index];
    }

    public static int hitungTotalHarga(ArrayList<Integer> hargaBelanja) {
        int totalHarga = 0;
        for (int harga : hargaBelanja) {
            totalHarga += harga;
        }
        return totalHarga;
    }

    public static int hitungVoucherBelanja(int totalHarga) {
        if (totalHarga < 200000) {
            return 0;
        } else if (totalHarga >= 200000 && totalHarga <= 500000) {
            return 50000;
        } else if (totalHarga >= 500000 && totalHarga <= 750000) {
            return 100000;
        } else if (totalHarga >= 750000 && totalHarga <= 1000000) {
            return 150000;
        } else {
            return 200000;
        }
    }
}
