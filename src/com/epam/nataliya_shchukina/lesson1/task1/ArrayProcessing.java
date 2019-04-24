package com.epam.nataliya_shchukina.lesson1.task1;

public class ArrayProcessing {
    //вывод массива на экран
    public void arrayOutput(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "[" + i + "]" + " ");
        }
    }
     //получаем индекс максимального отрацательного цисла массива
    public int getMaxNegativeIndex(int[] array) {
        int maxotr = Integer.MIN_VALUE + 1;
        int kmax = 0;
        for (int i = 0; i < array.length; i++) {
            if ((Math.abs(array[i])< Math.abs(maxotr)) & (array[i] < 0)){
                maxotr = array[i];
                kmax = i;
            }
        }
        return kmax;
    }
    //получаем индекс минимального положительного цисла массива
    public int getMinPositiveIndex(int[] array) {
        int minpol = Integer.MAX_VALUE;
        int lmin = 0;

        for (int i = 0; i < array.length; i++) {
          if((array[i] < minpol) & (array[i] > 0)) {
                minpol = array[i];
                lmin = i;
            }
        }
        return lmin;
    }
     //меняем элементы массива
    public int[] changeElementInArray(int[] array, int k, int l) {
        int temparray = array[k];
        array[k] = array[l];
        array[l] = temparray;
        return array;
    }
    }



