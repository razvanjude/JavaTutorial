package abstractizareRestaurant;

public class RestaurantNonVegan extends restaurant implements NonVegan{


    public RestaurantNonVegan(String nume, String adresa, String program) {
        super(nume, adresa, program);
    }

    @Override
    public void ingredientaNonVegane() {
        System.out.println("Toate ingredientele sunt Non_vegane");
    }

    @Override
    public void tipCarne() {
        System.out.println("Avem o gama de produse doar cu carne ");

    }

    @Override
    public void tipPeste() {

        System.out.println("Avem o gama de peste ");

    }
}
