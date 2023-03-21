package simple_factory.main;

import simple_factory.Asistent;
import simple_factory.Factory;
import simple_factory.PersonalSpital;
import simple_factory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Factory factoryPersonal = new Factory();

        List<PersonalSpital> listaPersonal = new ArrayList<>();

        PersonalSpital brancardier = factoryPersonal.createObject(TipPersonal.BRANCARDIER,"George");
        PersonalSpital asistent = factoryPersonal.createObject(TipPersonal.ASISTENT,"Marius");

        listaPersonal.add(brancardier);
        listaPersonal.add(asistent);
        listaPersonal.add(factoryPersonal.createObject(TipPersonal.MEDIC,"Ion"));
        listaPersonal.add(factoryPersonal.createObject(TipPersonal.MEDIC,"Cristi"));
        listaPersonal.add(factoryPersonal.createObject(TipPersonal.ASISTENT,"Sorin"));

        listaPersonal.add(factoryPersonal.createObject(TipPersonal.ANESTEZIST,"Gabi", 10));

        for(PersonalSpital p : listaPersonal){
            p.descriere();
        }



    }
}
