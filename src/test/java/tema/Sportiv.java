package tema;

import org.testng.annotations.Test;

public class Sportiv {

    public String nume;
    public String prenume;
    public int varsta;
    public String categoria;
    public float greutatea;
    public String sportul;
    public char sexul;
    public boolean areMedalii;

    @Test
    public void infoSportiv (){

        nume = "Vladutz";
        prenume = "Muresan";
        varsta = 27;
        categoria = "incepator";
        greutatea = 83.7f;
        sportul = "fotbal";
        sexul = 'm';
        areMedalii = true;

        System.out.println("Acestea sunt urmatoarele informatii despre sportiv: " + nume + ' ' + prenume + ' ' + varsta);
        System.out.println("Informatii aditionale despre sportiv: " + sportul + ' ' + categoria + ' ' + greutatea);
        System.out.println("Are medalii? " + areMedalii);
    }
}
