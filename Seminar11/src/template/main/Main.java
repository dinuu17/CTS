package template.main;

import template.clase.Bancomat;
import template.clase.BancomatAbstract;

public class Main {
    public static void main(String[] args) {
        BancomatAbstract bancomat = new Bancomat("Romana");
        bancomat.scoateBaniDeLaBancomat(400);
    }
}
