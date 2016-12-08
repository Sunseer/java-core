package ru.agrin.array;

import java.util.Arrays;
/**
 * Created by grin on 21.11.2016.
 */
class Duplicate {

    String[] deleteDuplicate(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j].equals(arr[i]) && arr[i] != null)
                    arr[j] = null;
        }
        String[] copyArray = new String[arr.length];
        int count = 0;

        for (String element : arr) {
            if (element != null)
                copyArray[count++] = element;
        }
        return Arrays.copyOf(copyArray, count);
    }

    String[] deleteDuplicateStreamApi(String[] arr) {
        return Arrays.stream(arr).distinct().toArray(String[]::new);
    }
}
