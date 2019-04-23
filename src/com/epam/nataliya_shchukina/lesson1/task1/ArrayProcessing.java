package com.epam.nataliya_shchukina.lesson1.task1;

public class ArrayProcessing {

        public void arrayOutput(int [] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "[" + i + "]" + " ");
                }
        }

        public int getMaxNegativeIndex(int[] array) {
            boolean isFound = false;
            int maxotr = array[0];
            int kmax = 0;

            for (int i = 0; i < array.length; i++) {
                if ((Math.abs(array[i]) <= Math.abs(maxotr)) & (array[i] < 0)) {
                    maxotr = array[i];
                    kmax = i;
                    isFound = true;
                }
            }

            return kmax;
        }}