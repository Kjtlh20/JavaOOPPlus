/* 2)Реализуйте обобщенный метод поиска максимального элемента в массиве объектов.
 * Для этого укажите ограничение для параметра типа этого метода как Comparable<T>.
 * Сигнатура такого метода должна выглядеть следующим образом:
 * <T extends Comparable<T>> T max(T[] array)
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 4);
        Rectangle r2 = new Rectangle(4, 5);
        Rectangle r3 = new Rectangle(2, 1);
        Rectangle r4 = new Rectangle(2, 1);
        Rectangle r5 = new Rectangle(2, 2);

        Rectangle[] array = new Rectangle[]{r1, r2, r3, r4, r5};
        System.out.println(Arrays.toString(array));

        Rectangle maxRectangle = max(array);
        System.out.println("max: " + maxRectangle.toString());
        System.out.println(Arrays.toString(array));
    }

    public static <T extends Comparable<T>> T max(T[] array) {
        int n = array.length;
        T[] tempArray = Arrays.copyOf(array, n);
        Arrays.sort(tempArray);
        return tempArray[n - 1];
    }
}
