package org.example;

import java.time.Duration;
import java.time.Instant;

/**
 * Интерфейс для измерения производительности операций с коллекциями.
 */
public interface Eval {

    /**
     * Метод для измерения времени добавления элементов.
     *
     * @return время выполнения в миллисекундах
     */
    long timeAdd();

    /**
     * Метод для измерения времени получения элементов.
     *
     * @return время выполнения в миллисекундах
     */
    long timeGet();

    /**
     * Метод для измерения времени удаления элементов.
     *
     * @return время выполнения в миллисекундах
     */
    long timeRemove();

    /**
     * Метод для измерения времени выполнения заданного кода.
     *
     * @param task задача для измерения времени
     * @return время выполнения в миллисекундах
     */
    default long measureTime(Runnable task) {
        Instant startTime = Instant.now();
        task.run();
        Instant endTime = Instant.now();
        return Duration.between(startTime, endTime).toMillis();
    }
}