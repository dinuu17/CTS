package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IBanca{
    public List<IClient> observeri;
    public String numeBanca;
    public Banca(String numeBanca) {
        this.numeBanca = numeBanca;
        this.observeri = new ArrayList<>();
    }
    @Override
    public void adaugaObserver(IClient client) {

    }

    @Override
    public void stergereObserver(IClient client) {

    }

    @Override
    public void notifica(String mesaj) {
        for(IClient observer:observeri){
            observer.afiseazaMesaj(mesaj);
        }
    }

    public void adaugaTipCreditNou(){
        notifica(numeBanca + " : Am adaugat un nou tip de credit !");
    }

    public void actualizeazaAplicatia(){
        notifica(numeBanca + ": Aplicatia a fost actualizata !");
    }
}
