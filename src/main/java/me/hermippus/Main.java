package me.hermippus;

import static me.hermippus.algorithms.compression.RLEAlgorithm.compress;
import static me.hermippus.algorithms.compression.RLEAlgorithm.decompress;

public class Main {
    public static void main(String[] args) {
        // RLE Compression Algorithm
        String input = "AAAAAAAAAABBBBBBBBBBBBCCCCCDDDDDDDDDDDDDD";
        String compressed = compress(input);
        String decompressed = decompress(compressed);

        System.out.println("Original string: " + input);
        System.out.println("Compressed string: " + compressed);
        System.out.println("Decompressed string: " + decompressed);
    }
}