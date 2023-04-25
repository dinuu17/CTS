package composite.main;

import composite.clase.Autobuz;
import composite.clase.Element;
import composite.clase.Grup;

public class Main {

    public static void main(String[] args) {
        Element autobuz1 = new Autobuz("Mercedes", 3000, 9);
        Element autobuz2 = new Autobuz("Mercedes", 3000, 7);

        Element grupAutobuzeMici = new Grup("Autobuze mici");
        grupAutobuzeMici.adaugaGrup(autobuz1);
        grupAutobuzeMici.adaugaGrup(autobuz2);
        grupAutobuzeMici.afisareSumaAsigurare();

        Element autobuz3 = new Autobuz("Mercedes", 5000, 15);
        Element autobuz4 = new Autobuz("Mercedes", 4000, 11);

        Element grupAutobuzeMijlocii = new Grup("Autobuze mijlocii");
        grupAutobuzeMijlocii.adaugaGrup(autobuz3);
        grupAutobuzeMijlocii.adaugaGrup(autobuz4);
        grupAutobuzeMijlocii.afisareSumaAsigurare();

        Element flota = new Grup("autobuze");
        flota.adaugaGrup(grupAutobuzeMici);
        flota.adaugaGrup(grupAutobuzeMijlocii);
        flota.afisareSumaAsigurare();

        Element autobuzVIP = new Autobuz("Ford", 9000, 30);
        flota.adaugaGrup(autobuzVIP);
        flota.afisareSumaAsigurare();

    }

}
