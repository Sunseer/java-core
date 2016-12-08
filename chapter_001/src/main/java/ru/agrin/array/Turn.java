package ru.agrin.array;

/**
 * Created by grin on 18.11.2016.
 */
class Turn {

    int[] array = new int[] {1, 2, 3, 4, 5};    

    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
