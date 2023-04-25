package builder.model;

public interface Builder {
    public Pacient build();

    public Builder setNume(String nume);
    public Builder setPatRabatabil(Boolean patRabatabil);

    public Builder setMidDejunInclud(Boolean midDejunInclud);

    public Builder setPapuciDeCamera(Boolean papuciDeCamera);
    public Builder setHalatPentruInterior(Boolean halatPentruInterior);
}