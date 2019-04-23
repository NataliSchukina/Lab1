package com.epam.nataliya_shchukina.lesson1.task1;
public class Application {

    public int [] arrayInitionalization( int size, int leftBorder, int rightBorder){
        //int size =20;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (rightBorder-leftBorder + 1))+leftBorder;
        }
        return array;
    }

    public void runApplication() {

        ArrayProcessing arrayProcessing = new ArrayProcessing();
        var array = arrayInitionalization(20, -10, 10);
        arrayProcessing.arrayOutput(array);
        System.out.println();
        var negativeIndex = arrayProcessing.getMaxNegativeIndex(array);
        System.out.println("Maxotr: " + array[negativeIndex] + " [" + negativeIndex + "]");
    }
}
