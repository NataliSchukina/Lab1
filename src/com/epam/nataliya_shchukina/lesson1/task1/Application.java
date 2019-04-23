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
    arrayProcessing.arrayOutput(arrayInitionalization(20,-10,10));
    System.out.println();
    //arrayProcessing.maxFound(array);
}
}
