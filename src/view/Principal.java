package view;

import controller.Generator;
import controller.Observer;

public class Principal {

    public static void main(String[] args) {
        Observer obs = new Observer();
        Generator gen = new Generator(obs);

        gen.rng();
    }
}