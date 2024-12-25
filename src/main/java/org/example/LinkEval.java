package org.example;


import java.util.LinkedList;
import java.util.List;

/**
 * Класс для измерения производительности операций с LinkedList.
 */
public class LinkEval {
    private List<Integer> data = new LinkedList<>();
    private int count;

    /**
     * Конструктор класса LinkEval.
     *
     * @param givenCount количество операций
     */
    public LinkEval(int givenCount) {
        count = givenCount;
    }
}
