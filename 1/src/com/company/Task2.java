package com.company;

import java.util.Scanner;
//sprawdza czy liczba jest podzielna przez 4//

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę= ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i % 4 == 0){
            System.out.println("Ta liczba jest podzielna przez 4");
        }else{
                System.out.println("Ta liczba nie jest podzielna przez 4");
            }

        }


}


