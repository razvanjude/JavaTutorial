package constant;

import org.testng.annotations.Test;

public class ConstantConcept {

    //Conastanta= conceptul prin care definim o proprietate care nu isi mai modifica valoarea initiala

    public final String nume = "Razvan";

    @Test
    public void testMethod() {


        System.out.println(nume);

        //nume = "Alex";
        System.out.println(nume);
    }
}
