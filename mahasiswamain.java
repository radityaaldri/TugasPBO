/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum110325;

import java.util.Scanner;

/**
 *
 * @author USer
 */
public class mahasiswamain
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int uts, uas, tugas, quiz;
        String nama;
        long nim;

        System.out.print("MASUKKAN NIM ANDA : ");
        nim = in.nextLong();
        in.nextLine();

        System.out.print("MASUKKAN NAMA ANDA : ");
        nama = in.nextLine();

        System.out.print("NILAI UTS : ");
        uts = in.nextInt();

        System.out.print("NILAI UAS : ");
        uas = in.nextInt();

        System.out.print("NILAI TUGAS : ");
        tugas = in.nextInt();

        System.out.print("NILAI QUIZ : ");
        quiz = in.nextInt();  
        
        mahasiswa mah = new mahasiswa(nim, nama, uts, uas, tugas, quiz);
        mah.tampildata();
        mah.konversi();

        in.close();
    }
}
