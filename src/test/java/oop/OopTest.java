package oop;

import org.testng.annotations.Test;

import java.util.Arrays;

public class OopTest {

    @Test
    public void testMethod() {
        RangeRover AliceSport = new RangeRover("Range Rover", "Sport",
                "Negru", 2023, Arrays.asList("Aer conditionat", "Geamuri electrice", "oglinzi incalzite"));
        AliceSport.infoRangeRover();
        AliceSport.pornesteMasina();
        AliceSport.promotie();

        System.out.println();

        RangeRover alexSport = new RangeRover("Range Rover", "Sport",
                "negru", 2023, 35000, Arrays.asList("Aer conditionat", "Geamuri electrice", "Oglinzi incalzite"));
        alexSport.infoRangeRover();
        alexSport.setCuloare("Rosu");
        alexSport.infoRangeRover();

        System.out.println(alexSport.getPret());
        alexSport.promotie(5);
        alexSport.promotie("de 10% la a 2-a achizitie");

        System.out.println();
    }


}
