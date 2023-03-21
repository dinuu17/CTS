package prototype.main;

import prototype.Autobuz;
import prototype.MijlocTransport;

public class Main {
    public static void main (String[] args){
        MijlocTransport autobuz1 = new Autobuz("PH01CTS", 20);
        MijlocTransport autobuz2 = new Autobuz("B999BIG", 40);

        Autobuz autobuz3 = (Autobuz) autobuz2.clone();
        Autobuz autobuz4 = (Autobuz) autobuz2.clone();
        autobuz3.setNrInmatriculare("B222FRT");
        autobuz4.setNrInmatriculare("B111ICE");

        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
        System.out.println(autobuz3.toString());
        System.out.println(autobuz4.toString());

    }
}
