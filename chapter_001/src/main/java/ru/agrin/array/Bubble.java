package ru.agrin.array;

/**
 * Created by grin on 18.11.2016.
 */
class Bubble {
    int[] values = new int[] {8, 1, 4, 2, 5};

    public int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
