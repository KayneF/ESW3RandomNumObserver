package controller;

public class Observer implements IObservador, IAcao {

    public void rng() {
        System.out.println("\n *** Observer *** ");
        System.out.println("O gerador criou um novo número.");
    }

    public void even() {
        System.out.println("O valor é par.");
    }

    public void odd() {
        System.out.println("O valor é ímpar.");
    }

    @Override
    public void update(int act) {
        rng();
        System.out.println("O valor gerado foi " + act);
        if (act % 2 == 0) even();
        if (act % 2 == 1) odd();
    }
}