package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Element {

    private List<Element> elemente;
    private String denumireGrup;

    public Grup(String denumireGrup) {
        super();
        this.elemente = new ArrayList<>();
        this.denumireGrup = denumireGrup;
    }

    @Override
    public float calculareSumaAsigurare() {
        float suma = 0;
        for(Element grupGeneral : elemente)
        {
            suma += grupGeneral.calculareSumaAsigurare();
        }
        return suma;
    }

    @Override
    public void afisareSumaAsigurare() {

        System.out.println("Suma pentru asigurare este de " + calculareSumaAsigurare());
    }

    @Override
    public void adaugaGrup(Element grupGeneral) {
        this.elemente.add(grupGeneral);
    }

    @Override
    public void stergeGrup(Element grupGeneral) {
        this.elemente.remove(grupGeneral);
    }

    @Override
    public Element getGrup(int pozitie) {
        return this.elemente.get(pozitie);
    }
}
