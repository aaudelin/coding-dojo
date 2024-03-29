package exos;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * En tant que receleur de l'an 1754 après le Death Stranding, vous possédez les derniers cables RJ11 afin
 * de raccorder la terre avec un nouvel internet 150 terraoctets par seconde.
 *
 * Sans cela le planète sera détruite (allons savoir pourquoi ?)
 * Vous êtes alors le seul et dernier espoir pour rallier toute la planète en quelques millisecondes.
 *
 * Vous avez avec vous une troupe d'ingénieurs capables de poser les cables. Il vous
 * faut alors optimiser la séquence de cables à délivrer.
 *
 * Entrée :
 *  - Tiret 1 : deux entiers séparés par un espace
 *      - entier 1 : N le nombre de cables à votre disposition
 *      - entier 2 : M le nombre de requêtes
 *          Une requête correspond à une demande de câble entre une date de début et une date de fin.
 *  - Tiret 2 à M + 1 : deux entiers séparés par un espace
 *      - entier 1 : la date de début de la requete en secondes depuis un instant T
 *      - entier 2 : la date de fin de la requete en secondes depuis un instant T
 *      NB : un cable est immédiatement disponible à sa date de fin, inutile d'attendre une seconde
 *
 * Sortie :
 *  La suite optimisée du numéro de câble fourni à chaque requête. Il faut donc utiliser le moins de câbles possible
 *  et utiliser les câbles dans l'ordre de leur numérotation. La numérotation des câbles est libre.
 *
 *  Retourner la chaine "pas possible" si vous n'avez pas assez de cables pour satisfaire les demandes à un instant donné
 *
 *
 * Exemples :
 *
 *   Exemple 1:
 *      Entrée : 2 2-1 2-1 2
 *      Sortie : 1 2
 *   Exemple 2 :
 *      Entrée : 2 2-1 2-2 3
 *      Sortie : 1 1
 *          NB : la sortie 1 2 n'est pas optimisée
 *   Exemple 3 :
 *      Entrée : 2 3-1 3-1 3-2 3
 *      Sortie : pas possible
 *
 */






public class Exo3 implements Exo {

