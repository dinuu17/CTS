package simple_factory;

public class Anestezist implements PersonalSpital{

    private String name;
    private int nrPacienti;

    public Anestezist(String name, int nrPacienti) {
        this.name = name;
        this.nrPacienti = nrPacienti;
    }

    @Override
    public void descriere() {
        System.out.println("Anestezistul " + this.name + " are " + this.nrPacienti + " pacienti");
    }
}
