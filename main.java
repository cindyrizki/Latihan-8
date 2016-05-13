/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        angka a1 = new angka();
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        double a = x.nextDouble();
        if(a/1 != (int)a){
            a1.methodD1();
        }else{
            a1.methodI1();
        }
    }
}
