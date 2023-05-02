package decorator.main;

import decorator.clase.Bilet;
import decorator.clase.BiletDecorat;
import decorator.clase.Decorator;
import decorator.clase.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet1 = new Bilet("Silviu","Romania","Spania");
        IBilet bilet2 = new Bilet("Silviu","Anglia","Germania");
        IBilet bilet3 = new Bilet("Silviu","Qatar","Spania");

        bilet1.printareBilet();
        bilet2.printareBilet();
        bilet3.printareBilet();

        Decorator decoratorBilet1 = new BiletDecorat(bilet1);
        Decorator decoratorBilet2 = new BiletDecorat(bilet2);
        decoratorBilet1.printareBilet();
        decoratorBilet2.printareBilet();
    }
}
