/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanRumah;

import java.util.Scanner;

/**
 *
 * @author USer
 */
public class Susu
{
     public static void main(String[] args) {
        int menu, x = 0, y = 0, z = 0;
        long totalHarga = 0, Harga = 0;
        float diskon = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Daftar Susu");
        System.out.println("==========================");
        System.out.println("1.  X     Rp 40.000  ");
        System.out.println("2.  Y     Rp 50.000  ");
        System.out.println("3.  Z     Rp 60.000  ");

        System.out.print("Pilih merek yang ingin dibeli (1/2/3): ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Jumlah: ");
                    x = in.nextInt();
                    Harga += x * 40000;
                    if (x >= 3) {
                        diskon = (float) 0.1 * Harga ;
                        totalHarga = (long) (Harga - diskon);
                    } else {
                        
                        totalHarga += x * 40000;
                    }
                    break;
                case 2:
                    System.out.print("Masukkan Jumlah: ");
                    y = in.nextInt();
                    Harga += y * 50000;
                    if (y > 3) {
                        diskon = (float) 0.12 * Harga ;
                        totalHarga = (long) (Harga - diskon);
                    } else {
                        totalHarga += y * 50000;
                    }
                    break;
                case 3:
                    System.out.print("Masukkan Jumlah: ");
                    z = in.nextInt();
                    Harga += z * 60000;
                    if (z > 1) {
                        diskon = (float) 0.15 * (Harga - 60000);
                        totalHarga = (long) (Harga - diskon);
                    } else {
                        totalHarga += z * 60000;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan pilih 1, 2, atau 3.");
            }
            
            System.out.println("Harga Awal : Rp. " + Harga + ",- ");
            System.out.println("Diskon Belanja Anda : Rp. " + diskon + ",- ");
            System.out.println("Total Harga: Rp. " + totalHarga + ",- ");
            System.out.println("\nTerima kasih telah berbelanja!");
        }
}
