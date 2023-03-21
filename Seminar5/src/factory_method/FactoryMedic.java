package factory_method;

public class FactoryMedic implements Factory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Brancardier(nume);
    }
}
