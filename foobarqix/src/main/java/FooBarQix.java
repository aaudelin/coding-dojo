import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FooBarQix {

    private static Map<Integer, String> mapIntString = new HashMap<>();

    static {
        mapIntString.put(0, "*");
        mapIntString.put(3, "Foo");
        mapIntString.put(5, "Bar");
        mapIntString.put(7, "Qix");
    }

    public String compute(String numberString) {
        boolean isNumber = true;
        String returnValue = "";
        final Integer numberInt;

        try {
             numberInt = Integer.valueOf(numberString);
        } catch (NumberFormatException exception) {
            return "";
        }

        // Handles divisible by
        List<Integer> numbersToCheck = Arrays.asList(3, 5, 7);
        for (Integer element: numbersToCheck) {
            if (numberInt % element == 0) {
                returnValue += mapIntString.get(element);
                isNumber = false;
            }
        }

        // Handles the contains
        for (char element: numberString.toCharArray()) {
            if (numbersToCheck.contains(Character.getNumericValue(element))) {
                returnValue += mapIntString.get(Character.getNumericValue(element));
                isNumber = false;
            }
            // Handles the 0 to add if it contains Foo or Bar or Qix
            if (!isNumber && Character.getNumericValue(element) == 0) {
                returnValue += mapIntString.get(Character.getNumericValue(element));
            }
        }

        returnValue = returnValue.isEmpty() ? numberInt.toString() : returnValue;

        // Handles the 0 to add if it is still a number
        return returnValue.replace("0", mapIntString.get(0));

    }

}
