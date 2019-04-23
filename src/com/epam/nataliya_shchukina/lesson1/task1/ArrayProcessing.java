package com.epam.nataliya_shchukina.lesson1.task1;

public class ArrayProcessing {

        public void arrayOutput(int [] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "[" + i + "]" + " ");
                }
        }
        public  void maxFound( int [] array) {
            int maxotr = 0;
            int kmax = 0;
            for (int i = 0; i < array.length; i++) {
                if ((Math.abs(array[i])> maxotr) & (array[i]<0)){
                    maxotr = array [i];
                    kmax = i;
                }

            }
            System.out.println("Maxotr: "+maxotr+" ["+kmax+"]");

        }}