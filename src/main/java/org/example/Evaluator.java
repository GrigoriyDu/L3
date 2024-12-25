package org.example;

/**
 * Класс для сравнения производительности ArrayList и LinkedList.
 */
public class Evaluator {
    private int count;
    private Eval listEval;
    private Eval linkEval;

    /**
     * Конструктор класса Evaluator.
     *
     * @param givenCount количество операций
     */
    public Evaluator(int givenCount) {
        this.count = givenCount;
        this.listEval = new ListEval(givenCount);
        this.linkEval = new LinkEval(givenCount);
    }

}
