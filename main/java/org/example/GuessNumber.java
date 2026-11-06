package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secret = new Random().nextInt(100) + 1;
        int attempts = 0;
        boolean guessed = false;
        
        System.out.println("Угадай число лолололо от 1 до 100");
        
        while (attempts < 10 && !guessed) {
            System.out.print("введтите валше число: ");
            int guess = in.nextInt();
            attempts++;
            
            if (guess < 1 || guess > 100) {
                System.out.println("блин, ошибочка, число должно быть от 1 до 100");
                attempts--;
            } else if (guess < secret) {
                System.out.println("у мя число больш");
            } else if (guess > secret) {
                System.out.println("у мя меньше число");
            } else {
                System.out.println("ура угадали блин");
                System.out.println("угадано за " + attempts + " попыточеек");
                guessed = true;
            }
        }
        if (!guessed) {
            System.out.println("а попытки закончились, не повезло((, вот какое число было загаданно: " + secret);
        }
    }
}
