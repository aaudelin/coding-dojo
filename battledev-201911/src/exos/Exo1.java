package exos;


import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * Vous partez en camping avec vos potes. Marshmallows au barbecue, bières et musique sont au programme de cette douce soirée.
 *
 * Cependant, il vous croire que vous portez vraiment malheur mais il manque une place pour dormir bien au chaud dans la caravane.
 * En bon lâche vous ne souhaitez certainement pas vous sacrifier et dormir dans la tente qui sent encore le vomi de l'an dernier.
 *
 * Il vous vient alors à l'idée de proposer le jeu de la courte paille et de créer un programme pour automatiser
 * la vérification de la taille des bouts de bois.
 *
 *
 * Entrée :
 *  -Tiret 1 à X : une string et un entier séparés par un espace
 *      -string 1 : le nom de la personne
 *      -entier 2 : la taille du bout de bois en cm
 *
 * Sortie :
 *  La chaine de caractères correspondant au nom de la personne qui a le plus petit bout de bois.
 *
 *
 * Exemples :
 *
 *   Exemple 1:
 *      Entrée : Paul 1-Nicolas 152
 *      Sortie : Paul
 *   Exemple 2 :
 *      Entrée : JeanMarc 48-Paul 1-Nicolas 47
 *      Sortie : Paul
 *
 */

public class Exo1 implements Exo {

    @Override
    public List<AbstractMap.SimpleEntry<String, String>> getMap() {
        List<AbstractMap.SimpleEntry<String, String>> map = new ArrayList<>();
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 225-jqijdi 3584-ytiur 18-ytiurT 199", "ytiur"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 484-ytiur 444-ytiur 789-ytiurT 199-jdizqhz 4484-qijqhi 1515-jzhhi 444-jheuqyci 44-rexzqzqd 789-hgqdzh 469-yytedge 698",
                "jheuqyci"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 225-jqijdi 3584-ytiur 18-ytiurT 199", "ytiur"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 484-ytiur 444-ytiur 885-ytiurT 199-jdizqhz 4484-qijqhi 1515-jzhhi 444-jheuqyci 78-rexzqzqd 789-hgqdzh 469-yytedge 32",
                "yytedge"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 484-ytiur 444-ytiur 789-ytiurT 199-jdizqhz 4484-qijqhi 1515-jzhhi 444-jheuqyci 44-rexzqzqd 789-hgqdzh 469-yytedge 698",
                "jheuqyci"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 484-ytiur 444-ytiur 885-ytiurT 199-jdizqhz 4484-qijqhi 1515-jzhhi 444-jheuqyci 78-rexzqzqd 789-hgqdzh 469-yytedge 32",
                "yytedge"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 484-ytiur 444-ytiur 885-ytiurT 199-jdizqhz 4484-qijqhi 1515-jzhhi 444-jheuqyci 78-rexzqzqd 789-hgqdzh 469-yytedge 32",
                "yytedge"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 225-jqijdi 3584-ytiur 15448-ytiurT 199", "ytiurT"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 225-jqijdi 3584-ytiur 18-ytiurT 199", "ytiur"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 484-ytiur 444-ytiur 789-ytiurT 199-jdizqhz 4484-qijqhi 1515-jzhhi 444-jheuqyci 44-rexzqzqd 789-hgqdzh 469-yytedge 698",
                "jheuqyci"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 484-ytiur 444-ytiur 885-ytiurT 199-jdizqhz 4484-qijqhi 1515-jzhhi 444-jheuqyci 78-rexzqzqd 789-hgqdzh 469-yytedge 32",
                "yytedge"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 484-ytiur 444-ytiur 789-ytiurT 199-jdizqhz 4484-qijqhi 1515-jzhhi 444-jheuqyci 44-rexzqzqd 789-hgqdzh 469-yytedge 698",
                "jheuqyci"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 484-ytiur 444-ytiur 885-ytiurT 199-jdizqhz 4484-qijqhi 1515-jzhhi 444-jheuqyci 78-rexzqzqd 789-hgqdzh 469-yytedge 32",
                "yytedge"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 225-jqijdi 3584-ytiur 18-ytiurT 199", "ytiur"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 484-ytiur 444-ytiur 885-ytiurT 199-jdizqhz 4484-qijqhi 1515-jzhhi 444-jheuqyci 78-rexzqzqd 789-hgqdzh 469-yytedge 32",
                "yytedge"));
        map.add(new AbstractMap.SimpleEntry<>("ahdeuzq 484-ytiur 444-ytiur 789-ytiurT 199-jdizqhz 4484-qijqhi 1515-jzhhi 444-jheuqyci 44-rexzqzqd 789-hgqdzh 469-yytedge 698",
                "jheuqyci"));
        return map;
    }
}
