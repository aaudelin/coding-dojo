package exos;

import java.util.HashMap;
import java.util.Map;

public interface Exo {
    default Map<String, String> getMap() {
        return new HashMap<>();
    }

    default boolean compareResult(String attendu, String obtenu) {
        return attendu.equals(obtenu);
    }

}
