package decorator.clase;

public abstract class Decorator implements IBilet{
    private IBilet bilet;

    public Decorator(IBilet bilet) {
        super();
        this.bilet = bilet;
    }

    public IBilet getBilet() {
        return bilet;
    }
    @Override
    public String getNumeEchipa1(){
        return bilet.getNumeEchipa1();
    }
    @Override
    public void printareBilet() {
        this.bilet.printareBilet();
        printareMesajSustinere();
    }

    public abstract void printareMesajSustinere();

}
