package oop;

public class Masina {

    //OOP concepte: Mostenire, incapsulare, polimorfism, abstractizare
    //Mostenire = conceptul prin care o clasa mosteneste o alta clasa
    //Clasa care mosteneste se nuemste clasa "copil"
    //Clasa care este mostenita se numeste clasa "parinte"
    //In Java o clasa poate mosteni doar o singura clasa
    //In momentul cand copilul mosteneste parintele trebuie sa apeleze constructorul din parinte cu super()
    //In momentul cand copilul mosteneste parintele copilul are access la variabile/metode din parinte(daca sunt publice/protected)

    //Incapsulare = conceptul prin care restrictionam unele variabile/metode in momentul cand ies din zone din care au fost declarate
    //Restrictionarea se poate face folosind ACCESS CONTROL de tipul: PRIVATE sau PROTECTED

    //Polimorfism = conceptul prin care o metoda poate suferi modificari la nivel de continut sau definitie
    //Polimorfismul este de 2 feluri: DInamic(override) si static(overload)
    //Polimorfismul dinamic = intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //Polimorfismul static = conceptul pe baza caruia o metoda poate fi definita in functie de numarul/tipul de parametri
    //Polimorfismul dinamic = se aplica in momentul in care avem o legatura parinte-copil
    //Polimorfismul static se aplica indiferent de circumstanta





    private String marca;
    private String model;
    private String culoare;
    private int an;
    private double pret;

    public Masina(String marca, String model, String culoare, int an, double pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.an = an;
        this.pret = pret;
    }

    public Masina(String marca, String model, String culoare, int an) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.an = an;
    }


    public void infoMasina () {

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Anul masinii este: " + an);
        if (pret != 0) {
            System.out.println("Pretu masinii este: " + pret);
        }
    }

    //polimorfism dinamic
    public void pornesteMasina() {
        System.out.println("Masina porneste cu cheie:  ");
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public double getPret() {
        return pret;
    }
}


