package tp3;

import java.util.Random;
import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {

        Random rand = new Random();
        int nombreSecret = rand.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);
        int tentative;
        int essais = 0;

        System.out.println("Devinez le nombre entre 1 et 10");

        do {
            System.out.print("Entrez un nombre : ");
            tentative = sc.nextInt();
            essais++;

            if (tentative < nombreSecret) {
                System.out.println("C'est plus grand !");
            } else if (tentative > nombreSecret) {
                System.out.println("C'est plus petit !");
            } else {
                System.out.println("Bravo !");
            }

        } while (tentative != nombreSecret);

       
        System.out.println("Nombre de tentatives : " + essais);

        if (essais == 1) {
            System.out.println("Score excellent !");
        } else if (essais <= 3) {
            System.out.println("Bon score !");
        } else {
            System.out.println("Essayez encore pour améliorer votre score !");
        }

    }
}



