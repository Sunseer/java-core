package ru.agrin;

/**
 * Класс для для объединения двух отсортированных массивов
 * Created by grin on 07.12.2016.
 */
class MergeArray {
    /**
     * Метод объединяет и сортирует два отсортированных массива.
     * @param a первый массив.
     * @param b второй массив.
     * @return новый отсортированный массив.
     */
    public int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        int i = 0;
        while (i < result.length) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
            i++;
        }
        return result;
    }

}
