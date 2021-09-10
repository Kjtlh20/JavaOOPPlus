/* 5)Используя примитивную специализацию Function реализуйте функционал который на основе
 * объекта типа java.util.Calendar вернет целое число значение которого равно году хранимому в Calendar.
 */
package com.gmail.dev.surovtsev.yaroslav;

import java.util.Calendar;
import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {
        ToIntFunction<Calendar> toIntFunc = calendar -> calendar.get(Calendar.YEAR);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        System.out.println(toIntFunc.applyAsInt(calendar));
    }
}
