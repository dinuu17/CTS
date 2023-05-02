package flyweight.clase;

public class Spectator implements ISpectator{
    private float inaltime;
    private float latimeUmeri;
    private int id;

    public Spectator(float inaltime, float latimeUmeri, int id) {
        super();
        this.inaltime = inaltime;
        this.latimeUmeri = latimeUmeri;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Spectator{" +
                "inaltime=" + inaltime +
                ", latimeUmeri=" + latimeUmeri +
                ", id=" + id +
                '}';
    }

    @Override
    public void deseneazaSpectator(PozitieDesenare pozitieDesenare) {
        System.out.println(this.toString() + pozitieDesenare);
    }
}
