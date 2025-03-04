package oopTema;

import java.util.List;

public class SportivBaschet extends Sportivi {


    public List<String> infoAditionale;

    //cream constructorul
    public SportivBaschet(int varsta, double inaltime, double greutate, List<String>infoAditionale) {
        super(varsta, inaltime, greutate);
        this.infoAditionale = infoAditionale;
    }

    public void infoSportivBaschet() {

        infoSportivi();
        System.out.println("Alte info despre baschetbalist sunt: " + infoAditionale);
    }


}
