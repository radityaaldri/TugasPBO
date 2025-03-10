/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanRumah;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USer
 */
public class GabunganArray
{
    public static void main(String[] args) {
        int A[], B[], C[];
        int n, m;
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
       
        System.out.print("Masukkan ukuran array A : ");
        n = in.nextInt();
        A = new int[n];
       
        System.out.print("Masukkan ukuran array B: ");
        m = in.nextInt();
        B = new int[m];
       
        int i;
        for(i = 0; i < n; i++) {
            A[i] = rand.nextInt(100)+1;
        }
        
        for(i = 0; i < m; i++) {
            B[i] = rand.nextInt(100)+1;
        }
        
        System.out.println("\narray A : ");
        for(i = 0; i < n; i++) {
            System.out.print(" " + A[i] + " ");
        }
        
        System.out.println("\narray B : ");
        for(i = 0; i < m; i++) {
            System.out.print(" " + B[i] + " ");
        }
        
        C = new int[n + m];
        System.out.println("\narray C : ");
        if(n > m)
        {
            for(i = 0; i < n; i++) 
                System.out.print(" " + A[i] + " ");
            
            for(i = 0; i < m; i++)
                System.out.print(" " + B[i] + " ");
        }
        
        else if(m > n)
        {
            for(i = 0; i < m; i++) 
                System.out.print(" " + B[i] + " ");
            for(i = 0; i < n; i++)
                System.out.print(" " + B[i] + " ");
        }
        
        else
        {
            for(i = 0; i < n; i++) 
                System.out.print(" " + A[i] + " ");
            for(i = 0; i < m; i++)
                System.out.print(" " + B[i] + " ");
            System.out.println("\njika ukuran kedua array sama, maka array pertama berada di awal ");
        }
        System.out.println();
    }
}
