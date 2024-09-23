package bemelegitofeladat;

import java.util.ArrayList;
import java.util.Random;


public class BemelegitoFeladat {


    public static void main(String[] args) {
         Random random = new Random();
         ArrayList<Integer> szamokLista = new ArrayList<>();

        
        
        for (int i = 0; i < 20; i++) {
            int randomSzam = 10 + random.nextInt(11);
            szamokLista.add(randomSzam);
            
    }
    System.out.println("Random számok: " + szamokLista);
    
    for (int i = 0; i < szamokLista.size(); i++) {
            if (szamokLista.get(i) % 2 != 0) { // Ha a szám páratlan
                szamokLista.remove(i);  // Eltávolítjuk
                i--; // Csökkentjük az indexet, hogy ne lépjünk túl egy elem eltávolítása után
            }
        }

        // Módosított lista kiírása
        System.out.println("Páratlan számok eltávolítása után: " + szamokLista);
    }
}


