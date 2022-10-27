package zadanko;

import java.util.Scanner;

public class PlayerHuman extends Player {

    Scanner s = new Scanner(System.in);

    public PlayerHuman() {
        
    }

    public PlayerHuman(String imie) {
        super(imie);
    }

    public int guess() {
        System.out.println("Podaj liczbę: ");
        return s.nextInt();
    }
}
