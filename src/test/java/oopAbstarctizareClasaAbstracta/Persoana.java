package oopAbstarctizareClasaAbstracta;

public abstract class Persoana {

    //O clasa abstracta se recunoaste dupa cuvantul ABSTRACT
    //Clasa abstarcta poate sau nu sa contina metode abstarcte
    //O clasa abstarcta se mosteneste
    //Clasa care mpsteneste o clasa abstacta trebuie sa implementeze toate metodele abstarcte
    //O metoda abstacta trebuie sa contina cuvantul ABSTRACT
    //Metodela abstarcte pot sa fie publice/protected
    //O clasa abstracta poate sa implemneteze o interfata
    //O clasa abstarcta poate sa contina un constructor ==> NU putem face un obiect

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    //metode abstarcte pt un angajat
    public abstract void mergeLaMunca();
    public abstract void primesteSalariu();
    public abstract  void pauzeDeMasa();
    public abstract void mergeInCOncediu();

    public abstract void faceCurat();
    public abstract void mergeLaCUmparaturi();

    public abstract void mergeLaScoala();
    public abstract void isiFaceTemele();
    public abstract void mergeInPauza();


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
