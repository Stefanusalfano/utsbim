/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bmi;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input berat badan dalam kilogram
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        // Meminta input tinggi badan dalam meter
        System.out.print("Masukkan tinggi badan (meter): ");
        double tinggiBadan = input.nextDouble();

        // Menghitung BMI
        double bmi = beratBadan / (tinggiBadan * tinggiBadan);

        // Menampilkan hasil BMI
        System.out.printf("BMI Anda: %.2f\n", bmi);

        // Menentukan kategori BMI
        if (bmi < 18.5) {
            System.out.println("Kategori: Underweight (Kurus)");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Kategori: Normal");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Kategori: Overweight (Berat Badan Lebih)");
        } else {
            System.out.println("Kategori: Obese (Obesitas)");
        }

        // Menutup Scanner
        input.close();
    }
}

