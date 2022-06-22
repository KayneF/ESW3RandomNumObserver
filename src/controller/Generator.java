package controller;

public class Generator implements IObservavel, IAcao {

    private Observer observer;
    private int act;

    public Generator(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyChange(int act) {
        observer.update(act);
    }

    public void rng() {
        act = (int)(Math.random()*1000) + 0;
        System.out.println("\n *** Generator *** ");
        System.out.println("Número gerado: " + act);
        notifyChange(act);
    }
}