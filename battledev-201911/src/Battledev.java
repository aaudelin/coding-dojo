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
        for (Map.Entry<String, String> inOut: exo.getMap().entrySet()){
            String resultat = compute(inOut.getKey());
            if (!exo.compareResult(inOut.getValue(), resultat)) {
                System.out.println("Error : exemple attendu " + inOut.getValue() + " obtenu " + resultat);
            }
        }
    }
}
