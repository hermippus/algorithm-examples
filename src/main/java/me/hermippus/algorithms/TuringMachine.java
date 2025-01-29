package me.hermippus.algorithms;

import java.util.Arrays;

public class TuringMachine {

    private int head = 0;
    private String state = "";

    // Simple Turing machine that moves along the tape, changing '0' to '1 and '1' to '0'
    public void run(char[] tape) {
        System.out.println("Original tape: " + Arrays.toString(tape));
        state = "Q1";
        while (true) {
            char c = tape[head];
            switch (state) {
                case "Q1":
                    if (c == '_') {
                        head++;
                        state = "Q2";
                    }
                    break;
                case "Q2":
                    if (c == '0') {
                        tape[head] = '1';
                        head++;
                    } else if (c == '1') {
                        tape[head] = '0';
                        head++;
                    } else {
                        state = "Q3";
                    }
                    break;
                case "Q3":
                    System.out.println("Changed tape: " + Arrays.toString(tape));
                    return;
            }
        }
    }
}

