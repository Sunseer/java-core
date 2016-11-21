package ru.agrin;

/**
 * Created by grin on 21.11.2016.
 */
public class SquareArray {
    int[][] values = new int[][]{{1, 2, 3},
                                {10, 20, 30},
                                {100, 200, 300}
    };

    int[][] turnArray(int[][] array) {
        for (int i  = 0; i < array.length; i ++)
            for (int j = i; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length / 2; j++) {
                int temp= array[i][j];
                array[i][j] = array[i][array.length - j - 1];
                array[i][array.length - j - 1] = temp;
            }
        }
        return array;
    }
}
