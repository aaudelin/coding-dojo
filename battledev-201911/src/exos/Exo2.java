package exos;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Lassé de faire du développement et de résoudre des algos inutiles vous vous décidez à
 * vous lancer dans votre nouvelle entreprise de création de cadres en bois.
 *
 * Votre premier client...votre grand-mère qui veut encadrer toutes les photos de famille de ses 80 ans.
 *
 * Elle vous donne alors une suite de photos et une boite remplie de planches de bois de différentes tailles.
 * Vous avez une seule contrainte le cadre doit être carré.
 *
 * Votre rôle sera donc de découper les planches de bois pour pouvoir les assembler.
 *
 * Vous piochez alors 4 planches de bois aléatoirement et commencez à les découper pour constituer un cadre.
 *
 * Entrée :
 *  - Quatre entiers séparés par un tiret :
 *      - Entier 1 : la taille de la planche 1 en cm
 *      - Entier 2 : la taille de la planche 2 en cm
 *      - Entier 3 : la taille de la planche 3 en cm
 *      - Entier 4 : la taille de la planche 4 en cm
 *
 * Sortie :
 *  La taille en cm de l'ensemble des découpes faites sur les planches de bois.
 *
 *
 * Exemples :
 *
 *   Exemple 1:
 *      Entrée : 1 1 2 2
 *      Sortie : 2
 *   Exemple 2 :
 *      Entrée : 12 10 10 13
 *      Sortie : 5
 *
 */







public class Exo2 implements Exo {
    @Override public List<AbstractMap.SimpleEntry<String, String>> getMap() {
        List<AbstractMap.SimpleEntry<String, String>> map = new ArrayList<>();

        map.add(new AbstractMap.SimpleEntry<>("20-15-4-5", "28"));
        map.add(new AbstractMap.SimpleEntry<>("25-24-23-22", "6"));
        map.add(new AbstractMap.SimpleEntry<>("10-5-5-5", "5"));
        map.add(new AbstractMap.SimpleEntry<>("9-9-9-9", "0"));
        map.add(new AbstractMap.SimpleEntry<>("10-5-5-5", "5"));
        map.add(new AbstractMap.SimpleEntry<>("20-15-4-5", "28"));
        map.add(new AbstractMap.SimpleEntry<>("30-30-29-30", "3"));
        map.add(new AbstractMap.SimpleEntry<>("25-24-23-22", "6"));
        map.add(new AbstractMap.SimpleEntry<>("20-15-4-5", "28"));
        map.add(new AbstractMap.SimpleEntry<>("10-10-10-10", "0"));
        map.add(new AbstractMap.SimpleEntry<>("30-30-29-30", "3"));
        map.add(new AbstractMap.SimpleEntry<>("25-24-23-22", "6"));
        map.add(new AbstractMap.SimpleEntry<>("10-10-10-10", "0"));
        map.add(new AbstractMap.SimpleEntry<>("10-5-5-5", "5"));
        map.add(new AbstractMap.SimpleEntry<>("30-30-29-30", "3"));
        map.add(new AbstractMap.SimpleEntry<>("9-9-9-9", "0"));
        map.add(new AbstractMap.SimpleEntry<>("25-24-23-22", "6"));
        map.add(new AbstractMap.SimpleEntry<>("25-24-23-22", "6"));
        map.add(new AbstractMap.SimpleEntry<>("10-5-5-5", "5"));
        map.add(new AbstractMap.SimpleEntry<>("20-15-4-5", "28"));
        map.add(new AbstractMap.SimpleEntry<>("20-15-4-5", "28"));
        map.add(new AbstractMap.SimpleEntry<>("10-5-5-5", "5"));
        map.add(new AbstractMap.SimpleEntry<>("30-30-29-30", "3"));
        map.add(new AbstractMap.SimpleEntry<>("20-15-4-5", "28"));
        map.add(new AbstractMap.SimpleEntry<>("30-30-29-30", "3"));
        map.add(new AbstractMap.SimpleEntry<>("10-10-10-10", "0"));
        map.add(new AbstractMap.SimpleEntry<>("30-30-29-30", "3"));
        map.add(new AbstractMap.SimpleEntry<>("25-24-23-22", "6"));
        map.add(new AbstractMap.SimpleEntry<>("10-5-5-5", "5"));
        map.add(new AbstractMap.SimpleEntry<>("10-10-10-10", "0"));
        map.add(new AbstractMap.SimpleEntry<>("25-24-23-22", "6"));
        map.add(new AbstractMap.SimpleEntry<>("20-15-4-5", "28"));
        map.add(new AbstractMap.SimpleEntry<>("10-10-10-10", "0"));
        map.add(new AbstractMap.SimpleEntry<>("10-5-5-5", "5"));
        map.add(new AbstractMap.SimpleEntry<>("20-15-4-5", "28"));
        map.add(new AbstractMap.SimpleEntry<>("20-15-4-5", "28"));
        map.add(new AbstractMap.SimpleEntry<>("30-30-29-30", "3"));
        map.add(new AbstractMap.SimpleEntry<>("9-9-9-9", "0"));
        map.add(new AbstractMap.SimpleEntry<>("25-24-23-22", "6"));
        map.add(new AbstractMap.SimpleEntry<>("20-15-4-5", "28"));
        map.add(new AbstractMap.SimpleEntry<>("30-30-29-30", "3"));
        map.add(new AbstractMap.SimpleEntry<>("10-10-10-10", "0"));
        map.add(new AbstractMap.SimpleEntry<>("10-5-5-5", "5"));
        map.add(new AbstractMap.SimpleEntry<>("10-5-5-5", "5"));
        map.add(new AbstractMap.SimpleEntry<>("25-24-23-22", "6"));
        map.add(new AbstractMap.SimpleEntry<>("30-30-29-30", "3"));
        map.add(new AbstractMap.SimpleEntry<>("9-9-9-9", "0"));
        map.add(new AbstractMap.SimpleEntry<>("25-24-23-22", "6"));
        map.add(new AbstractMap.SimpleEntry<>("10-5-5-5", "5"));
        map.add(new AbstractMap.SimpleEntry<>("10-10-10-10", "0"));
        map.add(new AbstractMap.SimpleEntry<>("10-5-5-5", "5"));
        map.add(new AbstractMap.SimpleEntry<>("20-15-4-5", "28"));
        map.add(new AbstractMap.SimpleEntry<>("30-30-29-30", "3"));
        map.add(new AbstractMap.SimpleEntry<>("20-15-4-5", "28"));
        map.add(new AbstractMap.SimpleEntry<>("25-24-23-22", "6"));
        map.add(new AbstractMap.SimpleEntry<>("30-30-29-30", "3"));
        map.add(new AbstractMap.SimpleEntry<>("10-10-10-10", "0"));
        map.add(new AbstractMap.SimpleEntry<>("10-5-5-5", "5"));

        return map;
    }
}
