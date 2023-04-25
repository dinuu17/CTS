package builder.model;

public class BuilderPacientV2 implements Builder {

    private String nume;
    private Boolean patRabatabil;
    private Boolean midDejunInclud;
    private Boolean papuciDeCamera;
    private Boolean halatPentruInterior;

    public BuilderPacientV2() {
        this.nume = "Anonim";
        this.patRabatabil = false;
        this.midDejunInclud = false;
        this.papuciDeCamera = false;
        this.halatPentruInterior = false;
    }

    @Override
    public Pacient build() {
        return new Pacient(this.nume,this.patRabatabil,this.midDejunInclud,this.papuciDeCamera,this.halatPentruInterior);
    }

    public Builder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public Builder setPatRabatabil(Boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public Builder setMidDejunInclud(Boolean midDejunInclud) {
        this.midDejunInclud = midDejunInclud;
        return this;
    }

    public Builder setPapuciDeCamera(Boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
        return this;
    }

    public Builder setHalatPentruInterior(Boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
        return this;
    }
}