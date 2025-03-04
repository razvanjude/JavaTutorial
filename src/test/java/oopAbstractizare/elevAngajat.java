package oopAbstractizare;

//o clasa poate impelmenta mai multe interfete
public class elevAngajat extends Persoana implements Elev,Angajat{

    private String scoala;
    private int clasa;
    private String firma;
    private String experiante;
    private int salariu;

    public elevAngajat(String nume, String prenume, int varsta, String scoala, int clasa, String firma, String experiante, int salariu) {
        super(nume, prenume, varsta);
        this.scoala = scoala;
        this.clasa = clasa;
        this.firma = firma;
        this.experiante = experiante;
        this.salariu = salariu;
    }

    public String getScoala() {
        return scoala;
    }

    public void setScoala(String scoala) {
        this.scoala = scoala;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
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

    @Override
    public void mergeLaScoala() {

    }

    @Override
    public void isiFaceTemele() {

    }

    @Override
    public void mergeInPauza() {

    }
}
