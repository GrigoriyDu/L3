package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkEvalTest {

    private LinkEval linkEval;
    private final int operationCount = 1000;

    @BeforeEach
    public void setUp() {
        linkEval = new LinkEval(operationCount);
    }

    @Test
    public void testTimeAdd() {
        long timeTaken = linkEval.timeAdd();
        assertTrue(timeTaken >= 0, "Время добавления должно быть неотрицательным");
    }

    @Test
    public void testTimeGet() {
        linkEval.timeAdd(); // Заполнить коллекцию для проверки
        long timeTaken = linkEval.timeGet();
        assertTrue(timeTaken >= 0, "Время доступа должно быть неотрицательным");
    }

    @Test
    public void testTimeRemove() {
        linkEval.timeAdd(); // Заполнить коллекцию для проверки
        long timeTaken = linkEval.timeRemove();
        assertTrue(timeTaken >= 0, "Время удаления должно быть неотрицательным");
    }
}