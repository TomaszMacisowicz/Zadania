package com.company;

import java.util.Scanner;
// Silnia z cyfry//
public class Task4 {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int score =1;

        for (int i = 1; i<=number; i++)
        {
            score *= i;

            System.out.println("liczba" +i+ "wynik" +score);


        }
        System.out.println(score);

    }
}
