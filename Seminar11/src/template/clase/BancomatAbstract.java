package template.clase;

public abstract class BancomatAbstract {
    private String adresa;

    public BancomatAbstract(String adresa) {
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    protected abstract void introducereCard();
    protected abstract void introducerePin();
    protected abstract void specificaSuma(int suma);
    protected abstract void retragereSuma();
    protected abstract void retragereCard();
    public final void scoateBaniDeLaBancomat(int suma){
        introducereCard();
        introducerePin();
        specificaSuma(suma);
        retragereSuma();
        retragereCard();
    } //nu merge suprascrisa

}