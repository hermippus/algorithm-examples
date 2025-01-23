package me.hermippus.algorithms.compression;

public class RLEAlgorithm {


    public static String compress(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(count).append(currentChar);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        return result.append(count).append(currentChar).toString();
    }

    public static String decompress(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        StringBuilder counter = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                counter.append(c);
            } else {
                int count = Integer.parseInt(counter.toString());
                result.append(String.valueOf(c).repeat(Math.max(0, count)));
                counter.setLength(0);
            }
        }

        return result.toString();
    }
}
