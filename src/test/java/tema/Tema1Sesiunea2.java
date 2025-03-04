package tema;

import org.testng.annotations.Test;

public class Tema1Sesiunea2 {

    public int varsta;
    public String nume;
    public String prenume;

    @Test
    public void tema1 () {
        varsta = 24;
        nume = "Jude";
        prenume = "Razvan";

        afiseazaHelloMsg();

        System.out.println("Varsta mea este: " + varsta);
        System.out.println("Numele meu este: " + nume);
        System.out.println("Prenumele meu este: " + prenume);
        System.out.println("Salut" + ' ' + 'M');
        System.out.println('H' + "Hello");
        System.out.println("Ana" + 'Z' + " are" + 'Z' + " mere" + 'Z' + ',' + " pere" + 'Z'+ ',' + " prune" + 'Z');

        salariuAngajat("Andrei");
        afisamIdsiDepartament("Popescu");
        afisamNrDepartament(288);
        ecuatie();

    }

   //Hello Word
    public static void afiseazaHelloMsg () {
        System.out.println("Hello World!");
    }

    // Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"
    //public static void puneZDupaVOcale() {
    //    String text = "Ana are mere,pere,prune";
   // }

    //Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;
    public static void salariuAngajat (String nume){

        if (nume == "Andrei"){
            System.out.println("Salariul este de 5$/ora ");
        }
    }

    //Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"

    public static void afisamIdsiDepartament (String numeAngajat){
        if (numeAngajat == "Popescu") {
            System.out.println("ID este 123 si Departamentul este IT. ");
        } else {
            System.out.println("Angajatul nu este Popescu deci nu vom afisa nimic ");
        }
    }

    //Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;

    public void afisamNrDepartament (int nr){

       if (nr > 287) {
           System.out.println("Nr departamnet este " + nr);
       }else {
           System.out.println("Numărul departamentului " + nr + " nu este mai mare de 287.");
        }
    }

    //Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3 ?

    public void ecuatie () {

        double rezultat = (2 + (3 * 4) - 3) / 3.0;
        System.out.println("Rezultatul ecuatiei este: " + rezultat);
    }


}
