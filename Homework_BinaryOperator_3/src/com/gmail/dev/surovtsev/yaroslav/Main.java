/* 3) Создайте реализацию BinaryOperator<List<T extends Comparable<T>>
 * который будет возвращать список в котором находиться минимальный элемент
 * среди двух списков использованных в качестве параметра. Например для
 * списков [5,0,3,4] и [10,-2, 5] нужно вернуть [10, -2, 5] так как элемент -2 минимален
 * среди элементов этих списков.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        BinaryOperator<List<Integer>> biOp1 = Main::getListWithMinElement;
        BinaryOperator<List<Cat>> biOp2 = Main::getListWithMinElement;

        List<Integer> list1 = new ArrayList<>(List.of(5, 0, 3, 4));
        List<Integer> list2 = new ArrayList<>(List.of(10, -2, 5));
        System.out.println(list1 + " or " + list2);
        System.out.println(biOp1.apply(list1, list2));

        List<Cat> list3 = new ArrayList<>(List.of(new Cat("Cat1", 5), new Cat("Cat2", 1)));
        List<Cat> list4 = new ArrayList<>(List.of(new Cat("Cat3", 3), new Cat("Cat4", 7)));
        System.out.println(list3 + " or " + list4);
        System.out.println(biOp2.apply(list3, list4));
    }

    public static <T extends Comparable<T>> List<T> getListWithMinElement(List<T> list1, List<T> list2) {
        List<T> result = list1;
        T min1 = Collections.min(list1);
        T min2 = Collections.min(list2);
        if (min2.compareTo(min1) < 0) {
            result = list2;
        }
        return result;
    }
}
