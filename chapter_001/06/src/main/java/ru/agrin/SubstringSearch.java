package ru.agrin;

/**
 * Класс для поиска подстроки в строке.
 * Created by grin on 23.11.2016.
 */
class SubstringSearch {
    /**
     * Метод для поиска подстроки в строке, возвращает boolean.
     * @param origin - оригинальная строка.
     * @param sub - искомая подстрока.
     */
    boolean contains(String origin, String sub) {
        char[] originArray = origin.toCharArray();
        char[] subArray = sub.toCharArray();
        if (subArray.length > originArray.length)
            return false;
        int count = 0;
        for (int i = 0; i < originArray.length;) {
            if (originArray.length - i < subArray.length)
                return false;
            for (int j = 0; j < subArray.length; ) {
                if (subArray[j++] == originArray[i++]) {
                    count++;
                } else {
                    count = 0;
                    break;
                }
                if (count == subArray.length)
                    return true;
            }
        }
        return false;
    }
}