    @Override public List<AbstractMap.SimpleEntry<String, String>> getMap() {
        List<AbstractMap.SimpleEntry<String, String>> map = new ArrayList<>();

        map.add(new AbstractMap.SimpleEntry<>("2 10-1 2-1 2-2 3-3 4-4 5-5 6-6 7-7 8-8 9-9 10", "1 2 1 1 1 1 1 1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("9 10-1 2-1 3-1 4-1 5-1 5-1 6-1 7-1 8-1 9-1 10", "pas possible"));
        map.add(new AbstractMap.SimpleEntry<>("9 10-1 2-1 3-1 4-1 5-1 6-1 7-1 8-1 9-1 10-10 11", "1 2 3 4 5 6 7 8 9 1"));
        map.add(new AbstractMap.SimpleEntry<>("2 10-1 2-2 3-3 4-1 2-4 5-5 6-6 7-7 8-8 9-9 10", "1 1 1 2 1 1 1 1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("10 10-1 2-1 3-1 4-1 5-1 6-1 7-1 8-1 9-1 10-1 11", "1 2 3 4 5 6 7 8 9 10"));
        map.add(new AbstractMap.SimpleEntry<>("3 3-1 2-1 2-1 2", "1 2 3"));
        map.add(new AbstractMap.SimpleEntry<>("1 10-1 2-2 3-3 4-4 5-5 6-6 7-7 8-8 9-9 10-10 11", "1 1 1 1 1 1 1 1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("3 3-1 2-2 3-3 4", "1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("1 10-1 2-2 3-3 4-9 10-5 6-6 7-7 8-8 9-9 10-10 11", "pas possible"));
        map.add(new AbstractMap.SimpleEntry<>("10 10-1 2-1 3-1 4-1 5-1 6-1 7-1 8-1 9-1 10-1 11", "1 2 3 4 5 6 7 8 9 10"));
        map.add(new AbstractMap.SimpleEntry<>("2 10-1 2-2 3-3 4-4 5-5 6-6 7-7 8-8 9-9 10-1 2", "1 1 1 1 1 1 1 1 1 2"));
        map.add(new AbstractMap.SimpleEntry<>("2 10-1 2-1 2-2 3-3 4-4 5-5 6-6 7-7 8-8 9-9 10", "1 2 1 1 1 1 1 1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("2 10-1 2-2 3-3 4-1 2-4 5-5 6-6 7-7 8-8 9-9 10", "1 1 1 2 1 1 1 1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("9 10-1 2-1 3-1 4-1 5-1 5-1 6-1 7-1 8-1 9-1 10", "pas possible"));
        map.add(new AbstractMap.SimpleEntry<>("2 10-1 2-2 3-3 4-4 5-5 6-6 7-7 8-8 9-9 10-1 2", "1 1 1 1 1 1 1 1 1 2"));
        map.add(new AbstractMap.SimpleEntry<>("9 10-1 2-1 3-1 4-1 5-1 6-1 7-1 8-1 9-1 10-10 11", "1 2 3 4 5 6 7 8 9 1"));
        map.add(new AbstractMap.SimpleEntry<>("1 10-1 2-2 3-3 4-4 5-5 6-6 7-7 8-8 9-9 10-10 11", "1 1 1 1 1 1 1 1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("2 10-1 2-2 3-3 4-4 5-5 6-6 7-7 8-8 9-9 10-1 2", "1 1 1 1 1 1 1 1 1 2"));
        map.add(new AbstractMap.SimpleEntry<>("1 10-1 2-2 3-3 4-9 10-5 6-6 7-7 8-8 9-9 10-10 11", "pas possible"));
        map.add(new AbstractMap.SimpleEntry<>("3 3-1 2-1 2-1 2", "1 2 3"));
        map.add(new AbstractMap.SimpleEntry<>("2 10-1 2-1 2-2 3-3 4-4 5-5 6-6 7-7 8-8 9-9 10", "1 2 1 1 1 1 1 1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("2 10-1 2-2 3-3 4-1 2-4 5-5 6-6 7-7 8-8 9-9 10", "1 1 1 2 1 1 1 1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("3 3-1 2-1 2-1 2", "1 2 3"));
        map.add(new AbstractMap.SimpleEntry<>("3 3-1 2-2 3-3 4", "1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("10 10-1 2-1 3-1 4-1 5-1 6-1 7-1 8-1 9-1 10-1 11", "1 2 3 4 5 6 7 8 9 10"));
        map.add(new AbstractMap.SimpleEntry<>("9 10-1 2-1 3-1 4-1 5-1 6-1 7-1 8-1 9-1 10-10 11", "1 2 3 4 5 6 7 8 9 1"));
        map.add(new AbstractMap.SimpleEntry<>("1 10-1 2-2 3-3 4-4 5-5 6-6 7-7 8-8 9-9 10-10 11", "1 1 1 1 1 1 1 1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("1 10-1 2-2 3-3 4-9 10-5 6-6 7-7 8-8 9-9 10-10 11", "pas possible"));
        map.add(new AbstractMap.SimpleEntry<>("9 10-1 2-1 3-1 4-1 5-1 5-1 6-1 7-1 8-1 9-1 10", "pas possible"));
        map.add(new AbstractMap.SimpleEntry<>("3 3-1 2-2 3-3 4", "1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("1 10-1 2-2 3-3 4-4 5-5 6-6 7-7 8-8 9-9 10-10 11", "1 1 1 1 1 1 1 1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("2 10-1 2-2 3-3 4-4 5-5 6-6 7-7 8-8 9-9 10-1 2", "1 1 1 1 1 1 1 1 1 2"));
        map.add(new AbstractMap.SimpleEntry<>("9 10-1 2-1 3-1 4-1 5-1 5-1 6-1 7-1 8-1 9-1 10", "pas possible"));
        map.add(new AbstractMap.SimpleEntry<>("2 10-1 2-1 2-2 3-3 4-4 5-5 6-6 7-7 8-8 9-9 10", "1 2 1 1 1 1 1 1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("9 10-1 2-1 3-1 4-1 5-1 6-1 7-1 8-1 9-1 10-10 11", "1 2 3 4 5 6 7 8 9 1"));
        map.add(new AbstractMap.SimpleEntry<>("2 10-1 2-2 3-3 4-1 2-4 5-5 6-6 7-7 8-8 9-9 10", "1 1 1 2 1 1 1 1 1 1"));
        map.add(new AbstractMap.SimpleEntry<>("3 3-1 2-1 2-1 2", "1 2 3"));
        map.add(new AbstractMap.SimpleEntry<>("1 10-1 2-2 3-3 4-9 10-5 6-6 7-7 8-8 9-9 10-10 11", "pas possible"));
        map.add(new AbstractMap.SimpleEntry<>("10 10-1 2-1 3-1 4-1 5-1 6-1 7-1 8-1 9-1 10-1 11", "1 2 3 4 5 6 7 8 9 10"));
        map.add(new AbstractMap.SimpleEntry<>("3 3-1 2-2 3-3 4", "1 1 1"));

        return map;
    }

//    @Override public boolean compareResult(String attendu, String obtenu) {
//        if (attendu.equals(obtenu)) {
//            return true;
//        }
//        if (attendu.equals("pas possible")) {
//            return false;
//        }
//
//        Integer nombrePrises = 0;
//        Integer nombreDemandes = 0;
//        for (Map.Entry<String, String> entry: getMap().entrySet()) {
//            if (entry.getValue().equals(attendu)) {
//                final String[] strings = entry.getKey().split("-")[0].split(" ");
//                nombrePrises  = Integer.valueOf(strings[0]);
//                nombreDemandes  = Integer.valueOf(strings[1]);
//            }
//        }
//
//        final String[] splitResultat = obtenu.split(" ");
//
//        if (splitResultat.length != nombreDemandes) {
//            return false;
//        }
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 1; i <= nombrePrises; i++) {
//            map.put(i, 0);
//        }
//
//        for (String position: splitResultat) {
//            if (Integer.parseInt(position) > nombrePrises) {
//                return false;
//            }
//            map.put(Integer.parseInt(position), map.get(Integer.parseInt(position)) + 1);
//        }
//
//
//        return true;
//    }
}
