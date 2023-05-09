package state.main;

import state.clase.Bancomat;

public class Main {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(1000);
        bancomat.introducePIN();
        bancomat.retrageCard();
        bancomat.introduceCard();
        bancomat.introducePIN();
        bancomat.retrageBani(800);
        bancomat.retrageCard();
        bancomat.introduceCard();
        bancomat.introducePIN();
        bancomat.retrageBani(500);
        bancomat.retrageCard();
    }
}
