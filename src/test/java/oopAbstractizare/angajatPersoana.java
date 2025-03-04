package oopAbstractizare;

public class angajatPersoana extends Persoana implements Angajat{

    private String firma;
    private String experiante;
    private int salariu;

    public angajatPersoana(String nume, String prenume, int varsta, String firma, String experiante, int salariu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experiante = experiante;
        this.salariu = salariu;
    }

    public void infoAngajat () {
        infoPersoana();
        System.out.println("Firma la care lucreaza este: " + firma);
        System.out.println("Experianta angajatului este" + experiante);
        System.out.println("Salariu angajatului este: " + salariu);
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getExperiante() {
        return experiante;
    }

    public void setExperiante(String experiante) {
        this.experiante = experiante;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("ANgajatul merge la muncaaaa: ");

    }

    @Override
    public void primesteSalariu() {

    }

    @Override
    public void pauzeDeMasa() {

    }

    @Override
    public void mergeInCOncediu() {

    }
}
