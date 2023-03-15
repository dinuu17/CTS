package singleton_registry;

import java.util.HashMap;
import java.util.Map;

public class domeniuInternet {
    private String nume;
    private int anInregistrare;
    private static Map<String, domeniuInternet> domeniiInternet = new HashMap<>();

    public domeniuInternet(String nume, int anInregistrare) {
        this.nume = nume;
        this.anInregistrare = anInregistrare;
    }

    public void setAnInregistrare(int anInregistrare) {
        this.anInregistrare = anInregistrare;
    }

    @Override
    public String toString() {
        return "domeniuInternet{" +
                "nume='" + nume + '\'' +
                ", anInregistrare=" + anInregistrare +
                '}';
    }

    public static domeniuInternet getDomeniu(String nume){
            if (domeniiInternet.containsKey(nume)){
                return domeniiInternet.get(nume);
            }else {
                domeniuInternet ddomeniuInternet = new domeniuInternet(nume, 2023);
                domeniiInternet.put(nume, ddomeniuInternet);
                return ddomeniuInternet;
            }
    }

}
