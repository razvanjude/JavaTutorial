package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //clasa = sablon pe baza caruia putem defini un exeplu din viata reala
    //Intr-un fisier Java recunoastem o clasa dupa cuvantul CLASS
    //Este olbigatoriu pt o clasa sa aiba un nume
    //Intr-un fisier Java putem avea mai multe clase diferentiate prin numele acestora
    //Nu este un best practice in Java sa avem mai multe clase intr0un fisier
    //O clasa contine variabile si metode
    // variabila = proprietatea unei clase
    //O variabila poate sau nu sa aibe o valoare
    //O variabila isi poate modifica valoarea
    // valoarea unei variabile se stabilieste in functie de tipul de data
    //Exista 2 tipuri de variabile: globala si locala
    // o variabila globala se defineste specificand nivelul de vizibilitate (access control)
    //o variabila globala este vizibila peste tot in aceasta clasa
    // o variabila locala se defineste specificand tipul de data si un nume
    //o variabila locala este vizibila doar in locul in care am definit-o
    // metoda = actiunea specifica unei clase
    // intr-o clasa putem avea mai multe metode
    // exista 2 tipuri de metode: VOID si RETURN
    // Recunoastem o metoda dupa access control , tipul metodei, nume, (), {}
    //CTRL+ALT+L aranjeaza codul

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public  char gen;
    public  boolean areRestanta;

    public Student(String razvan, String jude, String number, String poli, String number1) {
    }

    @Test
    public void prezentareStudent () {
        nume = "Malina";
        prenume = "Alice";
        varsta = 24;
        adresa = "Bucuresti , str . Cj nr.45";
        inaltime = 1.64;
        greutate = 50.3f;
        gen = 'F';
        areRestanta = true;

        System.out.println(" Prezentarea studentului este:" + ' ' +  nume + ' ' + prenume + ' ' + varsta);
        System.out.println("Adresa studentului este: " + adresa);
        System.out.println("Inaltimea studentului este: " + inaltime);
        System.out.println("Studentul are restante? " + areRestanta);

        calculMedie(6,7);
        calculMedie(9,10);
        calculMedie3(10,1,9);
    }

    //facem  o metoda cu variabile locale

    public void calculMedie(double nota1, double nota2) {

        double medie = (nota1 + nota2) / 2;

        System.out.println("Media studentului este " + medie);
    }

    public void calculMedie3(double nota1, double nota2, double nota3) {
        double medie = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media studentului este " + medie);
    }

}
