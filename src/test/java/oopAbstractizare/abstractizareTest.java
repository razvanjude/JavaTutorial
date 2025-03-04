package oopAbstractizare;

import org.testng.annotations.Test;

public class abstractizareTest {

    @Test
    public void metodaTest() {

        ElevPersoana Obiect1 = new ElevPersoana("Jude", "Razvan", 33, "IOn Mester", 2);
        Obiect1.infoElev();

        System.out.println();

        angajatPersoana Obiect2 = new angajatPersoana("Vladutz", "Ionutz", 34, "HP", "23",1221);
        Obiect2.infoAngajat();

        System.out.println();

        elevAngajat Obiect3 = new elevAngajat("John", "Smith", 17, "DOnald DUck", 12, "HP","7 ani",1234);
        Obiect3.infoPersoana();
    }
}
