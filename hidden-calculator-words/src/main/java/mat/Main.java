package mat;

import java.util.Map;

public class Main {

    private static final Map<Character, Character> DICTIONARY = Map.of(
            '1', 'I',
            '2', 'Z',
            '3', 'E',
            '4', 'H',
            '5', 'S',
            '6', 'G',
            '7', 'L',
            '8', 'B',
            '9', '-',
            '0', 'O');

    public static void main(String[] args) {
    }

    public static String turnCalc(String number) {
        StringBuilder sb = new StringBuilder();

        for (int i = number.length() - 1; i >= 0; i--) {
            char originalChar = number.charAt(i);
            Character mappedChar = DICTIONARY.get(originalChar);

            if (mappedChar == null) {
                throw new IllegalArgumentException("Number not found in dictionary: " + number);
            }

            sb.append(mappedChar);
        }

        return sb.toString();
    }
}
