package oop;

import java.util.List;

public class RangeRover extends Masina {

    private List<String> dotariEXterioare;

    public RangeRover(String marca, String model, String culoare, int an, List<String>dotariExterioare) {
        super(marca, model, culoare, an);
        this.dotariEXterioare = dotariExterioare;
    }

    public RangeRover(String marca, String model, String culoare, int an, double pret, List<String> dotariExterioare) {
        super(marca, model, culoare, an, pret);
        this.dotariEXterioare = dotariExterioare;
    }



    public void infoRangeRover() {

        infoMasina();
        System.out.println("Dotarile exterioare sunt: " + dotariEXterioare);
    }

    //polimorfism dinamic
    public void pornesteMasina() {
        System.out.println("Masinile RangeRover pornesc automat ");
        //super.pornesteMasina();
    }

    //polimorfism static
    public void promotie() {

        System.out.println("Nu avem promotii disponibile ");
    }

    public void promotie(int discount) {

        System.out.println("Va putem aplica un discount de " + discount + "%");
    }

    public void promotie(String cupon ) {

        System.out.println("Va putem aplica urmatorul cupon " + cupon );
    }



    public List<String> getDotariEXterioare() {
        return dotariEXterioare;
    }

    public void setDotariEXterioare(List<String> dotariEXterioare) {
        this.dotariEXterioare = dotariEXterioare;
    }
}
