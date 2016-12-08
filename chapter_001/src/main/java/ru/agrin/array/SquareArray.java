package ru.agrin.array;

/**
 * Класс для поворота по часовой стрелке на 90 градусов двумерного массива
 * Created by grin on 21.11.2016.
 */
class SquareArray {

    /**
     * Поворот по часов стрелке на 90 градусов двумерного массива
     * @param array входящий двумерный массив
     */
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
