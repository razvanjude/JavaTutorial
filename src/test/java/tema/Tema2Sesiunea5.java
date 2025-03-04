package tema;

import org.testng.annotations.Test;

public class Tema2Sesiunea5 {

    @Test
    public void tema2() {
        //afiseazaCuvantulDa(5);
        //afiseazaCUvantulDaWHile(5);
        //afisamPrimeleNumere(3);
        //afisamNrMare(20,15);
        //afisamNumarMic();
        //afisamNrPareSiImpare();
        //afisamDoarNrPare();
        //afisamNrDivCu5();
        //afiseazaPrimeleTreiNrDivizibile();
        //afisamSumaNr();
        //afisamSumaPrimelor10Nr();
        afisamProdusul();

    }

//    public static void afiseazaCuvantulDa (int counter) {
//        //Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
//
//       for (int i=1; i<=6 ; i++){
//
//           if (i<6) {
//               System.out.print("DA ");
//           }
//       }
//    }

//    public static void afiseazaCUvantulDaWHile(int numar) {
//    //Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
//
//        int i=0;
//        while(i<numar) {
//            System.out.print("DA ");
//            i++;
//        }
//    }

//    public static void afisamPrimeleNumere (int numere){
//        //Afisam in consola primele 3 numere de la 1 la 3;
//
//        for (int i=1; i<=3; i++){
//            System.out.print(i + " ");
//        }
//
//    }

//    public static void afisamNrMare (int nr1, int nr2) {
//
//        //Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
//
//        if (nr1 > nr2) {
//            System.out.println("Numarul mai mare este: " + nr1);
//        } else  {
//            System.out.println("Numarul mai mare este: " + nr2);
//        }
//    }

//    public static void afisamNumarMic() {
//
//        //Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
//
//        double a = 4.5;
//        double b = 3.25;
//
//        if (a>b) {
//            System.out.println("Numarul mai mic este: " + b);
//        } else {
//            System.out.println("Numarul mai mic este: " + a);
//        }
//    }

//    public static void afisamNrPareSiImpare() {
//
//        //Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");
//
//        System.out.println("Numere pare până la 10: ");
//        for (int i = 0; i <= 10;  i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + "  ");
//            }
//        }
//
//        System.out.println("Numere impare până la 10:");
//        for (int i = 0; i <= 10;  i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + "  ");
//            }
//        }
//    }

//    public static void afisamDoarNrPare () {
//        //Afisam in consola doar numerele pare pana la 10 (utilizam "for");
//
//        for (int i = 0; i <= 10;  i++) {
//            if (i % 2 == 0) {
//                System.out.println("Numerele pare pana la 10 sunt: " + i);
//           }
//        }
//    }

//    public static void afisamNrDivCu5() {
//        //Afisam in consola numerele divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
//
//        int a=0;
//        int b=44;
//
//        for (int i=a; i<=b; i++) {
//            if (i%5==0) {
//                System.out.println("Numerele divizibile cu 5 sunt: " + i);
//            }
//        }
//    }

//    public static void afiseazaPrimeleTreiNrDivizibile() {
////Afisam in consola primele 3 numere dibizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
//
//        int limitaNumere = 3;
//        for (int i = 0, gasite = 0; gasite < limitaNumere; i++) {
//            if (i % 5 == 0) {
//                System.out.print(" " + i);
//                gasite++;
//            }
//        }
//
//    }

//    public static void afisamSumaNr() {
//
//        //Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;
//
//        int a= 235;
//        int b= 10;
//        int suma= a+b;
//        System.out.println("Suma celor 2 nr este: " + suma);
//    }

//    public static void afisamSumaPrimelor10Nr() {
//        //Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;
//
//        int suma = 0;
//        for (int i = 1; i <= 10; i++) {
//            suma += i;
//        }
//        System.out.println("Suma numerelor de la 1 la 10 este: " + suma);
//
//    }

    public static void afisamProdusul() {
     //Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;

        int produs = 1;
        for (int i = 1; i <= 5; i++) {
            produs *= i;
        }
        System.out.println("Produsul numerelor de la 1 la 5 este: " + produs);

    }
}

