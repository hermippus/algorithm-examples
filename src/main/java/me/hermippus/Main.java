package me.hermippus;

import java.util.Arrays;

import static me.hermippus.algorithms.TwoSum.bruteForceTwoSum;
import static me.hermippus.algorithms.compression.RLEAlgorithm.compress;
import static me.hermippus.algorithms.compression.RLEAlgorithm.decompress;

public class Main {
    public static void main(String[] args) {
        useBruteForceTwoSum();
        System.out.println();
        useRLECompressionAlgorithm();
    }

    private static void useBruteForceTwoSum() {
        int[] numbers = { 5, 3, 9, 10, 3, 7 };
        int[] result = bruteForceTwoSum(numbers, 6);
        System.out.println(Arrays.toString(result));
        /*
        Output:
        [1, 4]
         */
    }

    private static void useRLECompressionAlgorithm() {
        String input = "LLLLLLLLLLLLLLLLLLLLLBBBBBBBBBBBBBBBBBBBBBBBOOOOOOOOOO";
        String compressed = compress(input);
        String decompressed = decompress(compressed);

        System.out.println("Original string: " + input);
        System.out.println("Compressed string: " + compressed);
        System.out.println("Decompressed string: " + decompressed);
        /*
        Output:
        Original string: LLLLLLLLLLLLLLLLLLLLLBBBBBBBBBBBBBBBBBBBBBBBOOOOOOOOOO
        Compressed string: 21L23B10O
        Decompressed string: LLLLLLLLLLLLLLLLLLLLLBBBBBBBBBBBBBBBBBBBBBBBOOOOOOOOOO
         */
    }

}