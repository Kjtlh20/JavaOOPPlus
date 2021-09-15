/* 3) Реализуйте IntSupplier последовательно возвращающий элемент из массива целых чисел.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.function.IntSupplier;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntSupplier intSup = new Sample(a);
        for (int i = 0; i < a.length; i++) {
            try {
                System.out.println(intSup.getAsInt());
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }

        }
        try {
            System.out.println(intSup.getAsInt());
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
