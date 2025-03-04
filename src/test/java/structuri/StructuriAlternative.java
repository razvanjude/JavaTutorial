package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Exista 2 tipuri de structuri in programare: alternative si repetitive
    //Structuri alternative: IF...ELSE, SWITCH...CASE

    @Test
    public void metodaTest (){
        afisamNrMaiMare(10,14);
        afisamNrMaiMare(14,16);
        afisamNrMaiMare(18,18);

        verifcamNrDivizibil5(50);
        verifcamNrDivizibil5(61);

        afisamZileleSaptamanii(4);
        afisamZileleSaptamanii(10);

    }

    //Afisam numarul mai mare dintre 2 valori

    public void afisamNrMaiMare (int nr1, int nr2) {

        if (nr1 == nr2) {
            System.out.println("Cele 2 nr sunt egale: ");
        } else    if (nr1 > nr2) {
            System.out.println("Numarul mai mare este: " + nr1);
        } else {
            System.out.println("Numarul mai mare este: " + nr2);
        }
    }

    //Verificam ca un numar este divizibil cu 5

    public void verifcamNrDivizibil5 (int nr) {

        if (nr%5 ==0) {
            System.out.println("Numarul este divizibil cu 5 ");
        }
    }

    //Afisam zilele saptamanii
    public void afisamZileleSaptamanii (int zi) {

        switch (zi) {
            case 1:
                System.out.println("Azi e luni");
                break;
            case 2:
                System.out.println("Azi e marti");
                break;
            case 3:
                System.out.println("Azi e miercuri");
                break;
            case 4:
                System.out.println("Azi e joi");
                break;
            case 5:
                System.out.println("Azi e vineri");
                break;
            case 6:
                System.out.println("Azi e sambata");
                break;
            case 7:
                System.out.println("Azi e duminica");
                break;
                default: System.out.println("Nu mai sunt zile");
        }
    }

}
