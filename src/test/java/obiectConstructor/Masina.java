package obiectConstructor;

public class Masina {

    public String marca;
    public String motorizare;
    public int an;
    public int pret;
    public String model;

    public Masina(String marca, String motorizare, int an, int pret, String model) {
        this.marca = marca;
        this.motorizare = motorizare;
        this.an = an;
        this.pret = pret;
        this.model = model;
    }

    public Masina(String marca, String motorizare, int an, String model) {
        this.marca = marca;
        this.motorizare = motorizare;
        this.an = an;
        this.model = model;
    }

    public void afiseazaDetalii() {
        System.out.println("Marca este: " + marca);
        System.out.println("Motorizarea este: " + motorizare);
        System.out.println("Modelul este: " + model);
        System.out.println("An fabricație: " + an);


        if(pret != 0) {
            System.out.println("Prețul este: " + pret);
        }
    }

}
