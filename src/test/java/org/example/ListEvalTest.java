package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListEvalTest {

    private ListEval listEval;
    private final int operationCount = 1000;

    @BeforeEach
    public void setUp() {
        listEval = new ListEval(operationCount);
    }

    @Test
    public void testTimeAdd() {
        long timeTaken = listEval.timeAdd();
        assertTrue(timeTaken >= 0, "Время добавления должно быть неотрицательным");
    }

    @Test
    public void testTimeGet() {
        listEval.timeAdd();
        long timeTaken = listEval.timeGet();
        assertTrue(timeTaken >= 0, "Время доступа должно быть неотрицательным");
    }

    @Test
    public void testTimeRemove() {
        listEval.timeAdd();
        long timeTaken = listEval.timeRemove();
        assertTrue(timeTaken >= 0, "Время удаления должно быть неотрицательным");
    }
}