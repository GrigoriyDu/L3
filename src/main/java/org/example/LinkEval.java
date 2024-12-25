package org.example;

import java.util.LinkedList;
import java.util.List;

/**
 * Класс для измерения производительности операций с LinkedList.
 */
public class LinkEval implements Eval{
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

    /**
     * Метод для заполнения LinkedList.
     */
    private void initList() {
        data.clear();
        for (int i = 0; i < count; i++) {
            data.add(i);
        }
    }

    /**
     * Метод для измерения времени добавления элементов в LinkedList.
     *
     * @return время выполнения в миллисекундах
     */
    @Override
    public long timeAdd() {
        return measureTime(() -> {
            initList();
        });
    }

    /**
     * Метод для измерения времени получения элементов из LinkedList.
     *
     * @return время выполнения в миллисекундах
     */
    @Override
    public long timeGet() {
        return measureTime(() -> {
            for (int i = 0; i < count; i++) {
                data.get(i);
            }
        });
    }
}
