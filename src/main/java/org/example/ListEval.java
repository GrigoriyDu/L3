package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для измерения производительности операций с ArrayList.
 */
public class ListEval implements Eval {
    private List<Integer> data = new ArrayList<>();
    private int count;

    /**
     * Конструктор класса ListEval.
     *
     * @param givenCount количество операций
     */
    public ListEval(int givenCount) {
        count = givenCount;
    }
}