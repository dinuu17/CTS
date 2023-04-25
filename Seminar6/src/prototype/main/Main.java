package prototype.main;

import prototype.classes.Prototype;
import prototype.classes.Reteta;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, Float> solutii = new HashMap<String, Float>();
        solutii.put("sol1",(float)40.2);
        solutii.put("sol2",(float)59.8);
        solutii.put("sol3",(float)100);

        Prototype reteta = new Reteta("Reteta1", (float)200,solutii);

        Prototype retetaLaborator = reteta.clonare();
        Prototype retetaPacient = reteta.clonare();

        System.out.println(retetaLaborator.toString());

    }
}
