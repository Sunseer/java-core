package ru.agrin;

/**
 * Created by grin on 21.11.2016.
 */
public class Duplicate {

    String[] abc = new String[] {"bal", "val", "val", "dal"};

    public String[] deleteDuplicate(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].equals(arr[i]) && arr[i] != null)
                    arr[j] = null;
            }
        }
        return arr;
    }
}
