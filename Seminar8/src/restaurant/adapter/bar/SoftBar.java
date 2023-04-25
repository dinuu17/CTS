package restaurant.adapter.bar;

public class SoftBar implements ISoftBar{
    private String denumire;
    private double totalPlataNota;

    public SoftBar(String denumire, double totalPlataNota) {
        this.denumire = denumire;
        this.totalPlataNota = totalPlataNota;
    }

    @Override
    public void printeazaNotaBauturi(double totalPlata) {
        System.out.println("");
    }
}
