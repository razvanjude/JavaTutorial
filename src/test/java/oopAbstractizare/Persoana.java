package oopAbstractizare;

public class Persoana {

    //Abstractizare = conceptul prin care putem defini comportamentul unei clase
    //Abstarctizarea se face prin 2 feluri: folosinf INTERFETE sau CLASE ABSTRACTE
    //O interfata contine doar metode abstracte (metode care nu au body)
    //Recunoastem o interfata oe baza cuvantuui INTERFACE
    //Toate metodele din interfata sunt publice
    //O interfata nu poate sa contina un constructor => nu putem face un obiect
    //O interfata se IMPLEMNETEAZA
    //O clasa poate sa implemneteze o interfata => trebuie sa implementeze toate metodele din interfata
    //O lasa poate implementa mai multe interfete
    //O interfata poate extinde o alta interfata
    //O clasa abstracta poate implemneta o interfata insa interfata nu poate extinde o clasa abstracta

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana() {

        System.out.println("Numele este: " + nume);
        System.out.println("Prenumele este: " + prenume);
        System.out.println("Varsta este: " + varsta);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
