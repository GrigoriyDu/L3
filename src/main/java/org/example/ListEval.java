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

    /**
     * Метод для измерения времени добавления элементов в ArrayList.
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
     * Метод для заполнения ArrayList.
     */
    private void initList() {
        data.clear();
        for (int i = 0; i < count; i++) {
            data.add(i);
        }
    }

    /**
     * Метод для измерения времени получения элементов из ArrayList.
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