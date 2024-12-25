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

    /**
     * Метод для вывода сравнения времени выполнения операций.
     */
    public void displayResults() {
        long addListTime = listEval.timeAdd();
        long getListTime = listEval.timeGet();
        long removeListTime = listEval.timeRemove();

        long addLinkTime = linkEval.timeAdd();
        long getLinkTime = linkEval.timeGet();
        long removeLinkTime = linkEval.timeRemove();

        System.out.println("==============================================================================");
        System.out.println("| Collection | Number of items | ms adding | ms getting | ms removing       |");
        System.out.println("==============================================================================");
        System.out.printf("| %-10s | %-14d | %-10d | %-10d | %-10d |\n", "ArrayList", count, addListTime, getListTime, removeListTime);
        System.out.printf("| %-10s | %-14d | %-10d | %-10d | %-10d |\n", "LinkedList", count, addLinkTime, getLinkTime, removeLinkTime);
        System.out.println("==============================================================================");
    }
}
