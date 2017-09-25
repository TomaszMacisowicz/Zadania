package com.company;

//Sprawdza czy osoba jest pełnoletnia//

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Podaj wiek=");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >=18){
            System.out.println("Jesteś pełnoletni");}
             else{
                System.out.println("Jesteś niepełnoletni");


        }

    }
}
