package oopTema;

import java.util.List;

public class SportivFotbal extends Sportivi {

    public List<String> alteInfoFotbalist;


    public SportivFotbal(int varsta, double inaltime, double greutate, List<String>alteInfoFotbalist) {
        super(varsta, inaltime, greutate);
        this.alteInfoFotbalist = alteInfoFotbalist;
    }

    public void infoSportivFotbal() {
        infoSportivi();
        System.out.println("Alte info despre fotbalist sunt: " + alteInfoFotbalist);
    }
}
