package template.clase;

public class Bancomat extends BancomatAbstract{

    public Bancomat(String adresa) {
        super(adresa);
    }

    @Override
    protected void introducereCard() {
        System.out.println("A fost introdus cardul in bancomatul din "+super.getAdresa());
    }

    @Override
    protected void introducerePin() {
        System.out.println("A fost introdus PIN-ul in bancomatul din "+super.getAdresa());
    }

    @Override
    protected void specificaSuma(int suma) {
        System.out.println("A fost specificata pentru retragere suma de " +suma);
    }

    @Override
    protected void retragereSuma() {
        System.out.println("A fost retrasa suma specificata din bancomatul din "+ super.getAdresa());
    }

    @Override
    protected void retragereCard() {
        System.out.println("A fost retras cardul din bancomatul din "+ super.getAdresa());
    }
}