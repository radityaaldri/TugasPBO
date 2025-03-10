/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanRumah;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USer
 */
public class OperasiMatriks
{
      public static void main(String[] args) {
        int M[][], N[][];
        int bm, km, bn, kn;
        int menu;
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        char ulang = ' ';
        
        do {
           
            System.out.println("=====Operasi Matriks=====");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Identitas");
            System.out.println("5. Transpose");
            System.out.println("6. Exit");
            System.out.println("Pilih program yang ingin dijalankan: ");
            menu = in.nextInt();

            if(menu > 0 && menu < 6)
            {
                System.out.print("Masukkan baris array M: ");
                bm = in.nextInt();
                System.out.print("Masukkan kolom array M: ");
                km = in.nextInt();
                System.out.print("Masukkan baris array N: ");
                bn = in.nextInt();
                System.out.print("Masukkan kolom array N: ");
                kn = in.nextInt();

                M = new int[bm][km];
                N = new int[bn][kn];

                int i, j, k;
                System.out.println("Matriks M: ");
                for(i = 0; i < bm; i++) {
                    for(j = 0; j < km; j++) {
                        M[i][j] = rand.nextInt(10) + 1;
                        System.out.print(M[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();

                System.out.println("Matriks N: ");
                for(i = 0; i < bn; i++) {
                    for(j = 0; j < kn; j++) {
                        N[i][j] = rand.nextInt(10) + 1;
                        System.out.print(N[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
                
                switch(menu) {
                    case 1:
                    {
                        if(bm == bn && km == kn)
                        {
                            int Tambah[][];
                            Tambah = new int[bm][km];

                            System.out.println("Hasil : ");
                            for(i = 0; i < bm; i++) {
                                for(j = 0; j < km; j++) {
                                    Tambah[i][j] = M[i][j] + N[i][j];
                                    System.out.print(Tambah[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }
                        else
                        {
                            System.out.println("Input Invalid");
                        }
                    }
                    case 2:
                    {
                        if(bm == bn && km == kn)
                        {
                            int Kurang[][];
                            Kurang = new int[bm][km];

                            System.out.println("Hasil : ");
                            for(i = 0; i < bm; i++) {
                                for(j = 0; j < km; j++) {
                                    Kurang[i][j] = M[i][j] - N[i][j];
                                    System.out.print(Kurang[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }
                        else
                        {
                            System.out.println("Input Invalid");
                        }
                    }
                    case 3:
                    {
                        if(bm == kn)
                        {
                            int Kali[][];
                            Kali = new int[bm][kn];

                            System.out.println("Hasil : ");
                            for (i = 0; i < bm; i++) {
                                for (j = 0; j < km; j++) {
                                    for (k = 0; k < kn; k++) {
                                        Kali[i][j] += M[i][k] * N[k][j];
                                    }
                                    System.out.print(Kali[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }
                        else
                        {
                            System.out.println("Invalid, Baris array M harus sama dengan kolom array N");
                        }
                    }
                    case 4: {
                        int IdentitasM[][], IdentitasN[][];
                        IdentitasM = new int[bm][km];
                        IdentitasN = new int[bn][kn];

                        if(bm != km) {
                            System.out.println("Hasil matriks identitas N: ");
                            for(i = 0; i < bn; i++) {
                                for(j = 0; j < kn; j++) {
                                    if(i == j)
                                        IdentitasN[i][j] = 1;
                                    else
                                        IdentitasN[i][j] = 0;
                                    System.out.print(N[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();

                            System.out.println("array M tidak bisa dibuat dalam bentuk identitas karena matriks tidak berbentuk persegi");
                        }
                        else if(bn != kn) {
                            System.out.println("Hasil matriks identitas M: ");
                            for(i = 0; i < bm; i++) {
                                for(j = 0; j < km; j++) {
                                    if(i == j)
                                        IdentitasM[i][j] = 1;
                                    else
                                        IdentitasM[i][j] = 0;
                                    System.out.print(M[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();

                            System.out.println("array N tidak bisa dibuat dalam bentuk identitas karena matriks tidak berbentuk persegi");                     }else {
                            System.out.println("Hasil matriks identitas M: ");
                            for(i = 0; i < bm; i++) {
                                for(j = 0; j < km; j++) {
                                    if(i == j)
                                        IdentitasM[i][j] = 1;
                                    else
                                        IdentitasM[i][j] = 0;
                                    System.out.print(IdentitasM[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();

                            System.out.println("Hasil matriks identitas N: ");
                            for(i = 0; i < bn; i++) {
                                for(j = 0; j < kn; j++) {
                                    if(i == j)
                                        IdentitasN[i][j] = 1;
                                    else
                                        IdentitasN[i][j] = 0;
                                    System.out.print(IdentitasN[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }
                    }
                    case 5: {
                        int TransposeM[][], TransposeN[][];
                        TransposeM = new int[km][bm];
                        TransposeN = new int[kn][bn];

                        System.out.println("Hasil transpose matriks M: ");
                        for(i = 0; i < bm; i++) {
                            for(j = 0; j < km; j++) {
                                TransposeM[j][i] = M[i][j];
                            }
                        }
                        
                        for(i = 0; i < km; i++) { 
                            for(j = 0; j < bm; j++) { 
                                System.out.print(TransposeM[i][j] + "\t"); 
                            }
                            System.out.println();
                        }
                        System.out.println();
                        
                        System.out.println("Hasil transpose matriks N: ");
                        for(i = 0; i < bn; i++) {
                            for(j = 0; j < kn; j++) {
                                TransposeN[j][i] = N[i][j];
                            }
                        }
                        
                        for(i = 0; i < kn; i++) { 
                            for(j = 0; j < bn; j++) { 
                                System.out.print(TransposeN[i][j] + "\t"); 
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                }
            System.out.print("Apakah ingin mengulang program? (y/n) ");
            ulang = in.next().charAt(0);
            }
            else if(menu == 6) {
                ulang = 'n';
                System.out.print("Anda telah keluar dari program");
            }else {
                System.out.println("Pilihan tidak ada di menu");
                System.out.print("Apakah ingin mengulang program? (y/n) ");
                ulang = in.next().charAt(0); 
            }
        }while(ulang == 'y');
    }
}
