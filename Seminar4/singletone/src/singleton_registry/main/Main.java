package singleton_registry.main;

import singleton_registry.domeniuInternet;

public class Main {
    public static void main(String[] args) {
        domeniuInternet domeniuInternet1 = singleton_registry.domeniuInternet.getDomeniu("seminar4.ro");
        domeniuInternet domeniuInternet2 = singleton_registry.domeniuInternet.getDomeniu("seminar5.ro");
        domeniuInternet domeniuInternet3 = singleton_registry.domeniuInternet.getDomeniu("seminar6.ro");

        domeniuInternet1.setAnInregistrare(2021);
        domeniuInternet1.setAnInregistrare(2019);
        domeniuInternet1.setAnInregistrare(2020);

        System.out.println(domeniuInternet1.toString());
        System.out.println(domeniuInternet2.toString());
        System.out.println(domeniuInternet3.toString());
    }
}
