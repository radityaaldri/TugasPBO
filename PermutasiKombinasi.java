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
public class PermutasiKombinasi
{
    public static void main(String[] args) {
        int n, r;
        Scanner in = new Scanner(System.in);
        
        System.out.println("===== Program Permutasi dan Kombinasi =====");
        System.out.println("n: Banyak unsur");
        System.out.println("r: banyak unsur yang dipermutasikan/dikombinasikan");
        
        System.out.print("Masukkan nilai n: ");
        n = in.nextInt();
        System.out.print("Masukkan nilai r: ");
        r = in.nextInt();
        
        int i;
        int n2 = 1;
        for (i = n; i > 0; i--) {
            n2 *= i;
        }
        
        int r2 = 1;
        for (i = r; i > 0; i--) {
            r2 *= i;
        }
        
        int nr = n - r;
        int nr2 = 1;
        for (i = nr; i > 0; i--) {
            nr2 *= i;
        }
        
        System.out.println("Maka, hasil permutasi adalah " + n2 / nr2);
        System.out.println("Maka, hasil kombinasi adalah " + n2 / (r2 * nr2));
    }
}
