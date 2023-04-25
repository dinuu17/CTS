package composite.clase;

public class Autobuz implements Element {
    private String producator;
    private int capacitateCilindrica;

    public Autobuz(String producator, int capacitateCilindrica, int nrLocuri) {
        this.producator = producator;
        this.capacitateCilindrica = capacitateCilindrica;
        this.nrLocuri = nrLocuri;
    }

    private int nrLocuri;

    @Override
    public float calculareSumaAsigurare() {
        float suma = (float) (1.5 * this.capacitateCilindrica);
        return suma;
    }

    @Override
    public void afisareSumaAsigurare() {
        System.out.println("Suma de asigurare pentru autobuzul "+ this.producator + " este " +this.calculareSumaAsigurare());
    }

    @Override
    public void adaugaGrup(Element grupGeneral) {
        throw new IllegalArgumentException("Operatia aceasta nu este implementata");
    }

    @Override
    public void stergeGrup(Element grupGeneral) {
        throw new IllegalArgumentException("Operatia aceasta nu este implementata");
    }

    @Override
    public Element getGrup(int pozitie) {
        throw new IllegalArgumentException("Operatia aceasta nu este implementata");
    }
}
