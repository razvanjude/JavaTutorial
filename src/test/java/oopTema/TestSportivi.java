package oopTema;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TestSportivi {

    @Test
    public void testMethod(){

        SportivBaschet jucatorVladutz = new SportivBaschet(17, 186,88, Arrays.asList("Jucator la liceu"));
        jucatorVladutz.infoSportivBaschet();

        System.out.println();

        SportivFotbal jucatorFlorinel = new SportivFotbal(21,178,78,Arrays.asList("A fost transferat Barca", "Joaca ca si atacant"));
        jucatorFlorinel.infoSportivFotbal();
    }
}
