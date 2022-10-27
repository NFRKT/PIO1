package zadanko;

import java.util.Random;

public class Player {

    private String imie = "Anonim";
    private Random r = new Random();
    
    
    public Player(){
        System.out.println("Player()");
    }
    
    public Player(String imie){
        System.out.println("Player(String)");
        setName(imie);
    }
    
    public String getName() {
        return imie;
    }

    public void setName(String imie) {
        if (imie.matches("^[A-Za-z0-9.\\-_]{3,}$")) {
            this.imie = imie;
        } else {
            throw new IllegalArgumentException("Nieprawidłowe imie!");
        }
    }

    public int guess() {
        return r.nextInt(6) + 1;
    }
}
