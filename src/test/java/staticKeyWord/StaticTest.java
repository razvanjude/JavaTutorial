package staticKeyWord;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void testMethod() {

        Elev Razvan = new Elev("Razvan", "Jude", 20);
        Razvan.infoElev();
        System.out.println();

        Elev Vlad = new Elev("Vlad", "Grigore", 22);
        Vlad.infoElev();
    }
}
