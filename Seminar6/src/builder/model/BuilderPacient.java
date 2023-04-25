package builder.model;

public class BuilderPacient implements Builder{

    Pacient pacient;


    public BuilderPacient(String jon) {
        this.pacient = new Pacient("Costel", false, false, false, false);
    }

    @Override
    public Pacient build(){
        return pacient;
    }

    public BuilderPacient setNume(String nume) {
        pacient.setNume(nume);
        return this;
    }

    @Override
    public Builder setPatRabatabil(Boolean patRabatabil) {
        return null;
    }

    @Override
    public Builder setMidDejunInclud(Boolean midDejunInclud) {
        return null;
    }

    @Override
    public Builder setPapuciDeCamera(Boolean papuciDeCamera) {
        return null;
    }

    @Override
    public Builder setHalatPentruInterior(Boolean halatPentruInterior) {
        return null;
    }

    public BuilderPacient setPatRabatabil(boolean patRabatabil) {
       pacient.setPatRabatabil(patRabatabil);
       return this;
    }

    public BuilderPacient setMicDejunInclus(boolean micDejunInclus) {
        pacient.setMicDejunInclus(micDejunInclus);
        return this;
    }

    public BuilderPacient setPapuciDeCamera(boolean papuciDeCamera) {
        pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    public BuilderPacient setHalatPentruInterior(boolean halatPentruInterior) {
        pacient.setHalatPentruInterior(halatPentruInterior);
        return this;
    }

}
