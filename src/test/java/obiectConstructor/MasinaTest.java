package obiectConstructor;

import org.testng.annotations.Test;

public class MasinaTest {

    @Test
    public void testMethoda () {

        Masina Toyota = new Masina("Toyota" , "1600", 2024, 35000, "Corolla");
        Toyota.afiseazaDetalii();

        System.out.println();

        Masina Dacia = new Masina("Dacia", "3000", 1999, "Duster");
        Dacia.afiseazaDetalii();
    }

}
