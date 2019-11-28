import exos.*;

import java.util.Map;

public class Battledev {
    // Injecter le bon exercice
    private static Exo exo = new Exo1();



    static String compute(String input) {
        // A implémenter
        return "";
    }




    public static void main(String[] args) {
        boolean result = true;
        for (Map.Entry<String, String> inOut: exo.getMap()){
            String resultat = compute(inOut.getKey());
            result = exo.compareResult(inOut.getValue(), resultat);
            if (!result) {
                System.out.println("Error : attendu " + inOut.getValue() + " obtenu " + resultat);
                return;
            }
        }
        if (result) {
            System.out.println("Exercice réussi !");
        }
    }
}
