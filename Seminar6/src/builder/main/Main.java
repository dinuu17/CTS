package builder.main;

import builder.model.BuilderPacient;
import builder.model.BuilderPacientV2;
import builder.model.Pacient;
import builder.model.Builder;

public class Main {
    public static void main(String[] args) {


        Builder builderPacient=new BuilderPacient("Jon");
        Pacient pacient1;
        Pacient pacient2;

        pacient1=builderPacient.setHalatPentruInterior(true).build();
        pacient2=builderPacient.setHalatPentruInterior(true).setMidDejunInclud(true).build();

        System.out.println(pacient1);
        System.out.println(pacient2);


        Builder builderPacientV2=new BuilderPacientV2();
        Pacient pacient3=builderPacientV2.setNume("ALEX").setPapuciDeCamera(true).build();
        Pacient pacient4=builderPacientV2.setNume("AJAA").build();

        System.out.println(pacient3);
        System.out.println(pacient4);

    }
}