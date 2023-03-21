package factory_method.main;

import factory_method.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Factory factoryMedici=new FactoryMedic();
        Factory factoryAsistenti=new FactoryAsistent();
        Factory factoryBrancardier=new FactoryBrancardier();
        List<PersonalSpital> listaPersonal=new ArrayList<>();

        listaPersonal.add(factoryMedici.createPersonal("Ion"));
        listaPersonal.add(factoryAsistenti.createPersonal("Gica"));
        listaPersonal.add(factoryBrancardier.createPersonal("Catalin"));
        listaPersonal.add(factoryMedici.createPersonal("Alin"));
        listaPersonal.add(factoryAsistenti.createPersonal("Sam"));

        for(PersonalSpital p: listaPersonal)
            p.descriere();
    }
}
