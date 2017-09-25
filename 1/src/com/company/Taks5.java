package com.company;
//porównanie dwóch zmiennych//

import java.util.Scanner;

public class Taks5 {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int b = sc.nextInt();

        if (a==b) {
            System.out.println("Te lczby są takie same");
        }
            else{
                System.out.println("Te liczby są różne");
            }
        }

    }

