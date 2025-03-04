package obiectConstructor;

public class Student {

    //Constructor = are ca rol sa initializeze variabilele unei clase
    //Intr-o clasa recunaostem un constructor ca fiind o metoda publica care are exact acelasi nume cu clasa
    //Pentru moment un constructor este public (poate sa fie si privat - singletone)
    // Intr-o clasa putem avea mai multi construtori diferentiati prin numarul sau tipul de parametri
    //Exista 2 tipuri de constructori: DEFAULT (este in fiecare clasa fara sa il definim noi) si cu parametri
    //Daca avem un parametru in constructor care are acelasi nume cu o variabila din clasa => le initalizam folosind THIS

    //Obiect = instanta unei clase
    //Dintr-o clasa putem defini o multime de obiecte
    //Aceste obiecte de diferentiaza prin numele lor
    //In momentul cand se initializeaza un obiect  se apeleaza constructorul din clasa acestuia
    //Un obiect se initializeaza prin folosirea lui "NEW"
    //In momentul cand se creeaza un obiect se aloca un spatiu dedicat in memorie pentru acesta care are structura clasei


    public String nume;
    public String prenume;
    public int varsta;
    public String facultate;
    public int an;

    //facem constructorul Se face cu click Dreapta-->Generate-->Constructor
    public Student(String nume, String prenume, int varsta, String facultate, int an) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.facultate = facultate;
        this.an = an;
    }

    public Student(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void prezentareaStudentului () {

        System.out.println("Numele studentului este: " + nume);
        System.out.println("Prenumele studentului este: " + prenume);
        System.out.println("Varsta studentului este: " + varsta);

        if (varsta > 35) {
            // daca varsta depaseste 35 intra ca studentul nu mai poate sa faca facultate
            System.out.println("Studentul nu mai are voie la faculta: ");
        } else if (facultate != null) {
            System.out.println("Facultatea studentului este: " + facultate);
            System.out.println("Anul studentului este: " + an);
        }


    }



}



















