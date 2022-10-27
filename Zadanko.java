package zadanko;

import java.util.Random;

public class Zadanko {

    public static void main(String[] args) {

        Random dice = new Random();     //obiekt losujący

        Player gracz = new PlayerHuman();

        // Player gracz = new PlayerHuman();
        // try {
        //     gracz.setName("Al");
        // } catch (IllegalArgumentException ex) {
        //     System.err.println("Błąd! " + ex.getMessage());
        // }
        
        int number;                     //wylosowana liczba
        int guess;                     //propozycja (strzał) gracza
        do {
            System.out.println("---------------------");
            guess = gracz.guess();
            number = dice.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            System.out.println(gracz.getName() + " : " + guess);

            if (number != guess) {
                System.out.println("PUDŁO!");
            } else {
                System.out.println(gracz.getName() + " BRAWO!");
            }

        } while (number != guess);
    }

}
