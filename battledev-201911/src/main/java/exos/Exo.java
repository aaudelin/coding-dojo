package exos;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

public interface Exo {
    default List<AbstractMap.SimpleEntry<String, String>> getMap() {
        return new ArrayList<>();
    }

    default boolean compareResult(String attendu, String obtenu) {
        return attendu.equals(obtenu);
    }

}
