package structuri;

import org.testng.annotations.Test;

public class structuriRepetitive {

    //Structurile repetitive sunt FOR, WHILE

    @Test
    public void metodaTest() {
       // AfisareNrFor(50);
        //AfisareNrFor(50);
        //AfisareNrPare();
        //AfisareNrPareV2();
        afisareNrWhile(10);
    }

    //Afisam primele N numere
    public void AfisareNrFor (int capat) {

        for (int i =0 ; i<=capat; i++) {
            System.out.println("Numarul afisat este: " + i);
        }
    }

    //Afisam NR cu WHILE
    public void afisareNrWhile (int capat) {
        int i=0;
        while (i<=capat){
            System.out.println("Numarul afisat este: " + i);
            i++;
        }
    }

    public void AfisareNrForDesc (int capat) {

        for (int i =0 ; i>=0; i--) {
            System.out.println("Numarul afisat este: " + i);
        }
    }

    //Afisam numerele pare de la 0 la 50
    public void AfisareNrPare () {

        for (int i =0 ; i<=50; i=i+2) {
            System.out.println("Numarul par este: " + i);
        }
    }

    public void AfisareNrPareV2 () {

        for (int i=0; i<=50; i++) {
            if (i%2==0){
                System.out.println("Numarul par este: " + i);
            }
        }
    }
}
