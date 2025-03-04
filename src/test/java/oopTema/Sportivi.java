package oopTema;

public class Sportivi {

    public int varsta;
    public double inaltime;
    public double greutate;


    public Sportivi(int varsta, double inaltime, double greutate) {
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.greutate = greutate;
    }

    public void infoSportivi () {

        System.out.println("Sportivul are varsta: " + varsta);
        System.out.println("Sportivul are inaltimea: " + inaltime);
        System.out.println("Sportivul are greutatea: " + greutate);
    }
}
